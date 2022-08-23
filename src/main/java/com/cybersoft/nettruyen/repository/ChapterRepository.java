package com.cybersoft.nettruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.nettruyen.entity.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

}
