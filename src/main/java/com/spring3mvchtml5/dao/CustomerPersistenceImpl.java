package com.spring3mvchtml5.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring3mvchtml5.vo.Customer;

@Repository("customerPersistence")
public class CustomerPersistenceImpl implements CustomerPersistence {

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerPersistenceImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> customerPersistenceOperations() {
		logger.debug(" ****** booksAuthorsPersistenceOperations *** START **** ");

		Session session = sessionFactory.getCurrentSession();
		Customer customer = new Customer(RandomUtils.generateRandomString(20),
				RandomUtils.generateRandomString(20),
				RandomUtils.generateRandomString(10) + "@gmail.com");
		session.save(customer);
		session.flush();
		Query createQuery = session.createQuery("from Customer");
		List<Customer> customers = (List<Customer>) createQuery.list();

		logger.debug(" ****** booksAuthorsPersistenceOperations *** END **** ");
		return customers;
	}

	@Override
	public Integer customerPersistenceDeleteOperations() {
		int executeUpdate = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			Query createQuery = session.createQuery("delete from Customer");
			executeUpdate = createQuery.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return executeUpdate;
	}

}
