package fct.kln.studntattend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="class")
@Data
public class ClassEntity {

	@Id
	@Column(name="classid",columnDefinition = "char")
	private String classid;
	
	@ManyToOne
	@JoinColumn(name="classteacher",referencedColumnName = "tid",columnDefinition = "char")
	private Teacher classteacher;
	
}
