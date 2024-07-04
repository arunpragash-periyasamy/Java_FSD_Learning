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
		s1.setRollno(101);
		s1.setName("Arun");
		s1.setMarks(80.5f);

		Student s2 = context.getBean(Student.class);
		s2.setId(2);
		s2.setRollno(102);
		s2.setName("Pragash");
		s2.setMarks(90.5f);
		
		Student s3 = context.getBean(Student.class);
		s3.setId(3);
		s3.setRollno(103);
		s3.setName("Raghav");
		s3.setMarks(70.5f);

		// repo.save(s1);
		// repo.save(s2);
		// repo.save(s3);
		

		// repo.findAll().forEach(System.out::println);

		// Student s4 = repo.findById(1).get();

		// System.out.println(repo.findByName("Arun"));
		// System.out.println("\n\n\n");
		// System.out.println(repo.findByMarksGreaterThan(70.0f));
		// System.out.println("\n\n\n");

		s3.setRollno(105);
		s3.setName("Raghav");
		s3.setMarks(70.5f);
		//  updating the data 
		
		repo.save(s3);




		Student s5 = context.getBean(Student.class);
		s5.setId(5);
		s5.setRollno(102);
		s5.setName("Kanishkar");
		s5.setMarks(90.5f);

		repo.save(s5);
		repo.findAll().forEach(System.out::println);

		repo.delete(s5);


		repo.findAll().forEach(System.out::println);
	}

}
