package com.microservice.departmentservice.model;

public record Employee(Long employeeId, Long DepartmentId, String firstName, String LastName, String position) {
}
