package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateNewAccountPage;
import page.HomePage;

public class BaseTest {
	static WebDriver driver;
	static HomePage homepage;
	static CreateNewAccountPage cnap;
	@BeforeSuite
	public void setUp () {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver .get("http://www.facebook.com");
	}
	public void getHomePage() {
		homepage = new HomePage(driver);
	}
	
	public void getCreateNewAccountPage() {
		cnap = new CreateNewAccountPage(driver);
	}

}
