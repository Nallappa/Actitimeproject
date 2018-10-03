package TestNG_Example_15;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Example_00 {
	
  @Test
  public void Tc_1() {
	  System.out.println("@Test Method 1");
  }
  

  @Test
  public void Tc_2() {
	  System.out.println("@Test Method 2");
  }
  
  public void test()
  {
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@afterSuite");
  }

}