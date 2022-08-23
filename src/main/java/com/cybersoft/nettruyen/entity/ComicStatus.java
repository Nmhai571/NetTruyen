package com.cybersoft.nettruyen.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "comic_status")
public class ComicStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "status_name")
	private String statusName;
	@Column(name = "status_description")
	private String statusDescription;

	@OneToMany(mappedBy = "comicStatus")
	private Set<Comic> comic;

}
