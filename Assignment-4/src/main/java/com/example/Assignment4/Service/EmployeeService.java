package com.example.Assignment4.Service;

import com.example.Assignment4.Model.Employee;
import com.example.Assignment4.Repository.Impl.EmpRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
   EmpRepoImpl empRepo;
   public Employee add(Employee employee){
       return empRepo.store(employee);
   }
   public Employee getEmp(int id){
       return empRepo.get(id);
   }
   public List<Employee> getAll(){
       List<Employee> employees = empRepo.get();
       return employees;
   }
   public Employee delete(int id){
       return empRepo.delete(id);
   }
   public Employee update(int id, Employee employee){
       return empRepo.updte(id,employee);
   }
}
