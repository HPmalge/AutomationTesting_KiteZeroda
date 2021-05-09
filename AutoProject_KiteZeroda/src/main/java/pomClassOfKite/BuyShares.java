package pomClassOfKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.OpenBrowser;

public class BuyShares extends OpenBrowser{
	

	@FindBy(xpath = "//input[@id='search-input']") private WebElement input;
	@FindBy(xpath = "//li[contains(@class,'search-result-item selected ')]")  private WebElement movearrow;
	@FindBy(xpath = "(//button[@class='button-blue'])[1]") private WebElement buy;
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement qty;
	@FindBy(xpath = "//button[@class='submit']") private WebElement buyQty;
	
	//WebDriver driver;
	public BuyShares (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setSearchInput(String ShareName) {
		input.sendKeys(ShareName);
	}
	
	Actions actionobj = new Actions(driver);
	
	public void ClickBuyBtn()
	{
		actionobj.moveToElement(movearrow).perform();
		actionobj.moveToElement(buy).click().perform();;
	}
	
	public void enterQty(String qty_1)
	{
		qty.sendKeys(qty_1);
		buyQty.click();
	}

}
