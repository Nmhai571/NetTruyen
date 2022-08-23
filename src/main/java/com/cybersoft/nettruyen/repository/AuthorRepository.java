package com.cybersoft.nettruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.nettruyen.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
