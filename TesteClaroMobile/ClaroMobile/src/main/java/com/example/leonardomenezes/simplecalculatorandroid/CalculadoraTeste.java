package com.example.leonardomenezes.simplecalculatorandroid;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		desiredCapabilities.setCapability("appium:appActivity",
				"com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el21 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		el21.click();
		MobileElement el22 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el22.click();
		MobileElement el23 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
		el23.click();
		MobileElement el24 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el24.click();
		MobileElement el25 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sum");
		el25.click();
		MobileElement el26 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		el26.click();

		System.out.println("Resultado: " + el26.getText());
		Assert.assertEquals("6", el26.getText());

		driver.quit();

	}

	@Test
	public void deveSubtrairDoisValores() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		desiredCapabilities.setCapability("appium:appActivity",
				"com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el1 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		el1.click();
		MobileElement el2 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el2.click();
		MobileElement el3 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
		el3.click();
		MobileElement el4 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el4.click();
		MobileElement el5 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sub");
		el5.click();
		MobileElement el6 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		el6.click();

		System.out.println("Resultado: " + el6.getText());
		Assert.assertEquals("0", el6.getText());

		driver.quit();

	}

	@Test
	public void deveMultiplicarDoisValores() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		desiredCapabilities.setCapability("appium:appActivity",
				"com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el15 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		el15.click();
		MobileElement el16 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el16.click();
		MobileElement el17 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
		el17.click();
		MobileElement el18 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el18.click();
		driver.navigate().back();
		MobileElement el19 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el19.click();
		MobileElement el20 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		el20.click();

		System.out.println("Resultado: " + el20.getText());
		Assert.assertEquals("9", el20.getText());

		driver.quit();

	}

	@Test
	public void deveDividirDoisValores() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		desiredCapabilities.setCapability("appium:appActivity",
				"com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el23 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		el23.click();
		MobileElement el24 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el24.click();
		MobileElement el25 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
		el25.click();
		MobileElement el26 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
		el26.click();
		driver.navigate().back();
		MobileElement el27 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_div");
		el27.click();
		MobileElement el28 = (MobileElement) driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		el28.click();

		System.out.println("Resultado: " + el28.getText());
		Assert.assertEquals("1", el28.getText());

		driver.quit();

	}

}
