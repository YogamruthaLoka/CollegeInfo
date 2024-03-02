package com.example.CollegeInfo.controller;

import com.example.CollegeInfo.model.College;

import com.example.CollegeInfo.service.Collegeservice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/colleges")
public class Collegecontroller {
    @Autowired
    private Collegeservice collegeservice;
    @PostMapping("/addcolleges")
    public List<College> addColleges(@RequestBody List<College> colleges){
        return collegeservice.addcolleges(colleges);
    }
    @GetMapping("/all")
    public List<College> getColleges(){
        return collegeservice.getColleges();
    }
    @GetMapping("/college/{id}")
    public College getcollegeById(@PathVariable int id){
        return (College) collegeservice.getCollegeById(id);
    }

    @PutMapping("/college/{id}")
    public College updatecollege(@PathVariable int id,@RequestBody College college) {
        return collegeservice.updatecollege(id, college);
    }
    @DeleteMapping("/college/{id}")
    public String deletecollege(@PathVariable int id){
        return collegeservice.deletecollege(id);
    }


}
