package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 3)
  public void myTest()
  {
	  Reporter.log("hi",true);
  }
  @AfterMethod
  public void test()
  {
	  Reporter.log("yooo",true);
  }
}
