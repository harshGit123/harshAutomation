package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = -2)
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  @Test(priority=0)
  public void b()
  {
	  Reporter.log("b is running",true);
  }
  @Test(priority =-1)
  public void v()
  {
	  Reporter.log("v is running",true);
  }
}
