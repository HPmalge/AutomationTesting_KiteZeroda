package pomClassOfKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyProfileName {
	
	//Declaration 
	
		@FindBy(xpath = "//div[@class='avatar']/span")  private WebElement profileName;

		// Initialization
		
		public VerifyProfileName(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Implementation
		public String verifyProfileName() {
			String actualProfileName = profileName.getText();  //get actual test of profileName
			return actualProfileName;
		}
		
		
}
