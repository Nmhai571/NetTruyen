package com.cybersoft.nettruyen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "chapter")
public class Chapter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "chapter_name")
	private String chapterName;

	@Column(name = "chapter_description")
	private String chapterDescription;

	@Column(name = "source_comic")
	private String sourceComic;

	// private long idComic; fk
	@ManyToOne()
	@JoinColumn(name = "idComic")
	Comic comic;
}
