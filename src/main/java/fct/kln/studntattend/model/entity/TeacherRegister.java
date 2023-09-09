package fct.kln.studntattend.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="teacherregister")
public class TeacherRegister {
	
	@EmbeddedId
	TeacherRegisterId id;

}
