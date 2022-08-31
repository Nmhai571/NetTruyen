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
	private String name;

	@Column(name = "views")
	private long views;

	@Column(name = "description_comic")
	private String description;

	@Column(name = "content")
	private String content;

	@Column(name = "thumbnail")
	private String thumbnail;

//	private int idAuthor; //fk
	@ManyToOne()
	@JoinColumn(name = "id_author")
	Author author;

//	private int idComicStatus; // fk
	@ManyToOne()
	@JoinColumn(name = "id_comic_status")
	Status status;

	@OneToMany(mappedBy = "comic")
	private Set<Chapter> chapter;

	@OneToMany(mappedBy = "comic")
	private Set<ComicUserDetail> comicUserDetails;

	@OneToMany(mappedBy = "comic")
	private Set<ComicCategoryDetail> comicCategoryDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Set<Chapter> getChapter() {
		return chapter;
	}

	public void setChapter(Set<Chapter> chapter) {
		this.chapter = chapter;
	}

	public Set<ComicUserDetail> getComicUserDetails() {
		return comicUserDetails;
	}

	public void setComicUserDetails(Set<ComicUserDetail> comicUserDetails) {
		this.comicUserDetails = comicUserDetails;
	}

	public Set<ComicCategoryDetail> getComicCategoryDetails() {
		return comicCategoryDetails;
	}

	public void setComicCategoryDetails(Set<ComicCategoryDetail> comicCategoryDetails) {
		this.comicCategoryDetails = comicCategoryDetails;
	}
	
	
}
