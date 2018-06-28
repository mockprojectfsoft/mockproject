package edu.fa.mock.dao;

import java.util.List;

/**
 * @author baphu
 *
 * @param <E>
 */
public interface DaoUtils<E> {
	
	 /**
	 * @return
	 */
	List<E> getList();
	 
	 /**
	 * @param e
	 * @return
	 */
	int create(E e);
	 
	 /**
	 * @param e
	 */
	void update(E e);
	 
	 /**
	 * @param e
	 */
	void delete(E e);
	 
	 /**
	 * @param id
	 * @return
	 */
	E findOne(long id);
	
}
