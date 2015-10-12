package com.imdb.utils;

import org.openqa.selenium.By;

public class FindBy {
	
	/**
	 * Accessor to elements
	 * 
	 * @param locator
	 * @return
	 */
	
	
	public static By getElementBy(String locator)
	{
		By ret = null;
		
		if (locator.startsWith("css="))
		{
			ret = By.className(locator.substring(4));
		}
		else
		{
			ret = By.xpath(locator);
		}
		
		return ret;
	}
}
