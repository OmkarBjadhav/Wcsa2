package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class FirstTestngClass {
 
  public void method2() 
  {
	  Reporter.log("method2 executed",true);  
  }
  @Test
  public void method3() 
  {
	 Reporter.log("method3 executed",true);
  }
  
  @Test
  public void method4() 
  {
	  int i=9;
	  int j=0;
	  int res=i/j;
	  System.out.println(res);
	  Reporter.log("method4 executed",true); 
  }
  @Test
  public void method5() 
  {
	 Reporter.log("method5 executed",true);
  }
  
  
}
