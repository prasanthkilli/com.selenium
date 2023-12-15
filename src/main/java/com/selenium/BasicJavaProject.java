package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicJavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromeDriverfile//chromedriver-win64/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
			
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Broweser is opened");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();

	}

}
