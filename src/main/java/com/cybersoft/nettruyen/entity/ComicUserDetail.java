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
	private long id;

	// private long idUser;
	@ManyToOne
	@JoinColumn(name = "id_user")
	Users users;

//	@Column(name = "id_comic")
//	private long idComic;

	@ManyToOne
	@JoinColumn(name = "id_comic")
	Comic comic;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Comic getComic() {
		return comic;
	}

	public void setComic(Comic comic) {
		this.comic = comic;
	}
	
	
}
