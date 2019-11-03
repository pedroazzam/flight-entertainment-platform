package com.immfly.jrbptask.models;

import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.MetaAttribute;

@Entity
@Table(name="TB_CONTENT")
public class Content implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="file")
	private File file;

	@Column(name="metadata")
	private MetaAttribute metadata;
	
	@Column(name="rating")
	private BigDecimal rating;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
		
	}

	public MetaAttribute getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaAttribute metadata) {
		this.metadata = metadata;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	
	

}
