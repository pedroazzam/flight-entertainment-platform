package com.immfly.jrbptask.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private List<Subchannel> subchannel;
	
	@OneToMany
	private List<Content> content;

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	public List<Subchannel> getSubchannel() {
		return subchannel;
	}

	public void setSubchannel(List<Subchannel> subchannel) {
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
