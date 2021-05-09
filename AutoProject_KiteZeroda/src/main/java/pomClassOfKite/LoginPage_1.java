package pomClassOfKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_1 {

	@FindBy(xpath = "//input[@id='userid']") private WebElement userName;       
	@FindBy(xpath = "//input[@id='password']") private WebElement password;		
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginBtn;
	@FindBy(xpath = "//a[text()='Change user']") private WebElement login2;
	
	//Initialization
	
	public LoginPage_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Implementation
	public void setUserName(String userID) {
		userName.sendKeys(userID);           //enter userID
	}
	
	public void setPassword(String userPwd) {
		password.sendKeys(userPwd);           //enterPassword
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();                     //click on button
	}
	
	public void setloginAgain()
	{
		login2.click();                  //click On again login userID
	}

	
}
