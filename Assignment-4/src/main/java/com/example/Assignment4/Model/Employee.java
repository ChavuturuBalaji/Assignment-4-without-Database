package com.example.Assignment4.Model;

import org.springframework.stereotype.Component;

public class Employee {
    private int id;
    private String name;
    private String jobTitle;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public Employee(int id, String name, String jobTitle, double salary) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
