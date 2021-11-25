package com.mvn.proj;

import org.testng.annotations.Test;

public class PriorityPrg {
  @Test(priority = -2)
  private void SearchPhone() {
	  System.out.println("SearchPhone");
  }
  @Test(priority = 3)
  private void Laptop() {
	  System.out.println("Laptop");
  }
  @Test
  private void SearchTravel() {
	  System.out.println("Search Travel");
  }
  @Test(priority =-1)
  private void Grocery() {
	  System.out.println("Grocery");
  }
}
