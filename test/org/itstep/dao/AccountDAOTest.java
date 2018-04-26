package org.itstep.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.itstep.model.Account;
import org.junit.jupiter.api.Test;

class AccountDAOTest {

	@Test
	void testSave() {
		AccountDAO accDao = new AccountDAO();

		Account account = new Account("q", "Daniels","jj","qqqqq");

		accDao.save(account);
		assertNotNull(accDao.get("q").getPassword());
		accDao.delete(account);
	}

}


