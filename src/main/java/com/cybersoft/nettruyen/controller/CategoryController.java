package com.cybersoft.nettruyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.nettruyen.entity.Category;
import com.cybersoft.nettruyen.service.ICategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;

	@PostMapping("save")
	public void save(@RequestBody Category category) {
		categoryService.save(category);
	}
}
