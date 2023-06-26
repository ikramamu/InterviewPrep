package webinteraction.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webinteraction.base.pages.basePageClass;

public class testcaseOne {
	
	basePageClass bs;
	
	@BeforeMethod
	public void beforeTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		bs = new basePageClass(driver);
	}
	
//	@Test
//	public void dummyTest() {
//		//bs.goTo("https://demoqa.com/checkbox");
//		
//		//Navigate function enbles us to move forweard or backward
////		driver.navigate().to("https://demoqa.com/");
////		driver.navigate().back();
////		driver.navigate().forward();
////		driver.navigate().refresh();
//		
//		//Handle webelements under webelements
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='category-cards']//h5[contains(text(), 'Elements')]")));
////		System.out.println(elements);
////		elements.click();
////		Actions action = new Actions(driver);
////		action.click(elements).perform();
//		
//		//TextBoxPractice
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////		WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated();
////		textBox.click();
//		
//		
//
//	}
	@Test
	public void textBoxTest() {
		bs.goTo("https://demoqa.com/checkbox");
		bs.click(By.xpath("//span[contains(text(),'Text Box')]"));
		bs.takeScreenshot();
		bs.enterText(By.id("userName"), "mohammad ikram");
		bs.enterText(By.id("userEmail"), "mohdikram0410@gmail.com");
		bs.enterText(By.id("currentAddress"), "39 sixth street New Westminster");
		bs.enterText(By.id("permanentAddress"), "39 sixth street New Westminster");
		bs.click(By.xpath("//button[@id='submit']"));
	}

}
