package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.ProductDao;
import edu.fa.mock.model.Products;

@Transactional
@Component
public class ProductDaoImpl extends DaoImplUtils<Products> implements ProductDao{

}
