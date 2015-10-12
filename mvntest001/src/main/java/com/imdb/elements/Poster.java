package com.imdb.elements;

import org.openqa.selenium.WebElement;

import com.imdb.utils.FindBy;
import com.imdb.utils.SFactory;

/**
 * 
 * td.poster element definition
 * 
 */

public class Poster {
	
	public static final String POSTER_LOCATOR = "css=posterColumn";

	public Poster(){}
	
	public static WebElement getPosterColumn()
	{
		WebElement posterColumnColumn = SFactory.getDriver().findElement(FindBy.getElementBy(POSTER_LOCATOR));
		return posterColumnColumn;
	}
}
