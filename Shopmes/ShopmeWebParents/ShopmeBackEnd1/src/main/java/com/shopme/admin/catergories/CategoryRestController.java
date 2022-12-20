package com.shopme.admin.catergories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController 
{
	@Autowired
	protected CategoryService service;
	
	@PostMapping("/catergories/check_unique")
	public String checkUnique(@Param("name") String name)
	{
		return service.checkUnique(name);
	}
	
}
