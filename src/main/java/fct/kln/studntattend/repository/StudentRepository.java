package fct.kln.studntattend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fct.kln.studntattend.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
