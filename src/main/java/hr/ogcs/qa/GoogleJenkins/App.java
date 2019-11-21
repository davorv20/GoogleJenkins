package hr.ogcs.qa.GoogleJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */
public class App extends GoogleTest 
{

	@Step("Enter into web page")
	@Description("Test Description: Enter into google.hr ")
	@Story("Story 1")
	public void openGoogle() throws InterruptedException {
		System.out.println("Test start with entering web address");
		driver.get("https://www.google.hr/");
		System.out.print("Driver get \n");

	}

	@Step("Search content on google")
	@Description("Search some stuff on net")
	@Story("Story 2")
	public void searchStiff() throws InterruptedException {
		System.out.println("Enter and search");
		WebElement element = driver.findElement(By.className("gLFyf gsfi"));
		System.out.print("Search clicked \n");
		Thread.sleep(50);
		element.sendKeys("Nase Djakovo");
		element.submit();
    
	}
	
}
