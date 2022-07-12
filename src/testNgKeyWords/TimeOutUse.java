package testNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut = 1000)
 
	  public void d() throws InterruptedException
      {Thread.sleep(1500);   //fail
		  Reporter.log("d is running",true);
	  }
  @Test
  public void b()
	  {
		  Reporter.log("b is running",true);
	  }
  @Test
  public void v()
	  {
		  Reporter.log("v is running",true);
	  }

  }

