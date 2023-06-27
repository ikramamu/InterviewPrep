//package webinteraction.base.pages;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//public class basePageClass implements SauceLabsPage {
//
//	
//	public basePageClass(WebDriver driver) {
//		System.out.println("----------------------BasePage---------------------------");
//		this.driver = driver;
//		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//	}
//
//	public void click(By locator) {
//		// TODO Auto-generated method stub
//		System.out.println("************click on a element***********");
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		element.click();
//	}
//
//	public void enterText(By locator, String input) {
//		// TODO Auto-generated method stub
//		System.out.println("enter text element");
//		driver.findElement(locator).sendKeys(input);
//	}
//
//	public void goTo(String url) {
//		driver.get(url);
//		
//	}
//	public void quit() {
//		driver.quit();
//	}
//	public void scroll(By locator) {
//		Actions action = new Actions(driver);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		action.scrollToElement(element).perform();
//	}
//
//	public void takeScreenshot() {
//		// TODO Auto-generated method stub
//		Date d = new Date();
//		String reportFolderName = d.toString().replaceAll(":", "-");
//		String screenshotFile = d.toString().replaceAll(":", "-")+".png";
//		String basePath =  System.getProperty("user.dir")+"//reports";
//		String screenshotFolderPath = basePath+"//"+reportFolderName+"//Screenshots//";
//		String reportFolderPath = basePath+reportFolderName;
//		File f = new File(screenshotFolderPath);
//		f.mkdirs();
//		
//		File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(fileSrc, new File(screenshotFolderPath+screenshotFile));
//			//Put a screenshot in a report
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//System.out.println(folderName);
//	}
//
//	public void openBrowser(String url) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void goToLoginPage() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void gotToInventoryPage() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void goToCartPage() {
//		// TODO Auto-generated method stub
//		
//	} 
//
//}
