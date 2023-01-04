package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeModel extends BaseModel {
	
	public HomeModel (WebDriver driver) {
		super(driver);
	}
public WebElement getCreatNewAccountBtn() {
	WebElement e = driver .findElement(By.xpath("//*[text()='Create new account']"));
	return e;		
}
}
