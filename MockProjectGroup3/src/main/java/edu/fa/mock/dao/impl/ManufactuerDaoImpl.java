package edu.fa.mock.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import edu.fa.mock.dao.ManufactuerDao;
import edu.fa.mock.model.Manufacturer;

@Transactional
@Component
public class ManufactuerDaoImpl extends DaoImplUtils<Manufacturer> implements ManufactuerDao{

}
