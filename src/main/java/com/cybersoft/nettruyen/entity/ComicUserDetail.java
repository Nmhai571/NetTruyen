package com.cybersoft.nettruyen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "comic_user_detail")
public class ComicUserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// private long idUser;
	@ManyToOne()
	@JoinColumn(name = "idUser")
	Users users;

//	@Column(name = "id_comic")
//	private long idComic;

	@ManyToOne()
	@JoinColumn(name = "id_comic")
	Comic comic;
}
