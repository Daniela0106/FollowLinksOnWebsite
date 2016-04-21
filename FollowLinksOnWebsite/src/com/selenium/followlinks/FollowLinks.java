/*Daniela Barrientos Grisales
 *REST architecture:
 *Visiting a website, finding all hyperlinks and then visiting the first one found.
 */

package com.selenium.followlinks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import java.util.List;

public class FollowLinks {
	
	public static int numberOfLinks = 0;
	public static String otherUrl="";
	
	public static void main(String[] args){
			    
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://google.com");
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    for(WebElement ele:links){
	    	
	      System.out.println(ele.getAttribute("href"));
	      if(numberOfLinks == 0){
	    	  otherUrl = (ele.getAttribute("href"));
	    	  numberOfLinks=1;
	      }
	      
	      
	    }
	    
	    driver.get(otherUrl);
	}
}
