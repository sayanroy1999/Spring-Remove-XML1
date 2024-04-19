package com.example.demo14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo14Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo14Application.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student=context.getBean("firststudent", Student.class);
		System.out.println(student);
		student.study();
	}

}
