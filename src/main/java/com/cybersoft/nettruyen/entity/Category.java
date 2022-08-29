package com.cybersoft.nettruyen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "comic_category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "category_name")
	private String name;

	@Column(name = "category_description")
	private String descriptiom;

	@OneToMany(mappedBy = "comicCategory")
	private Set<ComicCategoryDetail> comicCategoryDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptiom() {
		return descriptiom;
	}

	public void setDescriptiom(String descriptiom) {
		this.descriptiom = descriptiom;
	}

	public Set<ComicCategoryDetail> getComicCategoryDetails() {
		return comicCategoryDetails;
	}

	public void setComicCategoryDetails(Set<ComicCategoryDetail> comicCategoryDetails) {
		this.comicCategoryDetails = comicCategoryDetails;
	}
	
	
}
