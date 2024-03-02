package com.example.CollegeInfo.service;

import com.example.CollegeInfo.model.College;
import com.example.CollegeInfo.model.Department;
import com.example.CollegeInfo.repository.Collegerepo;
import com.example.CollegeInfo.repository.Departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Departmentservice {
    @Autowired
    private Departmentrepo repo;

    public Department adddepartment(Department department) {
        return repo.save(department);
    }

    public Department getdepartment(int id) {
        return repo.findById(id).orElse(null);
    }
}
