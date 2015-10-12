package com.imdb.tests.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChartTop {
	
	public static void main(String args[])
	{
		//create web driver
		WebDriver driver = new FirefoxDriver();
		//Open FireFox
		driver.get("http://www.imdb.com/chart/top");
		
		//Find the select box
		WebElement select = driver.findElement(By.className("lister-sort-by"));
		
		//We are all we need to see at list one film accordingly rating
		
		if (driver.findElement(By.className("posterColumn")).isDisplayed());
		{
			System.out.println("At least one poster column");
		}
		
		//Get the all text of select boxes and then click
				List<WebElement> allOptions = select.findElements(By.tagName("option"));
				for (WebElement option : allOptions) {
				    System.out.println(String.format("Value is: %s", option.getText()));
				    option.click();
				    if (driver.findElement(By.className("posterColumn")).isDisplayed());
					{
						System.out.println("At least one poster column");
					}
				}
				
	  //Ascend - Descend
	  WebElement orderSelector = driver.findElement(By.className("lister-sort-reverse"));
	  orderSelector.click();
	  
	  if (driver.findElement(By.className("posterColumn")).isDisplayed());
		{
			System.out.println("At least one poster column");
		}
	 
		orderSelector.click();
		
		 if (driver.findElement(By.className("posterColumn")).isDisplayed());
			{
				System.out.println("At least one poster column");
			} 
			
		WebElement link = driver.findElement(By.xpath("//a[contains(text(), 'Top Movies')]"));
		link.click();
		
		if (driver.findElement(By.className("posterColumn")).isDisplayed());
		{
			System.out.println("At least one poster column");
		}
			
    }
	
	

}
