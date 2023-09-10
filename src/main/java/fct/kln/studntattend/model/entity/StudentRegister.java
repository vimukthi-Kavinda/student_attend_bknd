package fct.kln.studntattend.model.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="studentregister")
public class StudentRegister implements Serializable{

	@EmbeddedId
	StudentRegisterId studentId;
	
	
}
