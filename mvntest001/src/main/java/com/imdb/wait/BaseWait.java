package com.imdb.wait;

import java.util.concurrent.TimeUnit;

import com.imdb.utils.SFactory;

/**
 * 
 * A bit simply Wait class
 *
 */

public class BaseWait {
	
	public BaseWait()
	{
		
	}
	
	public static void waitForPage()
	{
		SFactory.getDriver().manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	}

 }
