package com.cybersoft.nettruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.nettruyen.entity.Comic;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long> {

}
