package com.narayan.onlineshopingbackendtest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.narayan.onlineshopingbackendtest.dao.CategoryDao;
import com.narayan.onlineshopingbackendtest.domain.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao{
	
	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category cat1 = new Category();
		cat1.setId(1);
		cat1.setName("Mobile");
		cat1.setDescription("Mobile Desc");
		cat1.setImageUrl("cat1>png");
		
		Category cat2 = new Category();
		cat2.setId(2);
		cat2.setName("TV");
		cat2.setDescription("TV Desc");
		cat2.setImageUrl("cat1>png");
		
		Category cat3 = new Category();
		cat3.setId(3);
		cat3.setName("Computer");
		cat3.setDescription("Mobile Desc");
		cat3.setImageUrl("cat1>png");
		
		categories.add(cat3);
		categories.add(cat2);
		categories.add(cat1);
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category getCategoryById(int id) {
		Category cat = null;
		for(Category c : categories) {
			if(c.getId() == id) {
				cat = c;
				break;
			}
		}
		
		return cat;
	}

}
