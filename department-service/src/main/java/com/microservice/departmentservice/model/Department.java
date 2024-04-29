package com.microservice.departmentservice.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long departmentId;
    private String firstName;
    private String lastName;

    private List<Employee> employees = new ArrayList<>();

    public Department(Long departmentId, String firstName, String lastName) {
        this.departmentId = departmentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Department() {
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
