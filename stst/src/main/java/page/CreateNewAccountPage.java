package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel{
	
	public CreateNewAccountPage(WebDriver d) {
		super (d);
	}
	
	public void typeFirstName(String name) throws InterruptedException {
		WebElement e = getFirstName();
		e.clear();
		e.sendKeys(name);
		
	}
	public void typeLastName(String name) throws InterruptedException {
		WebElement e = getLastname();
		e.clear();
		e.sendKeys(name);
	}
	
	public void typeEmail(String email) throws InterruptedException {
		WebElement e = getEmail();
		e.clear();
		e.sendKeys(email);
	}
	
	public void typeReEmail(String email) throws InterruptedException {
		WebElement e = getReEmail();
		e.clear();
		e.sendKeys(email);
	}
	
	public void typePassword(String password) throws InterruptedException {
		WebElement e = getPassword();
		e.clear();
		e.sendKeys(password);
	}
	
	public void selectDOBMonth(String month) throws InterruptedException {
		WebElement e = getDOBMonth();
		Select drop = new Select(e);
		drop.selectByVisibleText(month);
	}
	
	public void selectDOBDay(String day) throws InterruptedException {
		WebElement e = getDOBDay();
		Select drop = new Select(e);
		drop.selectByVisibleText(day);
	}
	public void selectDOBYear(String year) throws InterruptedException {
		WebElement e = getDOBYear();
		Select drop = new Select(e);
		drop.selectByVisibleText(year);
	}

	public void selectGender(String gender) throws InterruptedException {
		WebElement e = getGender(gender);
		e.click();

	}


}
