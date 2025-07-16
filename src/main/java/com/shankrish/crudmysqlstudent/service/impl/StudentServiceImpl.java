package com.shankrish.crudmysqlstudent.service.impl;

import com.shankrish.crudmysqlstudent.entity.Student;
import com.shankrish.crudmysqlstudent.repository.StudentRepository;
import com.shankrish.crudmysqlstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setFirstname(studentDetails.getFirstname());
        student.setLastname(studentDetails.getLastname());
        student.setEmail(studentDetails.getEmail());
        student.setMobile(studentDetails.getMobile());
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Record deleted";
        } else {
            return "Record not found";
        }
    }

}
