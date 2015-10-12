package com.imdb.asserts;

import org.testng.Assert;
import com.imdb.elements.Poster;

public class Check {
	
	/**
	 * Checks that at least one column displayed
	 * 
	 * @param message
	 */
	
	public static void thatAtLeastOneMoveIsDisplayed(String message)
	{
		Assert.assertTrue(Poster.getPosterColumn().isDisplayed());
		System.out.println(message);
	}
}
