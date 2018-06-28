package edu.fa.mock.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.model.Products;
import edu.fa.mock.service.ProductService;

@Service
public class ProductServiceImpl extends ServiceImplUtils<Products> implements ProductService{

}
