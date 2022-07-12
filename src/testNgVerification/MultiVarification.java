package testNgVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiVarification {
  @Test
  public void myClass()
  {
	  
	  String a="Pune1";
	  String b="Pune";

	  Assert.assertNotEquals(a, b,"TC is failed values are equal");

	  Assert.assertNotNull(b, "TC is failed value is null");
	  
	  
	  
	  
	  
	  
	  
  }
}
