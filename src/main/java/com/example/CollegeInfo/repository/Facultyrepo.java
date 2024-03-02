package com.example.CollegeInfo.repository;

import com.example.CollegeInfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Facultyrepo extends JpaRepository<Faculty,Integer> {
    List<Faculty> findAllByCollegeId(int collegeId);
}
