package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.model.Department;
import com.microservice.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentContoller {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentContoller.class);
    private DepartmentRepository departmentRepository;

    public DepartmentContoller(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @PostMapping
    public Department addDepartment(@RequestParam Department department){
        LOGGER.info("Department add: {}", department);
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAllDepartments(){
        LOGGER.info("Department find");
        return departmentRepository.findAllDepartments();
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id){
        LOGGER.info("Department find: id={}", id);
        return departmentRepository.findById(id);
    }
}
