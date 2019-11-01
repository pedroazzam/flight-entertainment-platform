package com.immfly.jrbptest.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_CHANNEL")
public class Channel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="language")
	private String language;
	
	@Column(name="picture")
	private Byte picture;
	
	@OneToMany
	//@JoinColumn(name="subchannel_id")//IF DELETE THIS, HIBERNATE WILL CREATE OTHER TABLE WITH BOTH IDS
	private Set<Subchannel> subchannel;
	
	@OneToMany
	//@JoinColumn(name="content_id")//IF DELETE THIS, HIBERNATE WILL CREATE OTHER TABLE WITH BOTH IDS
	private Set<Content> content;

	public Set<Subchannel> getSubchannel() {
		return subchannel;
	}

	public void setSubchannel(Set<Subchannel> subchannel) {
		this.subchannel = subchannel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Byte getPicture() {
		return picture;
	}

	public void setPicture(Byte picture) {
		this.picture = picture;
	}

	
	
	
}
