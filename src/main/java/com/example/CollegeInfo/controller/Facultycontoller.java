package com.example.CollegeInfo.controller;

import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class Facultycontoller {

    @Autowired
    public Facultyservice service;
    @PostMapping("/{collegeId}/faculties")
    public Faculty addFacultyToCollege(@RequestBody Faculty faculty) {
        return service.addFacultyToCollege(faculty);
    }
    @GetMapping("/{collegeId}/faculties")
    public List<Faculty> getAllFacultiesByCollegeId(@PathVariable int collegeId) {
        return service.getAllFacultiesByCollegeId(collegeId);
    }
}
