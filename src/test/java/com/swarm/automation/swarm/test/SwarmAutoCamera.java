package com.swarm.automation.swarm.test;

import org.testng.annotations.Test;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.appium.java_client.MobileElement;

public class SwarmAutoCamera extends SwarmAutoMain {

	@Test
	public void CameraRecordingAvideo() throws InterruptedException {

		WebDriverWait wait_video = new WebDriverWait(driver, 500); // gave max will be 3 min(180 sec), for long
																	// recoding,video recording will not be exceed 10
																	// min for now
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Camera"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("camera.view.recordVideoBtn"))).click();
		Thread.sleep(15000); // take recording 15 second
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("camera.view.recordVideoBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("camera.button.videoPreviewBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"Swarm [DEV]\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Play/Pause"))).click();
		Thread.sleep(4000); // time for hide play menu
		wait_video.until(ExpectedConditions.visibilityOfElementLocated(By.id("Done"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Swarm"))).click();
//		String timedata = driver.findElementByAccessibilityId("Time Remaining").getAttribute("value");
//		System.out.println("Video Time Remaing:" + timedata);

	}

}
