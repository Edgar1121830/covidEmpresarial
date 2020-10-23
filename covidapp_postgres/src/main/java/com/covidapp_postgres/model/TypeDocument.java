package com.covidapp_postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipos_documentos database table.
 * 
 */
@Entity
@Table(name="tipos_documentos")
public class TypeDocument implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL= "TypeDocument.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_documento")
	private Integer documentTypeID;

	@Column(name = "descripcion")
	private String description;

	public TypeDocument() {
	}

	public Integer getDocumentTypeID() {
		return documentTypeID;
	}

	public void setDocumentTypeID(Integer documentTypeID) {
		this.documentTypeID = documentTypeID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}