package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import utils.CommonMethods;
import utils.ConfigsReader;

public class HW1and2 extends CommonMethods {
	@BeforeMethod
	public void login() {
		setUp();
	}

	@Test
	public void welcomeAdminDisplay() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();

		WebElement welcomeAdmin = driver.findElement(By.id("welcome"));
		String text = welcomeAdmin.getText();
		boolean isDisplay = welcomeAdmin.isDisplayed();
		if (isDisplay) {
			System.out.println("Test Case passed. " + text + " is displayed.");
		} else {
			System.err.println("Test Case failed. " + text + " is Not displayed.");
		}

	}

	@Test
	public void login2() {
		

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();

		WebElement span = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		String text=span.getText();

	System.out.println("Span message is "+ text);
	System.out.println(text+" is displayed. TEST SUCCESFUL");

	}

	@AfterMethod
	public void close() {
		tearDown();
	}
}