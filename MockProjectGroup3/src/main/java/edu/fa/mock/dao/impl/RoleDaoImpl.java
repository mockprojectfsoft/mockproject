package edu.fa.mock.dao.impl;

import javax.management.relation.Role;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.RoleDao;

@Transactional
@Component
public class RoleDaoImpl extends DaoImplUtils<Role> implements RoleDao{

}
