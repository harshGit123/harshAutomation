package kitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePINPage 
{
	//1.datamember
	
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	

//2.constructor
   public KitePINPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
		
	//3.method

	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickOncontinueButton()
	{
       continueButton.click();	
	}

}











