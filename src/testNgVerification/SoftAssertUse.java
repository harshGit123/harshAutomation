package testNgVerification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() 
  {
	  String a="abc";
	  String b="abc";
	  
	  
	  //to use soft assert we create object of soft assert
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a, b,"both are equal TC is failed");
	  soft.assertNull(b,"VAlue ois null,Tc is failed");
	  
	  
	  soft.assertAll();  
	  
	  	  
  }
  
  
  @Test
  public void testing()
  {
	  boolean a=true;
	  boolean b = false;
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertTrue(b,"value is falce Tc failed");
	  
	  s.assertFalse(a,"value is falce Tc failed");
	  
	 s.assertAll();
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
}
