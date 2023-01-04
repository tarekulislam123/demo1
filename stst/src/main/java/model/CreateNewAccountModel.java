package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountModel extends BaseModel {
	

	
	 public CreateNewAccountModel (WebDriver driver) {
		 super (driver);
	 }
     
	 public WebElement getFirstName() throws InterruptedException{
		 Thread .sleep(2000);
		 // you have to use webdriverwait concept.
		 WebElement e= driver.findElement(By.xpath("//input[@name='firstname']"));
		 return e;
	 }

	 public WebElement getLastname() throws InterruptedException{
	 Thread .sleep(2000);
	 WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
	 return e;
	 
	 }

	 public WebElement getEmail() throws InterruptedException{
	 Thread .sleep(2000);
	 WebElement e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	 return e;
	 }
	 public WebElement getReEmail() throws InterruptedException {
		 Thread.sleep(2000);
		 WebElement e = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		 return e;
		 
	 }
	 public WebElement getPassword() throws InterruptedException {
		 Thread.sleep(2000);
		 WebElement e= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		 return e;
		 
	 }
	 public WebElement getDOBMonth() throws InterruptedException {
		 Thread.sleep(2000);
		 WebElement e = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 return e;
		 
	 }
	  public WebElement getDOBDay() throws InterruptedException {
		  Thread.sleep(2000);
		  WebElement e = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		  return e;
		  
	  }
	  public WebElement getDOBYear() throws InterruptedException {
		  Thread.sleep(2000);
		  WebElement e = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		  return e;
	  }
	  public WebElement getGender(String gender) throws InterruptedException {
		  Thread.sleep(2000);
		  WebElement e = null;
		  if (gender.equalsIgnoreCase("Female")) {
			  e= driver.findElement(By.xpath("//input[@value='1']"));
			  
		  } else if (gender.equalsIgnoreCase("Male")) {
			  e =driver.findElement(By.xpath("//input[@value='2']"));
		  }else {
			  e = driver .findElement(By.xpath("//input[@value='-1']"));
			  }
		  return e;
	  }
}