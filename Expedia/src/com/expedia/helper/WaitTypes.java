package com.expedia.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitTypes {
	
	public static void FluentWait(WebDriver driver, WebElement element){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);		
		
			WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
					{
					  public WebElement apply(WebDriver driver) {
					  return element;
					}
					});
			foo.click();
	}

}
