//Daniela Barrientos Grisales



package com.selenium.followlinks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import java.util.List;

public class FollowLinks {
	
	public static int numberOfLinks = 0;
	
	public static void main(String[] args){
			    
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://veryinterestingis.blogspot.com.co");
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    for(WebElement ele:links){
	    	
	      System.out.println(ele.getAttribute("href"));
	      if(numberOfLinks == 0){
	    	  driver.get(ele.getAttribute("href"));
	    	  numberOfLinks=1;
	      }
	      
	      
	    }
	}
}
