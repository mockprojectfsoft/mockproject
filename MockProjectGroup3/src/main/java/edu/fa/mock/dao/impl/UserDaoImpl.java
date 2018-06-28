package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.UserDao;
import edu.fa.mock.model.Users;

@Transactional
@Component
public class UserDaoImpl extends DaoImplUtils<Users> implements UserDao{

}
