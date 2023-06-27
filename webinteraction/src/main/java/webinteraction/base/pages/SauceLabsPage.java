package webinteraction.base.pages;

public interface SauceLabsPage extends SauceLabsApp {
	
	//browser operations
	void openBrowser(String url);
	void quit();
	
	//application operations
	void goToLoginPage();
	void gotToInventoryPage();
	void goToCartPage();
	
	
	//validations operations

}
