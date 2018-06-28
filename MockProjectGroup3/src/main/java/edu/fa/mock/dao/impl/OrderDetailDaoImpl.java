package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.OrderDetailDao;
import edu.fa.mock.model.OrderDetail;

@Transactional
@Component
public class OrderDetailDaoImpl extends DaoImplUtils<OrderDetail> implements OrderDetailDao{

}
