package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test
  
  public void x()
  {
	  Reporter.log("d is running",true);
  }
  @Test
  public void y()
  {
	  Reporter.log("b is running",true);
  }
  @Test
  public void z()
  {
	  Reporter.log("v is running",true);
  }
  }

