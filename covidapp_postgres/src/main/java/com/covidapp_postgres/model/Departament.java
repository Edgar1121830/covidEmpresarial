package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the departamentos database table.
 * 
 */
@Entity
@Table(name="departamentos")
public class Departament implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "Departament.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_departamento")
	private Integer departamentID;

	@Column(name = "nombre")
	private String name;

	public Departament() {
	}

	public Integer getDepartamentID() {
		return departamentID;
	}

	public void setDepartamentID(Integer departamentID) {
		this.departamentID = departamentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}