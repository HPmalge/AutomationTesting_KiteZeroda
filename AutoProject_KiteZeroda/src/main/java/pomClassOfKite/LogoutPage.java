package pomClassOfKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
    @FindBy(xpath="//span[text()='KV']") private WebElement profilebtn;
	
	@FindBy(xpath="//a[@target='_self']") private WebElement logoutbtn;
	
	public LogoutPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}

	public void clickOnProfilebtn() {
		profilebtn.click();              //click on profile
	}
	

	public void clickonLogoutbtn() {
		logoutbtn.click();				//click on logout
	}

}
