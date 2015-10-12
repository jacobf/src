package com.imdb.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


import com.imdb.utils.FindBy;
import com.imdb.utils.SFactory;

/**
 * 
 * Select control and options
 *
 */

public class Select {
	
	public static final String SELECT_LOCATOR = "css=lister-sort-by";
	
	public Select(){}
	
	/**
	 * Get select element
	 * 
	 * @return
	 */
	
	public static WebElement getSelect()
	{
		WebElement select = SFactory.getDriver().findElement(FindBy.getElementBy(SELECT_LOCATOR));
		return select;
	}
	
	/**
	 * Get Selected items
	 * 
	 * @return
	 */
	
	public static List<WebElement> getSelectedItems()
	{
		List<WebElement> items = getSelect().findElements(By.tagName("option")); 
		return items;
	}
	
	
}

