package class1;

import java.io.ObjectInputFilter.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import utils.CommonMethods;
import utils.ConfigsReader;

public class TitleLogoAndLoginVaidation extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void titleValidation() throws Exception {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title validation Passed");
		} else {
			System.out.println("Title validation failed");
			throw new Exception();
		}
	}

	@Test
	public void logoValidation() {
		String logoPath = "//div[@id='divLogo']//img";
		WebElement logo = driver.findElement(By.xpath(logoPath));
		boolean isDisplayed = logo.isDisplayed();
		if (isDisplayed) {
			System.out.println("Logo validation passed");
		} else {
			System.out.println("logo validation failed");

		}

	}

	@Test
	public void LoginValidation() throws InterruptedException {
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(driver.findElement(By.id("btnLogin")));
		Thread.sleep(5000);
	}
}