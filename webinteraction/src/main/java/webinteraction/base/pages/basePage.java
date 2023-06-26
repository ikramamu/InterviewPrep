package webinteraction.base.pages;

import org.openqa.selenium.By;

public interface basePage {
	
	public void click(By locator);
	public void enterText(By locator, String input);
	public void goTo(String url);
	public void takeScreenshot();

}
