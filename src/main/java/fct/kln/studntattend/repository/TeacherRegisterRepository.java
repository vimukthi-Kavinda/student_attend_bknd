package fct.kln.studntattend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fct.kln.studntattend.model.entity.TeacherRegister;
import fct.kln.studntattend.model.entity.TeacherRegisterId;

public interface TeacherRegisterRepository extends JpaRepository<TeacherRegister,TeacherRegisterId>{

}
