package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the empresas database table.
 * 
 */
@Entity
@Table(name="empresas")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Company.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa")
	private Integer companyID;

	@Column(name="cantidad_empleados")
	private Integer quantityEmployees;

	@Column(name = "direccion")
	private String address;

	private String email;

	private BigDecimal nit;

	@Column(name="nombre_empresa")
	private String nombreEmpresa;

	@Column(name="numero_verificacion")
	private Integer checkNit;

	@Column(name = "representante")
	private String legalRepresentative;

	@Column(name = "telefono")
	private BigDecimal cellPhone;

	public Company() {
	}

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public Integer getQuantityEmployees() {
		return quantityEmployees;
	}

	public void setQuantityEmployees(Integer quantityEmployees) {
		this.quantityEmployees = quantityEmployees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getNit() {
		return nit;
	}

	public void setNit(BigDecimal nit) {
		this.nit = nit;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Integer getCheckNit() {
		return checkNit;
	}

	public void setCheckNit(Integer checkNit) {
		this.checkNit = checkNit;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public BigDecimal getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(BigDecimal cellPhone) {
		this.cellPhone = cellPhone;
	}

	

}