package com.yearupc12studentsapi.studentapi.services;
import com.yearupc12studentsapi.studentapi.model.Student;

import com.yearupc12studentsapi.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//business logic
@Service
public class StudentService {
//CRUD- Create Read Update Delete
    @Autowired
    private StudentRepository studentRepository;


    //add student
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    //get all students
    public ResponseEntity<Iterable<Student>> getAllStudents(){
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    //i want to get a student based on their id
    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }
    //delete a student
    public void deleteStudentById(Long id) {
         studentRepository.deleteById(id);
    }

    public void updateStudent(Long id,Student student){
        studentRepository.save(student);
    }

}
