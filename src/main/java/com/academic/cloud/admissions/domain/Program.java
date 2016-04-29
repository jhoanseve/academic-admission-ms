package com.academic.cloud.admissions.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import com.academic.cloud.admissions.domain.enums.Status;

import lombok.Data;

/**
 * Entidad que representa los diferentes programas disponibles en la institucion
 * 
 * @author jhoanseve
 *
 */
@Data
@Entity
public class Program {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String code;
	private String name;
	private ProgramType programType;
	private Faculty facultad;
	private String codeSNIES;
	/** numero de semestres o creditos */
	private int duracion;
	private Status status;
}
