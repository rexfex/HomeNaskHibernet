package org.itstep;

import java.sql.Time;
import java.time.LocalTime;

import org.itstep.dao.AccountDAO;
import org.itstep.dao.GoodActionDAO;
import org.itstep.model.Account;
import org.itstep.model.GoodAction;
import org.itstep.service.ClientImitator;
import org.itstep.service.Timer;
import org.openqa.selenium.WebDriver;

public class Runner {
	static ClientImitator imitator = new ClientImitator();
	static WebDriver driver;
	static AccountDAO accDao = new AccountDAO();
	public static void main(String[] args) {

		String[] login = { "jdfjfjf@mail.ru", "jdfjfjf1@mail.ru", "jdfjfjf2@mail.ru" };

		for (int i = 0; i < login.length; i++) {
			Account acc = new Account(login[i], "qwertyuiop", "qqq", "Tresssdtiy");
			accDao.save(acc);
//			driver = newLoginAndSaveDriver(acc);
//			imitator.addItemToWl(driver, acc.getLogin(), "B01IGO4A4S");
//			imitator.addItemToWl(driver, acc.getLogin(), "B01IGMTBEO");
//			imitator.addItemToCart(driver, acc.getLogin(), "B01IGMTBEO");
//			driver.close();
		}
		Account acc2 = new Account("jdfjfjf@mail.ru", "qqqqqqqqq", "qqq", "Tresssdtiy");	
accDao.update("jdfjfjf@mail.ru", acc2);
	}

	public static WebDriver newLoginAndSaveDriver(Account acc) {

		AccountDAO accDao = new AccountDAO();

		driver = imitator.registerAmazonAccount(acc);
		Timer.waitSeconds(5);
		if ((driver.getPageSource().contains("Hello, "))) {
			accDao.save(acc);
		} else {
			System.out.println("account not registred");
		}

		return driver;

	}
}
