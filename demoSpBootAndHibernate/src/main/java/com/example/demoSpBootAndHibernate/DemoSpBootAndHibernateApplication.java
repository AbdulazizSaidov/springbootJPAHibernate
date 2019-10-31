package com.example.demoSpBootAndHibernate;

import com.example.demoSpBootAndHibernate.model.Employee;
import com.example.demoSpBootAndHibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class DemoSpBootAndHibernateApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoSpBootAndHibernateApplication.class, args);
	}



}
