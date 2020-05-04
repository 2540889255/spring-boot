package com.aynu.springboot.controller;

import com.aynu.springboot.dao.DepartmentDao;
import com.aynu.springboot.dao.EmployeeDao;
import com.aynu.springboot.entities.Department;
import com.aynu.springboot.entities.Employee;
import org.eclipse.jetty.server.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import javax.jws.WebParam;
import java.util.Collection;


@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao  employeeDao;

    @Autowired
    DepartmentDao departmentDao;
    //查询所有的列表
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees=employeeDao.getAll();
        //System.out.println(employee.getId());
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toaddPage(Model model){
        Collection<Department>  departments=departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public  String addEmp(Employee employee){
        employeeDao.save(employee);
        //ra.addFlashAttribute("employee",employee);
        System.out.println(employee.toString());
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id")Integer id, Model model){
        Employee employee=employeeDao.get(id);
        model.addAttribute("emp",employee);

        Collection<Department>  departments=departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println(employee.toString());
        return "redirect:/emps";
    }
    @PostMapping("/emp/{id}")
    public  String deleteEmployee(@PathVariable("id")Integer id){
        employeeDao.delete(id);
        return  "redirect:/emps";
    }




}
