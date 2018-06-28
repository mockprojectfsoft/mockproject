package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.CustomerDao;
import edu.fa.mock.model.Customer;

@Transactional
@Component
public class CustomerDaoImpl extends DaoImplUtils<Customer> implements CustomerDao{

}
