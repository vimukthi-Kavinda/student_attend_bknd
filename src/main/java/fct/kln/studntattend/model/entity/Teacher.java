package fct.kln.studntattend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="teacher")
public class Teacher {
	
	
	
	@Id
	@Column(name="tid",columnDefinition = "char")
	private String tid;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name = "telno")
	private String telno;
	
	
	@Column(name="email")
	private String email;
	
	
	
	

}
