package com.cinglevue.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cinglevue.dao.StudentResultDao;
import com.cinglevue.entity.StudentResults;

/**
 * class for student result entity dao methods
 * 
 */
@Repository
public class StudentResultDaoImpl implements StudentResultDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * Load student result DB call.
	 * 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<StudentResults> filterResult(final String query, final int maxResults, final int firstResult) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public List<StudentResults> doInHibernate(Session session) throws HibernateException, SQLException {
				Query q = session.createQuery(query);
				q.setMaxResults(maxResults);
				q.setFirstResult(firstResult);
				return q.list();
			}
		});
	}

}
