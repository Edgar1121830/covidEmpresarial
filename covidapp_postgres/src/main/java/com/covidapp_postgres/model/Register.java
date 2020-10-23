package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the registros database table.
 * 
 */
@Entity
@Table(name="registros")
public class Register implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL= "Register.FIND_ALL";
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_registro")
	private Integer registerID;

	@Column(name="fecha_ingreso")
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate;

	@Column(name="fecha_salida")
	@Temporal(TemporalType.TIMESTAMP)
	private Date exitDate;

	@Column(name="id_empresa")
	private Integer companyID;

	@Column(name="id_enfermedad")
	private Integer diseaseID;

	@Column(name="id_persona")
	private Integer personID;

	@Column(name = "ingreso")
	private Boolean ingress;

	@Column(name = "sintomas")
	private Boolean symptom;

	@Column(name = "temperatura")
	private Integer temperature;

	public Register() {
	}

	public Integer getRegisterID() {
		return registerID;
	}

	public void setRegisterID(Integer registerID) {
		this.registerID = registerID;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public Integer getDiseaseID() {
		return diseaseID;
	}

	public void setDiseaseID(Integer diseaseID) {
		this.diseaseID = diseaseID;
	}

	public Integer getPersonID() {
		return personID;
	}

	public void setPersonID(Integer personID) {
		this.personID = personID;
	}

	public Boolean getIngress() {
		return ingress;
	}

	public void setIngress(Boolean ingress) {
		this.ingress = ingress;
	}

	public Boolean getSymptom() {
		return symptom;
	}

	public void setSymptom(Boolean symptom) {
		this.symptom = symptom;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}


}