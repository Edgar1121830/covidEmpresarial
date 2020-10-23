package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL= "Person.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Integer personID;

	@Column(name = "documento")
	private String document;

	private String email;

	@Column(name = "estatura")
	private Integer height;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "genero")
	private Integer  gender;

	@Column(name="grupo_sangineo")
	private String rhBlood;

	@Column(name="lugar_nacimiento")
	private Integer birhtPlace;

	@Column(name = "peso")
	private Integer weight;

	@Column(name="primer_apellido")
	private String lastName;

	@Column(name="primer_nombre")
	private String firstName;

	@Column(name="segundo_apellido")
	private String lastName2;

	@Column(name="segundo_nombre")
	private String middleName2;

	@Column(name = "telefono")
	private BigDecimal cellPhone;

	@Column(name="tipo_documento")
	private Integer documentTypeID;

	public Person() {
	}

	public Integer getPersonID() {
		return personID;
	}

	public void setPersonID(Integer personID) {
		this.personID = personID;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getRhBlood() {
		return rhBlood;
	}

	public void setRhBlood(String rhBlood) {
		this.rhBlood = rhBlood;
	}

	public Integer getBirhtPlace() {
		return birhtPlace;
	}

	public void setBirhtPlace(Integer birhtPlace) {
		this.birhtPlace = birhtPlace;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getMiddleName2() {
		return middleName2;
	}

	public void setMiddleName2(String middleName2) {
		this.middleName2 = middleName2;
	}

	public BigDecimal getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(BigDecimal cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Integer getDocumentTypeID() {
		return documentTypeID;
	}

	public void setDocumentTypeID(Integer documentTypeID) {
		this.documentTypeID = documentTypeID;
	}
	
	


}