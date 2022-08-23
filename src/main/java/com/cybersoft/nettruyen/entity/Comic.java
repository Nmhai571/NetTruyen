package com.cybersoft.nettruyen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "comic")
public class Comic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "comic_name")
	private String comicName;
	@Column(name = "views")
	private long views;
	@Column(name = "description_comic")
	private String comicDescription;
	@Column(name = "content")
	private String content;
	@Column(name = "thumbnail")
	private String thumbnail;

//	private int idAuthor; //fk
	@ManyToOne()
	@JoinColumn(name = "idAuthor")
	Author author;

//	private int idComicStatus; // fk
	@ManyToOne()
	@JoinColumn(name = "idComicStatus")
	ComicStatus comicStatus;

	@OneToMany(mappedBy = "comic")
	private Set<Chapter> chapter;

	@OneToMany(mappedBy = "comic")
	private Set<ComicUserDetail> comicUserDetails;

	@OneToMany(mappedBy = "comic")
	private Set<ComicCategoryDetail> comicCategoryDetails;
}
