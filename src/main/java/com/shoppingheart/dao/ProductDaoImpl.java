package com.shoppingheart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.shoppingheart.dto.ProductDetails;

import javassist.compiler.ast.Symbol;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<ProductDetails> search(String name) {

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		String hql = "from ProductDetails where productName like ?1";
		Query query = session.createQuery(hql);
		query.setParameter(1, "%" + name + "%");
		List<ProductDetails> details = (List<ProductDetails>) query.getResultList();
		System.out.println(details.isEmpty());
		System.out.println(details.size());
		return details;
	}

	@Override
	public boolean add(ProductDetails details) {
		System.out.println("Register using openSession()");

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(details);
		transaction.commit();
		session.close();
		return true;

	}

}
