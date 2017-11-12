package com.naran.onlineshoping.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.naran.onlineshoping.dao.CategoryDao;
import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.domain.Product;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Category> findAll() {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Category");
		List<Category> categories = query.list();
		
		return categories;
	}

	public Category getCategoryById(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Category C WHERE C.id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		Category category = (Category) query.uniqueResult();
		return category;
	}

}
