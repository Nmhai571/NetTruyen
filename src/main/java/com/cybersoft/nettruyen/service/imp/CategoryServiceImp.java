package com.cybersoft.nettruyen.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.nettruyen.entity.Category;
import com.cybersoft.nettruyen.repository.CategoryRepository;
import com.cybersoft.nettruyen.service.ICategoryService;

@Service
public class CategoryServiceImp implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void save(Category category) {
		categoryRepository.save(category);
	}
}
