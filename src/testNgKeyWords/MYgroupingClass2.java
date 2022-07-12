package testNgKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MYgroupingClass2 {
  @Test(groups = {"Sanity"})
  public void p()
  {
	  //Assert.fail();
	  Reporter.log("P is running Sanity",true);
  }
  @Test(groups = {"Regression"})
  public void q()
  {
	  Reporter.log(" q is running Regression",true);
  }
  
  @Test(groups = {"Sanity"})
  public void r()
  {
	  Reporter.log("r is running Sanity",true);
  }
  @Test(groups = {"Regression"})
  public void s()
  {
	  Reporter.log("s is running Regression",true);
  }
}
