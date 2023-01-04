package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreateNewAccountPageTest extends BaseTest {
	
	@Test (dataProvider="fbSignup")
	public void createnewaccountPagetest(String firstname,String lastname,String email,String emailconfirm,String password,String month,String day,String year,String gender) throws InterruptedException {
		
		// home: click on create new account button.
		
		getHomePage();
		homepage.clickOnCreateNewAccountBtn();
		
		//createnewaccount: type firstname
		getCreateNewAccountPage();
		cnap.typeFirstName(firstname);
		cnap.typeLastName(lastname);
		cnap.typeEmail(email);
		cnap.typeReEmail(emailconfirm);
		cnap.typePassword(password);
		cnap.selectDOBMonth(month);
		cnap.selectDOBDay(day);
		cnap.selectDOBYear(year);
		cnap.selectGender(gender);
	}
	
	@DataProvider(name = "fbSignup")
	public Object [][]feedData() throws IOException{
		Object[][]t;
		
		String filename = "data/Fb.xlsx";
		String sheetname ="Signup";
		ExcelReader er = new ExcelReader (filename, sheetname);
		t = er.excelToArray();
		
		
		return t;
	}

}
