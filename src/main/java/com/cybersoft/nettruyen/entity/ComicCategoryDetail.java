package com.cybersoft.nettruyen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "comic_category_detail")
public class ComicCategoryDetail {
//	private long idComic;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne()
	@JoinColumn(name = "idComic")
	Comic comic;

//	private int idCategory;

	@ManyToOne()
	@JoinColumn(name = "idCategory")
	ComicCategory comicCategory;
}
