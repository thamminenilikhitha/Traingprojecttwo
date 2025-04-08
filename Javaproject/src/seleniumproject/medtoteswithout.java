package seleniumproject;

import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class medtoteswithout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
        WebDriver m = new ChromeDriver();

        // Open the website
        m.get("https://dev.medtotes.com/");
m.manage().window().maximize();
WebElement ourServicesMenu = m.findElement(By.xpath("//a[normalize-space()='Our Services']"));

// Initialize Actions class
Actions actions = new Actions(m);

// Perform mouseover action on the "Our Services" menu item
actions.moveToElement(ourServicesMenu).perform();
Thread.sleep(3000);
// Locate the "Packages" option in the dropdown
WebElement packagesOption = m.findElement(By.xpath("//a[text()='Packages']"));

// Click on the "Packages" option
packagesOption.click();

m.findElement(By.xpath("//button[@id='search']")).click();
m.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Anantapur");
Thread.sleep(2000);
//for selecting option 
m.findElement(By.xpath("//li[normalize-space()='Anantapur']")).click();
Thread.sleep(2000);
m.findElement(By.cssSelector("button[title='Search'][type='button']")).click();
m.get("https://dev.medtotes.com/packages/details/package-1234-3793");
//m.findElement(By.xpath("//div[contains@class='row']//div[1]//div[1]//div[2]//div[1]//div[4]//a[1]")).click();
m.findElement(By.cssSelector("a[title='Book Appointment']")).click();
Thread.sleep(2000);

m.findElement(By.xpath("(//input[@id='new_name'])[1]")).sendKeys("Likhitha");
m.findElement(By.xpath("(//input[@id='new_age'])[1]")).click();
m.findElement(By.xpath("(//input[@placeholder='Age'])")).sendKeys("23");

WebElement genderDropdown = m.findElement(By.id("new_gender"));

// Create a Select object for the dropdown
Select selectGender = new Select(genderDropdown);

// Select the "Female" option by visible text
selectGender.selectByVisibleText("Female");		
		
m.findElement(By.id("new_mobile")).click();	
m.findElement(By.xpath("(//input[@placeholder='Mobile'])[2]")).sendKeys("9234567999");
m.findElement(By.id("area")).click();		
m.findElement(By.id("area")).sendKeys("nacharam ");	
Thread.sleep(2000);
List<WebElement> options =m.findElements(By.xpath("(//li[@class='list-group-item'])[1]"));
Thread.sleep(2000);
	/*for(WebElement option :options){
		if(option.getText().equalsIgnoreCase("nacharam"))
		{
			option.click();
		}
	}*/
		m.findElement(By.className("list-group-item")).click();
		Thread.sleep(2000);
		m.findElement(By.id("new_pincode")).click();
		m.findElement(By.xpath("//input[@id='new_pincode']")).sendKeys("500076");
		m.findElement(By.cssSelector("#new_address")).click();
		m.findElement(By.id("new_address")).sendKeys("108kn.bhavani nagar,street no 3,nacharam");
		Thread.sleep(2000);
		m.findElement(By.xpath("(//button[@title='Next'][normalize-space()='Next'])[1]")).click();
		Thread.sleep(2000);
		m.findElement(By.cssSelector("label[for='package-date-25']")).click();
		Thread.sleep(3000);
		//m.findElement(By.cssSelector("label[for='slot-7']")).click();
		m.findElement(By.xpath("//label[normalize-space()='12:00 PM - 12:30 PM']")).click();
		Thread.sleep(2000);
		m.findElement(By.xpath("(//button[contains(@title,'Book Appointment')][normalize-space()='Book Appointment'])[1]")).click();
		Thread.sleep(2000);
		m.findElement(By.id("new_otp")).sendKeys("123456");
		//WebElement thankYouButton = m.findElement(By.className("confirm"));

	    // Perform a click action on the "Thank You!" button
	    //thankYouButton.click();
		// Wait until the button is visible
		Thread.sleep(2000);
		WebElement thankYouButton = m.findElement(By.className("confirm"));
		// Scroll to the button and click
		((JavascriptExecutor) m).executeScript("arguments[0].scrollIntoView(true);", thankYouButton);
		Thread.sleep(3000);  // Small delay to ensure visibility
		thankYouButton.click();
	}

}
