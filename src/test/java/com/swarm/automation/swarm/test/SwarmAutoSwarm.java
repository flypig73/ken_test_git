package com.swarm.automation.swarm.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.testng.AssertJUnit;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.appium.java_client.MobileElement;
public class SwarmAutoSwarm {

	private static DateFormat dayhourminsec = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public class SwarmAutoSwarmRoomCreation extends SwarmAutoMain {

		//@Test(priority = 1, invocationCount = 2)
		public void FakeRoomCreation() {

			WebDriverWait wait = new WebDriverWait(driver, 20);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Swarm"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swarm.button.newBtn"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createSwarm.textField.nameTextField")))
					.sendKeys("Fake Room");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Description")))
					.sendKeys("This is Fake Room");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createSwarm.button.cancelBtn"))).click();

		}

		// @Test(priority = 1)
		public void SwarmRoomCreation() {
			Date date = new Date();
			System.out.println(dayhourminsec.format(date));
			System.out.println("Chat Room:" + dayhourminsec.format(date));
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Swarm"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swarm.button.newBtn"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createSwarm.textField.nameTextField")))
					.sendKeys(dayhourminsec.format(date));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Description"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Description")))
					.sendKeys(dayhourminsec.format(date));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createSwarm.button.createBtn"))).click();

		}

		//@Test // Will do later, have no idea until found id on the page so far
		public void SwarmRoomfinding() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Swarm"))).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trrr"))).click();

		}

	}
}
