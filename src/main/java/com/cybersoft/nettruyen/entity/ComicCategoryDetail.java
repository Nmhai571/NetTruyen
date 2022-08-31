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
	private long id;

	@ManyToOne
	@JoinColumn(name = "id_comic")
	Comic comic;

//	private int idCategory;

	@ManyToOne
	@JoinColumn(name = "id_category")
	Category comicCategory;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Comic getComic() {
		return comic;
	}

	public void setComic(Comic comic) {
		this.comic = comic;
	}

	public Category getComicCategory() {
		return comicCategory;
	}

	public void setComicCategory(Category comicCategory) {
		this.comicCategory = comicCategory;
	}
	
	
}
