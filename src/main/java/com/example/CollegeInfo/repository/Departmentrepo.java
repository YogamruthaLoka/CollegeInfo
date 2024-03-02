package com.example.CollegeInfo.repository;

import com.example.CollegeInfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Departmentrepo extends JpaRepository<Department,Integer> {
}
