package com.student.student.repositories;

import com.student.student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author WIAM
 **/
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
    List<Student> findAllById(Integer id);
}
