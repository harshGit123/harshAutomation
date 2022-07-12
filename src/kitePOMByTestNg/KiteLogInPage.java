package kitePOMByTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage 

{
	
	
	//1.data members/variable
	@FindBy(id = "userid")private WebElement username;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	//2.constructor
	
	public KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//3.methods

	
	public void sendUsername(String UserName) 
	{
		username.sendKeys(UserName);
	}
	
	
	public void sendPassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
}
