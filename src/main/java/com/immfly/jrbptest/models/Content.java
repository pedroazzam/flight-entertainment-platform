package com.immfly.jrbptest.models;

import java.io.File;
import java.io.Serializable;
import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SUBCHANNEL")
public class Content implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="file")
	private File file;
	
	@Column(name="metadata")
	private String metadata;
	//private BasicFileAttributes metadata;
	
	@Column(name="rating")
	private DecimalFormat rating;
	
	

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

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	/*
	public BasicFileAttributes getMetadata() {
		return metadata;
	}

	public void setMetadata(BasicFileAttributes metadata) {
		this.metadata = metadata;
	}
	*/

	public DecimalFormat getRating() {
		return rating;
	}

	public void setRating(DecimalFormat rating) {
		this.rating = rating;
	}
	
	

}
