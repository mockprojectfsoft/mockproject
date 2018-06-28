package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.CategoryDao;
import edu.fa.mock.model.Category;

@Transactional
@Component
public class CategoryDaoImpl extends DaoImplUtils<Category> implements CategoryDao {

}
