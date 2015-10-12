package com.imdb.tests.ui;

import com.imdb.utils.SFactory;
import org.testng.annotations.*;

/**
 * 
 * The default test for each and every test in suite
 *
 */


public abstract class DefaultTest {
	
	public static final String IMDB_TOP_URL= "http://www.imdb.com/chart/top";
	
	@BeforeClass(alwaysRun = true)
	protected void init()
	{
		SFactory.openURL(IMDB_TOP_URL);
	}
	
	@AfterClass
	public void closeAll()
	{
	  SFactory.getDriver().close();
	}
}
