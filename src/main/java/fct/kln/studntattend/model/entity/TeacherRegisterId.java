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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherRegisterId implements Serializable{

	@ManyToOne
	@JoinColumn(name="teacherid",referencedColumnName = "tid")
	private Teacher teacherid;
	
	
	@Column(name="persentday")
	private Timestamp presentday;
	
}
