package com.shankrish.crudmysqlstudent.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private Integer age;
    private String email;
    private String mobile;

}
