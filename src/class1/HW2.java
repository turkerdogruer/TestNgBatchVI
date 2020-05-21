package class1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class HW2 extends CommonMethods{

@BeforeMethod	
public void Browser () {
	setUp();
}
@Test
public void login() {
	String username = "Admin";
	String pasword = "Hum@nhrm123";
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPasword")).sendKeys("Hum@nhrm123");
	driver.findElement(By.id("btnLogin")).click();
	
	boolean DisplayLogo = driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
	
	if(DisplayLogo) {
		System.out.println("passed test case ");
	}else {
		System.out.println("fail test case ");
	}
	
	
}
@AfterMethod
public void browser() {
	driver.close();
}
}
