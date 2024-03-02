package com.example.CollegeInfo.repository;

import com.example.CollegeInfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Collegerepo extends JpaRepository<College,Integer> {

}
