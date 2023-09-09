package fct.kln.studntattend.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="student")
@Entity
@Data
public class Student {

	@Id
	@Column(name="studentid",columnDefinition = "char")
	private String studentid;
	
	@Column(name="studentname")
	private String studentname;
	
	@Column(name="dob")
	private Date dob;
	
	
	@ManyToOne
	@JoinColumn(name="classid",referencedColumnName = "classid")
	private ClassEntity classid;
	
	
	@Column(name = "address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name="parentnic",referencedColumnName = "nic")
	private Parent parentnic;
	
	
	
	
	
}
