package com.sumit.playjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//tell where to execute---chrome 
		WebDriver wd=new ChromeDriver();///come from selenium jars
		
		//call url in chrome
		wd.get("https://www.youtube.com/");//provide url here
		
		//get elements from youtube and search in the element
		WebElement we=wd.findElement(By.name("search_query"));
		
		//provide data in this search element
		we.sendKeys("Play Java");
		//click submit for this element
		we.submit();		
		
	}

}
