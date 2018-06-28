package edu.fa.mock.service;

import java.util.List;

public interface ServiceUtils<E> {

	List<E> getList();

	int create(E e);

	void update(E e);

	void delete(E e);

	E findOne(long id);
}
