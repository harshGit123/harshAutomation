package testNgSelf;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void a()
  {    
  
	  System.out.println("a is running");
  }
 
  @BeforeTest
   public void b()
   {
	  System.out.println("go");
   }
}
