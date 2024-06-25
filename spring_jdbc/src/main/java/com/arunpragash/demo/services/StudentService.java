package com.arunpragash.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arunpragash.demo.model.Student;
import com.arunpragash.demo.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo repo;
    
    public StudentRepo getRepo() {
        return repo;
    }
    
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }
    
    public void addStudent(Student student) {
        repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
