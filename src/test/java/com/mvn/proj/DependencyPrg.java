package com.mvn.proj;

import org.testng.annotations.Test;

public class DependencyPrg {

	
	@Test(dependsOnMethods = {"Test2"})
	private void Test1() {
		System.out.println("Type Test1");
	}
	
	@Test
	private void Test2() {
		System.out.println("Type Test2");
	}



}

