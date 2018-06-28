package edu.fa.mock.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import edu.fa.mock.dao.DaoUtils;

/**
 * @author baphu
 *
 * @param <E>
 */
@Transactional
@Repository
public abstract class DaoImplUtils<E> implements DaoUtils<E> {

	private Class<E> e;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DaoImplUtils() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) type;
		this.e = (Class) pt.getActualTypeArguments()[0];
	}

	@Autowired
	SessionFactory sessionFactory;

	/**
	 * @return current session
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/* (non-Javadoc)
	 * @see edu.fa.mock.dao.DaoUtils#getList()
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> getList() {
		return this.getCurrentSession().createCriteria(e).list();
	}

	/* (non-Javadoc)
	 * @see edu.fa.mock.dao.DaoUtils#create(java.lang.Object)
	 */
	
	public int create(E e) {
		return (int) this.getCurrentSession().save(e);
	}

	/* (non-Javadoc)
	 * @see edu.fa.mock.dao.DaoUtils#update(java.lang.Object)
	 */
	
	public void update(E e) {
		this.getCurrentSession().saveOrUpdate(e);
	}

	/* (non-Javadoc)
	 * @see edu.fa.mock.dao.DaoUtils#delete(java.lang.Object)
	 */
	
	public void delete(E e) {
		this.getCurrentSession().delete(e);
	}

	/* (non-Javadoc)
	 * @see edu.fa.mock.dao.DaoUtils#findOne(long)
	 */
	
	@SuppressWarnings("unchecked")
	public E findOne(long id) {
		return (E) this.getCurrentSession().get(this.e, id);
	}

}
