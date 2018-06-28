package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.OrdersDao;
import edu.fa.mock.model.Orders;

@Transactional
@Component
public class OrdersDaoImpl extends DaoImplUtils<Orders> implements OrdersDao{

}
