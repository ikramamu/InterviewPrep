package interviewActual;

import java.time.Duration;import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void testcase1() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.unibet.com/betting");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//WebElement modalcontainer  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("//div[@id='CybotCookiebotDialog']")));
		
		WebElement accepcookie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")));
		accepcookie.click();
		WebElement sports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Sports')]")));
		sports.click();
		
		WebElement aus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test-name='allSports-sportsItem-sportName' and @title='Australian Rules']")));
		aus.click();
		
		//get TItle
		String actual = driver.getTitle();
		String expected = "Australian Rules Football Odds & betting | Unibet Canada";
		Assert.assertEquals(actual, expected);
		
		
		}

}
