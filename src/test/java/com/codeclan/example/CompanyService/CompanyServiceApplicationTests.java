package com.codeclan.example.CompanyService;

import com.codeclan.example.CompanyService.models.Department;
import com.codeclan.example.CompanyService.models.Project;
import com.codeclan.example.CompanyService.repositories.DepartmentRepository;
import com.codeclan.example.CompanyService.repositories.EmployeeRepository;
import com.codeclan.example.CompanyService.models.Employee;
import com.codeclan.example.CompanyService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyServiceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeDepartmentAndProject(){
		Department department = new Department("Ramen");
		departmentRepository.save(department);
		Employee employee = new Employee("Waga", "Mama", 100, department);
		employeeRepository.save(employee);
		Project project = new Project("Experimental Noodles", 30);
		project.addEmployee(employee);
		projectRepository.save(project);

	}

}
