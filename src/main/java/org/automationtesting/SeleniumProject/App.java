package org.automationtesting.SeleniumProject;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	
	@Test
	public void sampleAutomation() {
		WebDriverManager.getInstance(CHROME).setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://faheembhatti.github.io/");
		driver.manage().window().maximize();

		WebElement nameField = driver.findElement(By.id("name"));
		nameField.sendKeys("Faheem");
		
	}
}
