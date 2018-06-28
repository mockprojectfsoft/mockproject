package edu.fa.mock.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import edu.fa.mock.dao.CategoryDao;
import edu.fa.mock.service.CategoryService;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class DaoTest {

	@Autowired
	CategoryService categoryDao;

	@Test
	public void testSearch() {
		assertTrue(categoryDao.getList().size()>0);
	}

}
