package com.imdb.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.imdb.utils.FindBy;
import com.imdb.utils.SFactory;

public class HyperLink {
	
	//public static final String HYPER_LINK_LOCATOR = "//a[contains(text(), 'Top Movies')]";
	public static final String HYPER_LINK_LOCATOR = "//a[normalize-space(text())='%s']";

	public HyperLink(){}
	
	public static WebElement clickHyperLink(String text)
	{
		WebElement hyperLink = SFactory.getDriver().findElement(FindBy.getElementBy(String.format(HYPER_LINK_LOCATOR, text)));
		return hyperLink;
	}
}