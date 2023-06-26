package workdayinterview.practice;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(className = ("css-15yj3x7"))
	WebElement ModalContainer;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() {
		WebElement modelEmail = ModalContainer.findElement(By.xpath("//input[@data-automation-id='email']"));
		modelEmail.sendKeys("mohammadikramx@gmail.com");
	}
	public void enterPassword() {
		WebElement modelPassword = ModalContainer.findElement(By.xpath("//input[@data-automation-id='password']"));
		System.out.println(modelPassword);
		modelPassword.sendKeys("Test@1234");
	}
	public void clickLoginButton() {
		WebElement modelLoginButton = ModalContainer.findElement(By.xpath("//button[@data-automation-id='signInSubmitButton']"));
		System.out.println(modelLoginButton);
		Actions action = new Actions(driver);
		action.click(modelLoginButton).perform();
	}
	
//	@Test
//	public void login() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://workday.wd5.myworkdayjobs.com/Workday");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//button[@class='css-je3xk5']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement loginModalContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-15yj3x7")));
//		
//		WebElement modelEmail = loginModalContainer.findElement(By.xpath("//input[@data-automation-id='email']"));
//		System.out.println(modelEmail);
//		modelEmail.sendKeys("mohammadikramx@gmail.com");
//		WebElement modelPassword = loginModalContainer.findElement(By.xpath("//input[@data-automation-id='password']"));
//		System.out.println(modelPassword);
//		modelPassword.sendKeys("Test@1234");
//		WebElement modelLoginButton = loginModalContainer.findElement(By.xpath("//button[@data-automation-id='signInSubmitButton']"));
//		System.out.println(modelLoginButton);
//		Actions action = new Actions(driver);
//		action.click(modelLoginButton).perform();
//		
//		WebElement table = driver.findElement(By.tagName("ul"));
//		System.out.println(table);
//		List<WebElement> rows = table.findElements(By.tagName("li"));
//		
//		for(WebElement row : rows) {
//			System.out.println("ikram");
//			System.out.println(row.getText());
////			if(row.getText().contains("Canada"))
////				row.findElement(By.tagName("a")).click();
//		}
//		
//		
//		
//		
////		action.keyDown(Keys.CONTROL).click();
////		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
////		jsExe.executeScript("arguments[0].scrollIntoView(true);", modelLoginButton);
////		modelLoginButton.click();
//		//modelContentody.sendKeys("mohdikram0410@gmail.com");
////		driver.findElement(By.xpath("//input[@id='input-173']")).sendKeys("mohdikram0410@gmail.com");
//////		driver.findElement(By.xpath(""))
////	}
//	
//	@Test
//	public void jobSearch() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.workday.com/en-us/company/careers/overview.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("truste_popframe")));
//		driver.switchTo().frame(iframe);
//		driver.findElement(By.xpath("//a[contains(text(), 'Accept All')]")).click();
//		driver.switchTo().defaultContent();
//		
//		//Screenshots
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("C:\\Users\\12365\\Documents\\bitbucketlocal\\workdayinterview\\screens\\testscreenshot.png");
//		
//		try {
//			Files.copy(screenshot, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Explore Open Position')]//parent::a[1]")).click();
//		
//		String currentWindow = driver.getWindowHandle();
//		System.out.println(currentWindow);
//		Set<String> getAllWindows = driver.getWindowHandles();
//		
//		for(String windowhandle: getAllWindows) {
//			if(!windowhandle.equals(currentWindow)) {
//				driver.switchTo().window(windowhandle);
//				System.out.println(windowhandle);
//				break;
//			}
//		}
//		wait.until(ExpectedConditions.titleIs("Careers at Workday"));
//		System.out.println(driver.getTitle());
//		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@data-automation-id='jobResults']/ul")));
//		
//		List<WebElement> rows = table.findElements(By.tagName("li"));
//		
//		for(WebElement row: rows) {
//			//System.out.println(row.getText());
//			if(row.getText().contains("Quality"))
//				row.findElement(By.tagName("a")).click();
//		}
//		
//		
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		WebElement loginModalContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-15yj3x7")));
////		
////		WebElement modelEmail = loginModalContainer.findElement(By.xpath("//input[@data-automation-id='email']"));
////		System.out.println(modelEmail);
////		modelEmail.sendKeys("mohammadikramx@gmail.com");
////		WebElement modelPassword = loginModalContainer.findElement(By.xpath("//input[@data-automation-id='password']"));
////		System.out.println(modelPassword);
////		modelPassword.sendKeys("Test@1234");
////		WebElement modelLoginButton = loginModalContainer.findElement(By.xpath("//button[@data-automation-id='signInSubmitButton']"));
////		System.out.println(modelLoginButton);
////		Actions action = new Actions(driver);
////		action.click(modelLoginButton).perform();
////		
////		WebElement table = driver.findElement(By.tagName("ul"));
////		System.out.println(table);
////		List<WebElement> rows = table.findElements(By.tagName("li"));
////		
////		for(WebElement row : rows) {
////			System.out.println("ikram");
////			System.out.println(row.getText());
//////			if(row.getText().contains("Canada"))
//////				row.findElement(By.tagName("a")).click();
////		}
////		
////		
////		
////		
//////		action.keyDown(Keys.CONTROL).click();
////		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
////		jsExe.executeScript("arguments[0].scrollIntoView(true);", modelLoginButton);
////		modelLoginButton.click();
//		//modelContentody.sendKeys("mohdikram0410@gmail.com");
////		driver.findElement(By.xpath("//input[@id='input-173']")).sendKeys("mohdikram0410@gmail.com");
////		driver.findElement(By.xpath(""))
//	}
	
	
//	@Test
//	public void readFile() throws IOException {
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\12365\\Documents\\bitbucketlocal\\workdayinterview\\test.txt"));
//			String line;
//			int count=0;
//			while((line = br.readLine())!=null) {
//				String [] words = line.split(" ");
//				
//				for(String word: words) {
//					if(word.toLowerCase().equals("ikram"))
//						count++;
//					
//				}
//				
//					
//			}
//			System.out.println(count);
//				
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}