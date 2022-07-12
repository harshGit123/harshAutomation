package kiteUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class UtilityProp 
{
		    
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
	Properties prop= new Properties();// created object of properties
	FileInputStream myfile= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\26thMarch-B Selenium\\myProperties.properties");
	prop.load(myfile);
	String value = prop.getProperty(key);
	return value;
	
	
	
}

	
	
	

}
