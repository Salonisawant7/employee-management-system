package com.ems.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee saveEmployee(Employee employee) {

        return repo.save(employee);
    }

    public List<Employee> getAllEmployees() {

        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return repo.findById(id).orElse(null);
    }

    public Employee updateEmployee(Long id, Employee employee) {

        Employee emp = repo.findById(id).orElse(null);

        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setDepartment(employee.getDepartment());
        emp.setPosition(employee.getPosition());
        emp.setSalary(employee.getSalary());
        emp.setDateOfJoining(employee.getDateOfJoining());

        return repo.save(emp);
    }

    public String deleteEmployee(Long id) {

        repo.deleteById(id);

        return "Employee Deleted Successfully";
    }
    public Page<Employee> getEmployeesWithPaginationAndSorting(
            int page,
            int size,
            String field) {

        Pageable pageable =
                PageRequest.of(page, size, Sort.by(field));

        return repo.findAll(pageable);
    }
    
}