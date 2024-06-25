package com.arunpragash.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arunpragash.demo.model.Student;
import com.arunpragash.demo.services.StudentService;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setId(1);
		student.setName("Arun");
		student.setRollno(101);
		student.setMarks(90);
		System.out.println(student);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);
		List<Student> students = service.getAllStudents();
		System.out.println(students);
	}

}
