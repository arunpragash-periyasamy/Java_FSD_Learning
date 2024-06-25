package com.arunpragash.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.arunpragash.demo.model.Student;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into students(rollno, name, marks) VALUES (? , ? , ?)";
        int rows = jdbc.update(sql, student.getRollno(), student.getName(), student.getMarks());
        System.out.println(rows + " affected");
    }

    public List<Student> findAll() {
        String sql = "select * from students";
        return jdbc.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getFloat("marks"));
            student.setRollno(rs.getInt("rollno"));
            return student;
        });
    }
}
