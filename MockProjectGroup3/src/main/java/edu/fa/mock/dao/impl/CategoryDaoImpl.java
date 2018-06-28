package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.CategoryDao;
import edu.fa.mock.model.Category;

@Transactional
@Repository
public class CategoryDaoImpl extends DaoImplUtils<Category> implements CategoryDao {

}
