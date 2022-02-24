package project;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HrDept {
@Parameters({"Key"})
/*	@Test(groups={"Smoke"})*/
	@Test
	public void Test3(int num) {
		System.out.println("Print");
		System.out.println(num);
	}
	
/*	@Test(dependsOnMethods= {"Test5"})*/
	@Test(dataProvider="Test6")
		public void bTest4(String a,String b,String c) {
			System.out.println("Check");

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	
	@Test(enabled=false)
	
	public void Test5() {
		System.out.println("Life");
	}
	
	
	@DataProvider
	public Object[][] Test6() {
		Object[][] ob=new Object[2][3];
		
		ob[0][0]="1st row1st column";
		ob[0][1]="1st row 2nd column";
		ob[0][2]="1st row 3rd column";
		
		ob[1][0]="2st row1st column";
		ob[1][1]="2st row 2nd column";
		ob[1][2]="2st row 3rd column";
		return ob;
		
	}
	}

