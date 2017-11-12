package com.naran.onlineshoping.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.naran.onlineshoping.dao.ProductDao;
import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.domain.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> findAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
		session.flush();
		return product;
	}

	@Override
	public void save(Product p) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(p);
		session.flush();

	}

	@Override
	public void delete(Product p) {

		Session session = sessionFactory.getCurrentSession();

		session.delete(p);

		session.flush();

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> findProductsByCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM Product E WHERE E.category = :category";
		Query query = session.createQuery(hql);
		query.setParameter("category", category);
		List<Product> products = query.list();
		return products;
	}

}
