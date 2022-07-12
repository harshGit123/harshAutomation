package testNgKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
  @Test
  public void d() {
	  Assert.fail();   //to fail method
	  Reporter.log("d is running",true);
  }
@Test(dependsOnMethods = {"d"},invocationCount=2)  //{"a","b"}u can give multiple ...
public void b()
  {                                                //.also use multiple key words
	  Reporter.log("b is running",true);
  }
@Test
public void v()
  {
	  Reporter.log("v is running",true);
  }

  }

