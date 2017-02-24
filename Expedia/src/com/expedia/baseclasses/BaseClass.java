package com.expedia.baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.expedia.settings.BrowserSetting;
import com.expedia.settings.BrowserType;

public class BaseClass {

	static WebDriver driver;
	public static WebDriver LaunchBrowser() throws InterruptedException {
		final String baseUrl = "https://www.expedia.co.uk/#search";
		driver = BrowserSetting.InitBrowser(BrowserType.Firefox);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		return driver;
	}
}
