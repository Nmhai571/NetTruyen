package com.cybersoft.nettruyen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "author_name")
	private String name;

	@OneToMany(mappedBy = "author")
	private Set<Comic> comic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setAuthorName(String name) {
		this.name = name;
	}

	public Set<Comic> getComic() {
		return comic;
	}

	public void setComic(Set<Comic> comic) {
		this.comic = comic;
	}

}
