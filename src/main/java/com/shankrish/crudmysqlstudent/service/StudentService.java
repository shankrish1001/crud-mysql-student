package com.shankrish.crudmysqlstudent.service;

import com.shankrish.crudmysqlstudent.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student studentDetails);
    String deleteStudent(Long id);
}
