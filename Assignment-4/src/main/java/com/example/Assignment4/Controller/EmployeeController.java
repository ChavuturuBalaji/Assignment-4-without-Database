package com.example.Assignment4.Controller;

import com.example.Assignment4.Model.Employee;
import com.example.Assignment4.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService empSer;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/add")
    public String add(ModelMap model){
        Employee employee = new Employee();
        model.put("employee",employee);
        return "add";
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete";
    }

    @RequestMapping("/update")
    public String update(){
        return "update";
    }

    @RequestMapping("/get")
    public String get(){
        return "get";
    }

    @RequestMapping("/updateDetails")
    public String updateDetails(@RequestParam("id") int id, ModelMap model){
        Employee empUp = empSer.getEmp(id);
        model.put("empUp",empUp);
        return "updateDetails";
    }

    @PostMapping("/Employee/update")
    public String Updated(@ModelAttribute("empUp")@RequestBody Employee employee,ModelMap model){
        Employee emp = empSer.getEmp(employee.getId());
        emp.setName(employee.getName());
        emp.setJobTitle(employee.getJobTitle());
        emp.setSalary(employee.getSalary());
        model.put("emp",emp);
        empSer.add(emp);
        return "updated";
    }


    @PostMapping("/store")
    public String addEmployee(@ModelAttribute("employee") Employee employee){
        empSer.add(employee);
        return "addresults";
    }

    @GetMapping("/Employee/get")
    public String getEmployee(@RequestParam("id") int id,ModelMap model){
        Employee getEmp = empSer.getEmp(id);
        model.put("getEmp",getEmp);
        return "singleEmployee";
    }

    @GetMapping("/Employee/delete")
    public String delete(@RequestParam("id") int id, ModelMap model){
        Employee delEmp = empSer.delete(id);
        model.put("delEmp",delEmp);
        return "delEmp";
    }

    @GetMapping("/all")
    public String getAll(ModelMap model){
        List<Employee> employees = empSer.getAll();
        model.put("employees",employees);
        return "getAll";
    }

}
