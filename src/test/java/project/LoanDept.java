package project;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoanDept {

	@AfterTest
	public void Test1(){
		System.out.println("Hello");
	}
	
	/* @Test(groups= {"Smoke"}) */
	@Test
	public void Test2() {
		System.out.println("Bye");
		/*Assert.assertTrue(false);*/
	}
}
