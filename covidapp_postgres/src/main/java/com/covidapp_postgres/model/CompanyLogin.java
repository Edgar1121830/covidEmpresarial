package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the empresas_logins database table.
 * 
 */
@Entity
@Table(name="empresas_logins")
public class CompanyLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "EmpresasLogin.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa_login")
	private Integer companyLoginID;

	private Integer estado;

	@Column(name="fecha_creacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Column(name="fecha_retiro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentProDate;

	@Column(name="id_empresa")
	private Integer companyID;

	@Column(name="id_login")
	private Integer idLogin;

	public CompanyLogin() {
	}

	public Integer getCompanyLoginID() {
		return companyLoginID;
	}

	public void setCompanyLoginID(Integer companyLoginID) {
		this.companyLoginID = companyLoginID;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getPaymentProDate() {
		return paymentProDate;
	}

	public void setPaymentProDate(Date paymentProDate) {
		this.paymentProDate = paymentProDate;
	}

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public Integer getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}

	


}