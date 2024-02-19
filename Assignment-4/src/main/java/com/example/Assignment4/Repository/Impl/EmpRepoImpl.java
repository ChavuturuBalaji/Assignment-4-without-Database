package com.example.Assignment4.Repository.Impl;

import com.example.Assignment4.Model.Employee;
import com.example.Assignment4.Repository.EmpRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmpRepoImpl implements EmpRepo{

    private Map<Integer, Employee> employees;



    public EmpRepoImpl() {
        this.employees = new HashMap<>();
        dummyData();
    }


    @Override
    public Employee store(Employee emp) {
        employees.put(emp.getId(),emp);
        Employee e = employees.get(emp.getId());
        System.out.println(e);
         return e;
    }

    @Override
    public Employee updte(int id, Employee emp) {
        return employees.put(id,emp);
    }

    @Override
    public Employee get(int id) {
        return employees.get(id);
    }



    @Override
    public List<Employee> get() {
        System.out.println(employees);
        List<Employee> allEmployees = new ArrayList<>(employees.values());
//        System.out.println(allEmployees);
        return allEmployees;
    }

    @Override
    public Employee delete(int id) {
        return employees.remove(id);
    }

    @Override
    public void dummyData() {
        employees.put(1,new Employee(1,"Balaji","Dev",15000.00));
        employees.put(2,new Employee(1,"Abc","Dev",12000.00));
        employees.put(3,new Employee(1,"Xyz","Dev",15000.00));
    }
}
