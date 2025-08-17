package com.shankrish.crudmysqlstudent.repository;

import com.shankrish.crudmysqlstudent.entity.Employee;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Procedure(name = "Employee.getEmployeesByDepartment")
    List<Employee> getEmployeesByDepartment(@Param("dept") String dept);

}

