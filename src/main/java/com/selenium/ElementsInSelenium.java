package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromeDriverfile//chromedriver-win64/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
			
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.xpath("//span[text()='Personal Details']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("prasanth");
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("k.prasanth");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.click();
		firstName.clear();
		firstName.sendKeys("k.prasanth");
		
		
		/*Select country = new Select(driver.findElement(By.xpath("//select[@class='form-control ng-valid ng-touched ng-dirty']")));
		country.selectByVisibleText("Australia");
		country.selectByIndex(14);
		country.selectByValue("14");*/

	}

}
