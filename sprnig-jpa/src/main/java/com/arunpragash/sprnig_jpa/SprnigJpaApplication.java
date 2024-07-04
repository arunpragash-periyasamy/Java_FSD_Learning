package com.arunpragash.sprnig_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arunpragash.sprnig_jpa.model.Student;
import com.arunpragash.sprnig_jpa.repo.StudentRepo;

@SpringBootApplication
public class SprnigJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SprnigJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		s1.setId(1);
		s1.setRollno(101);
		s1.setName("Arun");
		s1.setMarks(80.5f);

		Student s2 = context.getBean(Student.class);
		s2.setId(2);
		s2.setRollno(102);
		s2.setName("Pragash");
		s2.setMarks(90.5f);
		
		repo.save(s1);
	}

}
