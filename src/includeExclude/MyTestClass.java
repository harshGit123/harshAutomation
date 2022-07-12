package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  
  public void d()
  {
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


