package com.expedia.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetting {

	public static  WebDriver InitBrowser(BrowserType browser) {
		WebDriver driver = null;
		switch (browser) {
		case Chrome:
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium JVM\\Expedia\\JARS\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case Firefox:
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium JVM\\Expedia\\JARS\\geckodriver.exe");
			driver = new ChromeDriver();
			break;

		case IExplore:

			break;

		default:
			break;
		}
		return driver;
	}
}
