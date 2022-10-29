package com.yearupc12studentsapi.studentapi.controllers;

import com.yearupc12studentsapi.studentapi.model.Student;
import com.yearupc12studentsapi.studentapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

   // @RequestMapping(method = RequestMethod.POST,value= "/students")
   @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
            studentService.addStudent(student);
    }
    //get all the students
    @GetMapping("/students")
    public ResponseEntity<Iterable<Student>> getAllStudents(){
       return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
       return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable Long id,@RequestBody Student student){
       studentService.updateStudent(id,student);
    }


}
