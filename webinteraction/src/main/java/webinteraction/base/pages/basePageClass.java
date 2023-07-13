package webinteraction.base.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import webinteraction.pages.normal.LoginPage;
import webinteraction.utility.XLReader;


public class basePageClass {
	
	//protected so subclasses can access the members
	protected WebDriver driver;
	Properties prop = new Properties();
	protected XLReader reader = new XLReader(System.getProperty("user.dir")+"//TestData.xlsx");
	
	@BeforeMethod
	public void setup() throws Exception {
		
		String path = System.getProperty("user.dir")+"//Config.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		System.out.println(prop.getProperty("browser"));
		openBrowser(prop.getProperty("browser"));

	}
	
	@AfterMethod
	public void quit() {
		if(driver != null)
			driver.quit();
	}
	
	
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		Date d = new Date();
		String reportFolderName = d.toString().replaceAll(":", "-");
		String screenshotFile = d.toString().replaceAll(":", "-")+".png";
		String basePath =  System.getProperty("user.dir")+"//reports";
		String screenshotFolderPath = basePath+"//"+reportFolderName+"//Screenshots//";
		//String reportFolderPath = basePath+reportFolderName;
		File f = new File(screenshotFolderPath);
		f.mkdirs();
		
		File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(fileSrc, new File(screenshotFolderPath+screenshotFile));
			//Put a screenshot in a report
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(folderName);
	}
	
	public void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
}
