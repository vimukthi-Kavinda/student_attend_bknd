package fct.kln.studntattend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="parent")
@Data
public class Parent {
	
	@Id
	@Column(name="nic",columnDefinition = "char")
	private String nic;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;

	@Column(name="telno")
	private String telno;
	
	@Column(name="email")
	private String email;
}
