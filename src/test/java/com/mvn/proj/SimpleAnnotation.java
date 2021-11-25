package com.mvn.proj;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
  
	@BeforeSuite
	private void SetUp() {
		System.out.println("SetUp");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	private void enterUrl() {
		System.out.println("EnterUrl");
	}
   @BeforeMethod
   private void Login() {
	   System.out.println("Login");
   }
   @Test
   private void SearchMobile() {
	   System.out.println("SearchMobile");
   }
@Test
private void SearchLaptop() {
	System.out.println("Search Laptop");
}

@AfterMethod
private void verifyHomepage() {
	System.out.println("VerifyHomepage");
}

@AfterClass
private void logout() {
	System.out.println("Logout");
}

@AfterTest
private void closeBrowser() {
	System.out.println("CloseBrowser");
}
@AfterSuite
private void DeleteCookies() {
	System.out.println("Delete Cookies");
}


}








