package fct.kln.studntattend.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterId implements Serializable{

	@ManyToOne
	@JoinColumn(name="studentid",referencedColumnName = "studentid")
	private Student studentid;
	
	
	@Column(name="persentday")
	private Timestamp presentday;
	
}
