package com.yearupc12studentsapi.studentapi.repository;

import com.yearupc12studentsapi.studentapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {


}
