package com.shankrish.crudmysqlstudent.entity;

import jakarta.persistence.*;
import lombok.Data;

@NamedStoredProcedureQuery(
        name = "Employee.getEmployeesByDepartment",
        procedureName = "GetEmployeesByDepartment",
        resultClasses = Employee.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "dept", type = String.class)
        }
)
@Entity
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String department;
    private Double salary;

}

