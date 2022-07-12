package kitePOM;

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
	
	

	public void sendpin()
	{
		PIN.sendKeys("982278");
	}
	
	public void clickOncontinueButton()
	{
       continueButton.click();	
	}

}











