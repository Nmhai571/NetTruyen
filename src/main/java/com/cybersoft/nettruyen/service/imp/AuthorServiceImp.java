package com.cybersoft.nettruyen.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.nettruyen.entity.Author;
import com.cybersoft.nettruyen.repository.AuthorRepository;
import com.cybersoft.nettruyen.service.IAuthorService;

@Service
public class AuthorServiceImp implements IAuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public void save(Author author) {
		authorRepository.save(author);
	}
}
