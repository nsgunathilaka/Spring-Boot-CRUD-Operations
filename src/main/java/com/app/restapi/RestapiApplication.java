package com.app.restapi;

import com.app.restapi.model.Employee;
import com.app.restapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setFirstName("nihal");
		employee.setLastName("Gunathilaka");
		employee.setEmailId("nsg@gmail.com");
		employeeRepository.save(employee);
	}
}
