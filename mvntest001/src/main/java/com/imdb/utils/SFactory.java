package com.imdb.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.imdb.wait.*;

/**
 * 
 * Selenium factory utils
 *
 */

public class SFactory {
	
	public static WebDriver driver;
	
	private SFactory()
	{
	}
	
	/**
	 * Open browser
	 * 
	 * @return
	 */
	
	private static WebDriver createFireFoxBrowser()
	{
		try
		{
		driver = new FirefoxDriver();
		BaseWait.waitForPage();
		}
		catch(WebDriverException e)
		{
			System.out.println("Unable to start FireFox. Error" + e.getMessage());
		}
		
		return driver;
	}
	
	/**
	 * Open URL
	 * 
	 * @param url
	 */
	
	public static void openURL(String url)
	{
		createFireFoxBrowser().get(url);	
	}
	
	/**
	 * Get Selenium driver for tests
	 * 
	 * @return
	 */
	
	public static WebDriver getDriver() {
		return (WebDriver) driver;
	}
}
