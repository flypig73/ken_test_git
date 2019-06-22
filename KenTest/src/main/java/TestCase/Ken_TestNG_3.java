package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ken_TestNG_3 {

	@Test(priority = 1)
	public static void K3_TEST() {

		System.out.println("K1_TEST");
		Assert.fail("K1_TEST");

	}

	@Test(priority = 2)
	public static void K4_TEST() {

		System.out.println("K1_TEST");
		Assert.fail("K1_TEST");

	}

}
