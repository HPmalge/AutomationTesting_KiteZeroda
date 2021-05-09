package kiteZeroda_TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UtilityClass.Utility;
import baseClass.OpenBrowser;
import pomClassOfKite.BuyShares;
import pomClassOfKite.LoginPage_1;
import pomClassOfKite.LoginPage_2;
import pomClassOfKite.LogoutPage;
import pomClassOfKite.VerifyProfileName;

public class TestCaseExecution_kite extends OpenBrowser {
	
	int TCid;
	LoginPage_1 login_1;
	LoginPage_2 login_2;
	VerifyProfileName profile;
	LogoutPage logout_1;
	BuyShares share;
	
	
	@BeforeClass
	public void open_Browser_1() throws InterruptedException, IOException
	{
		//openBrowser
		open_Browser(Utility.getPropertyfiledata("url_1"));   
		
		//create object of all POM class
		
		login_1 = new LoginPage_1(driver);    
		login_2 = new LoginPage_2(driver);    		 
		profile = new VerifyProfileName(driver); 
		logout_1 = new LogoutPage(driver);		
		share = new BuyShares(driver);			
		Thread.sleep(3000);
	}
	
	@BeforeMethod			//login credentials methods
	public void setLoginCredentials() throws IOException    
	{
		login_1.setUserName(Utility.getPropertyfiledata("userName"));
		login_1.setPassword(Utility.getPropertyfiledata("password"));
		login_1.clickOnLoginBtn();
		
		login_2.setPin(Utility.getPropertyfiledata("pin"));
		login_2.clickOnContinueBtn();
		
	}
	
	@Test(priority = 0)		//test case1 to verify actual and expected profile name method
	public void verifyProfile_Name() throws IOException
	{
		TCid = 001;
		String actTest = profile.verifyProfileName();
		String extText = Utility.getPropertyfiledata("profileName");  //enter expected Profile name
		
		Assert.assertEquals(actTest, extText, "actual and expected are different");
		
	}
	
	@Test(priority = 1)		//test case2 search one company share and buy a some quantity
	public void buyShares_1() throws IOException, InterruptedException
	{
		TCid = 002;
		share.setSearchInput(Utility.getPropertyfiledata("ShareName"));
		share.ClickBuyBtn();
		share.enterQty(Utility.getPropertyfiledata("quantity"));
		Thread.sleep(2000);
	}
	
	@AfterMethod				// logout kite zeroda
	public void logout()
	{
		logout_1.clickOnProfilebtn();
		logout_1.clickonLogoutbtn();
		login_1.setloginAgain();
	}
	
	
	@AfterClass						// close Browser
	public void closeBrowser()
	{
		driver.quit();
	}

}
