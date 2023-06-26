package workdayinterview;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import workdayinterview.practice.HomePage;
import workdayinterview.practice.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://workday.wd5.myworkdayjobs.com/Workday");
		HomePage homePage = new HomePage(driver);
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName();
		loginPage.enterPassword();
		loginPage.clickLoginButton();
	}
	

}
