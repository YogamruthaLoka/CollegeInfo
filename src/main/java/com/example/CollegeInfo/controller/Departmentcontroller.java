package com.example.CollegeInfo.controller;

import com.example.CollegeInfo.model.Department;
import com.example.CollegeInfo.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/departments")
public class Departmentcontroller {
    @Autowired
    public Departmentservice Service;
    @PostMapping("/{collegeId}/departments")
    public Department adddepartment(@RequestBody Department department)
    {
        return Service.adddepartment(department);
    }

    @GetMapping("/get/{id}")
    public Department getdepartment(@PathVariable int id)
    {
        return Service.getdepartment(id);
    }
    }

