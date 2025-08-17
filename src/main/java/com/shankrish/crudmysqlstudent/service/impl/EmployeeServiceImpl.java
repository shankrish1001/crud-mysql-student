package com.shankrish.crudmysqlstudent.service.impl;

import com.shankrish.crudmysqlstudent.entity.Employee;
import com.shankrish.crudmysqlstudent.repository.EmployeeRepository;
import com.shankrish.crudmysqlstudent.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public List<Employee> getByDepartment(String dept) {
        return employeeRepository.getEmployeesByDepartment(dept);
    }

}
