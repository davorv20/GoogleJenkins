package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.testng.annotations.Test;

import googleJenkins.GoogleTest;
/**
 * Hello world!
 *
 */
public class App extends GoogleTest 
{

	@Test
	@Step("Enter into web page")
	@Description("Test Description: Enter into google.hr ")
	@Story("Story 1")
	@Severity(SeverityLevel.NORMAL)
	public void openGoogle() throws InterruptedException {
		System.out.println("Test start with entering web address");
		driver.get("https://www.google.hr/");
		System.out.print("Driver get \n");

	}

	@Test
	@Step("Search content on google")
	@Description("Search some stuff on net")
	@Story("Story 2")
	@Severity(SeverityLevel.TRIVIAL)
	public void searchNaseDjakovo() throws InterruptedException {
		System.out.println("Enter and search");
		driver.get("https://www.google.hr/");
		System.out.print("Driver get \n");
		WebElement element = driver.findElement(By.name("q"));
		System.out.print("Search clicked \n");
		Thread.sleep(50);
		element.sendKeys("Nase Djakovo");
		element.submit();
		
	    // wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

	    // this are all the links you like to visit
	    for (WebElement webElement : findElements)
	    {
	        System.out.println(webElement.getAttribute("href"));
	    }
    
	}
	
	@Test
	@Step("Open dnevnik.hr")
	@Description("Search some stuff on dnevnik")
	@Story("Story 3")
	@Severity(SeverityLevel.TRIVIAL)
	public void openPageDnevnik() throws InterruptedException {
		System.out.println("Enter and search");
		driver.get("https://www.dnevnik.hr/");
		System.out.print("Driver get \n");
		//WebElement element = driver.findElement(By.linkText("Vijesti"));
		//element.click();
		System.out.print("Search clicked \n");
		//Thread.sleep(50);
    
	}
}
