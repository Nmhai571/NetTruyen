package com.cybersoft.nettruyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybersoft.nettruyen.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
