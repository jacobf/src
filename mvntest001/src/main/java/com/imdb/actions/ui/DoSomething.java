package com.imdb.actions.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.imdb.elements.Select;
import com.imdb.elements.AscendDescend;
import com.imdb.elements.HyperLink;

public class DoSomething {
	
	public DoSomething(){}
	
	/**
	 * Clicks for each and every select box item one by one
	 * 
	 */
	
	public static void clickAllSelectBoxItems()
	{
		List<WebElement> items = Select.getSelectedItems();
		for (WebElement item : items) {
		    System.out.println(String.format("Value is: %s", item.getText()));
		    item.click();   
	}
	}
	
	/**
	 * Clicks for certain select box item
	 * 
	 * @param i
	 */
	
	public static void clickForOneItem(int i)
	{
		List<WebElement> items = Select.getSelectedItems();
		items.get(i).click();
	}
	
	/**
	 *  Clicks on asc/desc control
	 * 
	 */
	
	public static void clickForAscDesc()
	{
		WebElement ascDesc = AscendDescend.getAscDescControl();
		ascDesc.click();
	}
	
	/**
	 * Clicks on hyper link
	 * 
	 * @param text
	 */
	
	public static void clickHyperLink(String text)
	{
		WebElement hyperLink = HyperLink.clickHyperLink(text);
		hyperLink.click();
	}
		
}