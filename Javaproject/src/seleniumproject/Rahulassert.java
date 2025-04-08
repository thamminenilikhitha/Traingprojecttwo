package seleniumproject;

import static org.testng.Assert.assertFalse;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import static org.testng. Assert.*;

public class Rahulassert {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		// TODO Auto-generated method stub
		WebDriver a= new ChromeDriver();
		
	a.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	Assert.assertFalse(a.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
		
	System.out.println(a.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		a.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(a.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(a.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//count of checkbox
		System.out.println(a.findElements(By.cssSelector("input[type='checkbox']")).size());
	Assert.assertEquals(a.findElements(By.cssSelector("input[type='checkbox']")).size(), "6checkbox");
	Thread.sleep(2000);
	//a.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	URL url = new URL("https://rahulshettyacademy.com/AutomationPractice/");
	
	a.navigate().to("url");
	a.findElement(By.id("checkBoxOption1")).click();
	//Assert.assertFalse(a.findElements(By.xpath("(//input[@id='checkBoxOption1'])[1]"))).isSelected();
	
	a.findElement(By.id("checkBoxOption2")).click();
	a.findElement(By.id("checkBoxOption3")).click();
	a.findElement(By.id("checkBoxOption1")).click();
//a.findElements(By.xpath("div[id='checkbox-example'] fieldset legend")).size();
a.findElements(By.xpath("//input[@type='checkbox']")).size();
Assert.assertEquals(a.findElements(By.xpath("//input[@type='checkbox']")).size(), "6checkbox");
	}

	}

