package com.qa.docker.testScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DockerGrid_Setup {
	
	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException{
		Runtime.getRuntime().exec("cmd /c start Start_dockerGrid.bat");
		Thread.sleep(15000);
	}
	
	@AfterTest
	public void stopDockerGrid() throws IOException, InterruptedException{
		Runtime.getRuntime().exec("cmd /c start Stop_dockerGrid.bat");
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
