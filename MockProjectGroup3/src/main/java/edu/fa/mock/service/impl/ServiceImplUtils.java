package edu.fa.mock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.mock.dao.impl.DaoImplUtils;
import edu.fa.mock.service.ServiceUtils;

@Service
public abstract class ServiceImplUtils<E> implements ServiceUtils<E> {
	
	@Autowired
	DaoImplUtils<E> daoImplUtils;
	
	public List<E> getList() {
		return daoImplUtils.getList();
	}

	public int create(E e) {
		return daoImplUtils.create(e);
	}

	public void update(E e) {
		daoImplUtils.update(e);
	}

	public void delete(E e) {
		daoImplUtils.delete(e);
	}

	public E findOne(long id) {
		return daoImplUtils.findOne(id);
	}
}
