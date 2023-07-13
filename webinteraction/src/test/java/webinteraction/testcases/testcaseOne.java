package webinteraction.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import webinteraction.base.pages.basePageClass;
import webinteraction.pages.normal.CartPage;
import webinteraction.pages.normal.InventoryPage;
import webinteraction.pages.normal.LoginPage;

public class testcaseOne extends basePageClass {
	
	@Test
	public void loginTest() {
		String productName = reader.getCellData("testData1", "productName", 2);
		String productDes = reader.getCellData("testData1", "productDes", 2);
		String productPrice = reader.getCellData("testData1", "productPrice", 2);
		System.out.println(productName+" - "+productPrice);
		
		driver.get("https://www.saucedemo.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.clickSubmit();
		
		takeScreenshot();
		
		InventoryPage ip = new InventoryPage(driver);
		ip.validateTitle();
		ip.addItem("Sauce Labs Backpack");
		ip.validateHamburger();
		ip.validateCartIcon("1");
		ip.validateFilter();
		ip.goToCartPage();
		
		
		
		CartPage cp = new CartPage(driver);
		cp.validateTitle();
		takeScreenshot();
		
	}
}
