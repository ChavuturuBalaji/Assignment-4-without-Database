package com.example.Assignment4.Repository;


import com.example.Assignment4.Model.Employee;

import java.util.List;

public interface EmpRepo {
    public Employee store(Employee emp);
    public Employee updte(int id,Employee emp);
    public Employee get(int id);
    public List<Employee> get();
    public Employee delete(int id);
    public void dummyData();

}
