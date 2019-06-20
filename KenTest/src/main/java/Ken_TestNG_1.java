import org.testng.Assert;
import org.testng.annotations.Test;

public class Ken_TestNG_1 {

	@Test(priority = 1)
	
	
public static void doUserReg1() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered sucessfully");

	}
	
	
	
	public static void doUserReg() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered sucessfully");

	}
	@Test(priority = 2, dependsOnMethods = "doUserReg")
	public static void doLogin() {
		
		System.out.println("Executing login test");

	}
	@Test(priority = 3, dependsOnMethods = "doUserReg",alwaysRun=true)
	public static void thirdTest() {
		
		System.out.println("Executing Third test");

	}
	@Test(priority = 4, dependsOnMethods = "doUserReg")
	public static void fourthTest() {
		
		System.out.println("Executing Fourth test");

	}
	
	
	
}
