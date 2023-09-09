package fct.kln.studntattend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fct.kln.studntattend.model.entity.StudentRegister;
import fct.kln.studntattend.model.entity.StudentRegisterId;

public interface StudentRegistryRepository extends JpaRepository<StudentRegister, StudentRegisterId>{

}
