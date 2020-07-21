package com.qa.docker.testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerFirefoxTest {
	DesiredCapabilities dc = DesiredCapabilities.firefox();
	public static URL url = null;
	public static RemoteWebDriver driver = null;
	
	@Test
	public void test() throws MalformedURLException{
		
//		URL url = new URL("http://localhost:4444/wd/hub");
		url = new URL("http://18.188.110.113:4444/wd/hub");
	    driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com/");
		
		Date d = new Date();
		System.out.println("chrome started at :-"+d);
		System.out.println("Title of page is "+ driver.getTitle());
		//driver.quit();
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 success");
		driver.get("https://www.te.com/usa-en/home.html");
		String title = driver.getTitle();
		System.out.println(title);	
	}
}
