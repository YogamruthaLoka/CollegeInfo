package com.example.CollegeInfo.service;

import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.repository.Facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facultyservice {
    @Autowired
    public Facultyrepo repo;

    public Faculty addFacultyToCollege(Faculty faculty) {
        return repo.save(faculty);
    }

    public List<Faculty> getAllFacultiesByCollegeId(int collegeId) {
        return repo.findAllByCollegeId(collegeId);
    }

}
