package TestNG_Example_15;

import org.testng.annotations.Test;

public class DependanceTest_05 {

	   @Test(dependsOnMethods = { "OpenURl" })
	   public void A_Login() {
	      System.out.println("Method 1");
	   }

	   @Test
	   public void B_CreateUser() {
	      System.out.println("Method 2");	 
	   }

	   @Test
	   public void OpenURl() {
	      System.out.println("This is initEnvironmentTest");
	   }
}
