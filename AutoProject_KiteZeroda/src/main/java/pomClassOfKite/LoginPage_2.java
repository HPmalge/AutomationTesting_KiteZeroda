package pomClassOfKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_2 {
	
	// DECLARTION
	@FindBy(xpath= "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']" ) private WebElement continueBtn;
	
	//Initalization
	
	public LoginPage_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Implementation
	
	public void setPin(String pinno) {
		pin.sendKeys(pinno);            //enter pin
	}
	
	public void clickOnContinueBtn() {
		continueBtn.click();			//click on button
	}
	
	
}
