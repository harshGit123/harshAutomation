package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//1.get-open an application
		driver.get("https://vctcpune.com/");
		    //2.close-close the current tab
	//driver.close(); *************
		   //3.quit-close all tablet
	//driver.quit();  **************
		//4.maximize or minimize the browser
		//driver.manage().window().maximize();***********
		driver.manage().window().minimize();
      
		//5.navigate-open=same as get method,forword,backword
		
		//driver.navigate().to("https://www.google.co.in/");
			
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//6.get title
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);
		
		//7.getCurrent url
		System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
