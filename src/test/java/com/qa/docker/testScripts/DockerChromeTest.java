package com.qa.docker.testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerChromeTest {
	DesiredCapabilities dc = DesiredCapabilities.chrome();
	
	@Test
	public void test() throws MalformedURLException{
		
//		URL url = new URL("http://localhost:4444/wd/hub");
		URL url = new URL("http://18.188.110.113:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Date d = new Date();
		System.out.println("chrome started at :-"+d);
		System.out.println("Title of page is "+ driver.getTitle());
		driver.quit();
	}
}
