package hr.ogcs.qa.GoogleJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */
public class App extends GoogleTest 
{

	@Test
	@Step("Enter into web page")
	@Description("Test Description: Enter into google.hr ")
	public void openGoogle() throws InterruptedException {
		System.out.println("Test start with entering web address");
		driver.get("https://www.google.hr/");
		Thread.sleep(50);
	}

	@Test
	@Step("Search content on google")
	@Description("Search some stuff on net")
	public void searchStiff() {
		System.out.println("Enter and search");
		WebElement webelement = driver.findElement(By.name("q"));
		webelement.sendKeys("Nase Djakovo");
    
	}
	
}
