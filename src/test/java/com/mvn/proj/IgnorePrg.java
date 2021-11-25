package com.mvn.proj;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class IgnorePrg {

@Ignore
private void SearchPhone() {
	  System.out.println("SearchPhone");
}
@Test
private void Laptop() {
	  System.out.println("Laptop");
}
@Ignore
private void SearchTravel() {
	  System.out.println("Search Travel");
}

@Test
private void Grocery() {
	  System.out.println("Grocery");
}

}

