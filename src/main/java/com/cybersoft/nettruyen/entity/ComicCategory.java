package com.cybersoft.nettruyen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "comic_category")
public class ComicCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "category_name")
	private String categoryName;
	@Column(name = "category_description")
	private String categoryDescriptiom;
	
	@OneToMany(mappedBy = "comicCategory")
	private Set<ComicCategoryDetail> comicCategoryDetails;
}
