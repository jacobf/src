package com.imdb.tests.ui;
import org.testng.annotations.Test;
import com.imdb.actions.ui.DoSomething;
import com.imdb.asserts.Check;

public class ChartTopNg extends DefaultTest{
	 
    @Test
	public void checkThatAtLeastOneMoveDisplayedWhenChangingSortBySelector()
	{
		String message = "Check that at least one movie is displayed when changing sort selector";
    	DoSomething.clickAllSelectBoxItems();
		Check.thatAtLeastOneMoveIsDisplayed(message);
		DoSomething.clickForOneItem(0);
		Check.thatAtLeastOneMoveIsDisplayed(message);
		DoSomething.clickForOneItem(1);
		Check.thatAtLeastOneMoveIsDisplayed(message);
		DoSomething.clickForOneItem(2);
		Check.thatAtLeastOneMoveIsDisplayed(message);
		DoSomething.clickForOneItem(3);
		Check.thatAtLeastOneMoveIsDisplayed(message);
		DoSomething.clickForOneItem(4);
		Check.thatAtLeastOneMoveIsDisplayed(message);
	}
    
    @Test
    public void checkThatAtLeastOneMoveDisplayedIfUsingSortBySelectorAndAscendDescendControl()
    {
    	String message = "Check that at least one movie is displayed when changing selection from asc to desc";
    	DoSomething.clickForOneItem(1);
    	DoSomething.clickForAscDesc();
    	Check.thatAtLeastOneMoveIsDisplayed(message);
    }
    
    @Test
    public void checkThatAtLeastOneMovieWhenClickingTopMovies()
    {
    	String message ="Check that at least one movie displayed when clicking on Top Movies link";
    	String topMovies = "Top Movies";
    	DoSomething.clickHyperLink(topMovies);
    	Check.thatAtLeastOneMoveIsDisplayed(message);
    }
}
