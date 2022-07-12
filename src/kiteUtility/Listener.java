package kiteUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
	BaseNew b=new BaseNew();
	//WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Congratulations your TC is Passed , passed Tc nsmr is"+result.getName(),true);
		
		
		
	}
    @Override
    public void onTestFailure(ITestResult result) {
    	
    	Reporter.log("sorry your tc failed"+result.getName(),true);
    	String name = result.getName();
    	try {
    		b.captureScreenshot(name);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
		
	}
    
    
    }  
	
	

