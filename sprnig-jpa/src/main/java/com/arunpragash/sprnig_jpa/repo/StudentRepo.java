package com.arunpragash.sprnig_jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arunpragash.sprnig_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
    
}
