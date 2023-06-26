package workdayinterview.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Session {
	
	WebDriver driver;
	
	void Session() {
		driver = new ChromeDriver();
	}
	
	public void takeScreenshot() {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\12365\\Documents\\bitbucketlocal\\workdayinterview\\screens\\testscreenshot.png");
		
		try {
			Files.copy(screenshot, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
