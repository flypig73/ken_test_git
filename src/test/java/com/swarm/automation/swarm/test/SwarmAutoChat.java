package com.swarm.automation.swarm.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;

public class SwarmAutoChat extends SwarmAutoMain {

	@Test(priority = 1, invocationCount = 3)
	public void ChatSendingAsimpleMessage() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);// gave some delay
		swipe(207, 104, 207, 280, 1); // to find out Ammunition_Ken position.
		// Thread.sleep(2000); // gave some delay , will be deleted
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Ammunition_Ken")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Ammunition_Ken"))).click();
		Thread.sleep(3000);// gave some delay
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Chat"))).click();
		Thread.sleep(1000);// gave some delay
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("OK"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messages.textView.textView"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messages.textView.textView"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messages.textView.textView"))).sendKeys("Winter is coming!");				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messages.button.sendBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messages.button.doneBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Swarm"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Leave"))).click();
		swipe(207, 280, 207, 104, 1);// restore Ammunition_Ken position for repeat

		// add get sound function in here - now it is not working now, to make some condition to repeat.will use later if it need
		//PlayAlamSound GetSounds = new PlayAlamSound();
		/*
		 * GetSounds.AlamSound(); while (true) { try { GetSounds.AlamSound();
		 * Thread.sleep(3000); } catch (Exception e) {
		 * 
		 * }
		 * 
		 * }
		 */

	}

	private static DateFormat dayhourminsec = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	// @Test
	public void SwarmRoomCreateion() {

		Date date = new Date();
		System.out.println(dayhourminsec.format(date));
		System.out.println("Chat Room:" + dayhourminsec.format(date));

		MobileElement el1 = (MobileElement) driver.findElementByXPath(
				"//XCUIElementTypeApplication[@name=\"Swarm [DEV]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("New");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath(
				"//XCUIElementTypeApplication[@name=\"Swarm [DEV]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField");
		el3.sendKeys("Room:" + dayhourminsec.format(date));
		MobileElement el4 = (MobileElement) driver.findElementByXPath(
				"//XCUIElementTypeApplication[@name=\"Swarm [DEV]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextView");
		el4.sendKeys("Room:" + dayhourminsec.format(date));
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Create");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Room:" + dayhourminsec.format(date));
		el6.click();
		AssertJUnit.fail("Failing the Function");

	}

}
