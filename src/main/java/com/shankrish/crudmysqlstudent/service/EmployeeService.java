package com.shankrish.crudmysqlstudent.service;

import com.shankrish.crudmysqlstudent.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getByDepartment(String dept);
}
