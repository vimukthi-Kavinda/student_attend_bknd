package fct.kln.studntattend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fct.kln.studntattend.model.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, String>{

}
