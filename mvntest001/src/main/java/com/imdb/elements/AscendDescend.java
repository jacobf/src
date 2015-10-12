package com.imdb.elements;

import org.openqa.selenium.WebElement;

import com.imdb.utils.FindBy;
import com.imdb.utils.SFactory;

/**
 * An accessor to ascend/descend control
 *
 */

public class AscendDescend {
	
	public static final String ASCEND_DESCEND_LOCATOR = "css=lister-sort-reverse";

	public AscendDescend(){}
	
	public static WebElement getAscDescControl()
	{
		WebElement ascDescCont = SFactory.getDriver().findElement(FindBy.getElementBy(ASCEND_DESCEND_LOCATOR));
		return ascDescCont;
	}
}
