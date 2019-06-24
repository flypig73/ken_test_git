
package com.swarm.automation.swarm.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

//

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;



public class SwarmAutoMain {

	private static final Object device_init_lock = new Object();
	private static boolean deviceinit = false;

	public static URL url;
	public static DesiredCapabilities capabilities;
	public static IOSDriver<IOSElement> driver;
	public IOSTouchAction iosTouchAction;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		synchronized (device_init_lock) {
			if (!deviceinit) {
				SwarmSetUpDeivce();
				deviceinit = true;
			}
		}
	}

	private void SwarmSetUpDeivce() throws MalformedURLException {
		System.err.println(
				"=============================   *Welcome Swarm Automation Test World*   ============================= ");
		System.err.println(
				"=============================           !Device init Start!             ============================= ");

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("platformVersion", "12.2");
		desiredCapabilities.setCapability("deviceName", "iPhone");
		desiredCapabilities.setCapability("udid", "a7afe2de3ed08978940b538a078e44a99ff4a22c");
		desiredCapabilities.setCapability("bundleId", "com.divx.swarm.development");
		desiredCapabilities.setCapability("xcodeOrgId", "F2JB92KEAG");
		desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
		desiredCapabilities.setCapability("NewCommandTimeout", "3600");
		desiredCapabilities.setCapability("useNewWDA", true);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		driver = new IOSDriver<IOSElement>(remoteUrl, desiredCapabilities);
		System.err.println(
				"=============================           !Device init Done!              ============================= ");
	}

	@SuppressWarnings("rawtypes")
	public static void swipe(int x_start, int y_start, int x_stop, int y_stop, int duration) {

		new TouchAction(driver).press(PointOption.point(x_start, y_start))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
				.moveTo(PointOption.point(x_stop, y_stop)).release().perform();
	}

}

class Get_Time_data {

	private static DateFormat dayhourminsec = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public static void GetTime() {

		Date date = new Date();
		System.out.println(dayhourminsec.format(date));
		System.out.println("Chat Room:" + dayhourminsec.format(date));
	}

}

class PlayAlamSound {

	public void AlamSound() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("/Users/ken.moon/eclipse-workspace/alam.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();

		} catch (Exception e) {
			System.out.println("err : " + e);
		}

	}
}
