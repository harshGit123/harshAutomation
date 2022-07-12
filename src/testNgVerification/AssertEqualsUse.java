package testNgVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myClass() 
  {
	  
	  String a ="Pune";
	  String b ="Pune";
	  
	  
	  //Assert.assertEquals(a, b,"a and b value not matching TC failed");
	  //Reporter.log("a and b value  matching TC failed",true);
	  
	  Assert.assertNotEquals(a, b," a and b values are matching TC failed");
	  Reporter.log(" a and b values are not matching TC Passed",true);
  }
}
