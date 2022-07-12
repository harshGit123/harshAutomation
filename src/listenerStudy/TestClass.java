package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.ListnerClass.class)

public class TestClass {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("myMethod1 is Running",true);
  }
  @Test
  public void myMethod2() 
  {     Assert.fail();
	  Reporter.log("myMethod2 is Running",true);
  }
  @Test
  public void myMethod3() 
  {
	  Reporter.log("myMethod3 is Running",true);
  } @Test
  public void myMethod4() 
  {
	  Reporter.log("myMethod4 is Running",true);
  }
  
}
