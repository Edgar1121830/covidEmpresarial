package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the historicos_decretos database table.
 * 
 */
@Entity
@Table(name="historicos_decretos")
public class HistoricoDecree implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "HistoricoDecree.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_historico")
	private Integer historicID;

	@Column(name = "descripcion")
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_decreto")
	private Date decreeDate;

	@Column(name="id_ciudad")
	private Integer cityID;

	@Column(name="id_decreto")
	private Integer idDecree;

	private String url;

	public HistoricoDecree() {
	}

	public Integer getHistoricID() {
		return historicID;
	}

	public void setHistoricID(Integer historicID) {
		this.historicID = historicID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDecreeDate() {
		return decreeDate;
	}

	public void setDecreeDate(Date decreeDate) {
		this.decreeDate = decreeDate;
	}

	public Integer getCityID() {
		return cityID;
	}

	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}

	public Integer getIdDecree() {
		return idDecree;
	}

	public void setIdDecree(Integer idDecree) {
		this.idDecree = idDecree;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}