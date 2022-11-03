package Kodlama.io.Devs.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "technologies")
@AllArgsConstructor
@NoArgsConstructor
public class Technology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "technology_id")
	private int technologyId;

	@Column(name = "technology_name")
	private String technologyName;
	
	@JsonIgnore()
	@ManyToOne
	@JoinColumn(name="programming_language_id")
	private ProgrammingLanguage programmingLanguage;


}
