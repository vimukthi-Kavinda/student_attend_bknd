package fct.kln.studntattend.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="teacherregister")
public class TeacherRegister {
	
	@EmbeddedId
	TeacherRegisterId teacherRegisterId;

}
