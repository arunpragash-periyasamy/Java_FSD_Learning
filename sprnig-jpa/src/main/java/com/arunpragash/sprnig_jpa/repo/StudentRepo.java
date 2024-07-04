package com.arunpragash.sprnig_jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arunpragash.sprnig_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    
    @Query("select s from Student s where s.name=?1") // it is optional
    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(float mark);
}
