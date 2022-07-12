package testNgKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MYgroupingClass1 {
  @Test
  public void a()
  {
	  //Assert.fail();
	  Reporter.log("A is running",true);
  }
  
  @Test(groups = {"Regression"})
  public void b()
  {
	  Reporter.log("B is running Regression",true);
  }
  
  @Test(groups = {"Sanity"})
  public void c()
  {
	  Reporter.log("C is running Sanity",true);
  }
  @Test(groups = {"Regression"})
  public void d()
  {
	  Reporter.log("D is running Regression",true);
  }
}
