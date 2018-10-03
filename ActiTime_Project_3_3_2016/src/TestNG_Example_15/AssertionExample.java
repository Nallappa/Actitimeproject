package TestNG_Example_15;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {
  
	String Actualtext;
	 
	@BeforeClass
	 public void load_url(){
		 Actualtext = "Tuesday, 28 January 2014";
	 } 
	 //Method Example For Assertion
	 @Test
	  public void assertion_method_1() {
	  
	  Assert.assertEquals(Actualtext, "Tuesday, 28 January 2014");
	  System.out.print("\n assertion_method_1() -> Part executed");
	  
	  Assert.assertTrue(true, Actualtext);
	  Assert.fail("Failed-----------");
	  System.out.print("\n assertion_method_1() -> Part executed Failed");
	  Assert.assertFalse(true);
	 } 
	 
	 //Method Example For Assertion
	 @Test
	 public void assertion_method_2() {  
	  Assert.assertEquals(Actualtext, "Tuesday, 29 January 2014");
	  System.out.print("\n assertion_method_2() -> Part executed");
	 }
	 
	 //Method Example For Verification
	 @Test
	 public void verification_method() {
	  
	  String time = Actualtext;
	  
	  if (time == "Tuesday, 28 January 2014")
	  {
	   System.out.print("\nText Match");
	  }
	  else
	  {
	   System.out.print("\nText does Match");
	  }
	 }
}
