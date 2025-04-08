package seleniumproject;
import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class medtotes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Set up ChromeDriver
       // WebDriverManager.chromedriver().setup();
		System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
        WebDriver m = new ChromeDriver();

        // Open the website
        m.get("https://dev.medtotes.com/");
m.manage().window().maximize();
        // Click on the sign-up link
        m.findElement(By.xpath("//a[@id='userSignUp']")).click();

        // Wait for the page to load
        Thread.sleep(2000); // Consider using WebDriverWait instead of Thread.sleep for better reliability

        // Select the "user" option from the dropdown
        Select signTypeDropdown = new Select(m.findElement(By.id("signType")));
        signTypeDropdown.selectByValue("0");
        //new Select(m.findElement(By.id("signType"))).selectByValue("0");
        m.findElement(By.cssSelector("#signUpMobile")).sendKeys("8988888888");
        //m.findElement(By.xpath("//button[normalize-space()='Send OTP'")).click();
        // Add any additional steps here, like filling out the form or submitting it

        Thread.sleep(1000); // Consider using WebDriverWait for better reliability

        // Click the "Send OTP" button
       // m.findElement(By.xpath("//button[@class='btn btn-primary col-md-12  w-100 py-3 sendOtpForsignUpAndSignIn']")).click();
     // Click the "Send OTP" button
        m.findElement(By.xpath("//button[contains(@class, 'btn btn-primary')]")).click();

        Thread.sleep(2000); // Adjust the wait time as needed

        // Enter OTP "123456"
        m.findElement(By.id("digit-1")).sendKeys("1");
        m.findElement(By.id("digit-2")).sendKeys("2");
        m.findElement(By.id("digit-3")).sendKeys("3");
        m.findElement(By.id("digit-4")).sendKeys("4");
        m.findElement(By.id("digit-5")).sendKeys("5");
        m.findElement(By.id("digit-6")).sendKeys("6");

        // Click the "Verify" button
       // m.findElement(By.xpath("//button[@class='logInBtn']")).click();//not work 
        Thread.sleep(2000);
        m.get("https://dev.medtotes.com/dashboard");

        // Locate the "Our Services" menu item
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
     m.findElement(By.xpath("(//input[@placeholder='Mobile'])[2]")).sendKeys("9000000000");
     m.findElement(By.id("area")).click();
//        m.findElement(By.xpath("(//input[@id='area'])[1]")).sendKeys("nacharam");
//        Thread.sleep(4000);
//   List<WebElement> options =m.findElements(By.xpath("(//li[@class='list-group-item'])[1]"));

     m.findElement(By.xpath("(//input[@id='area'])[1]")).sendKeys("nacharam");
     Thread.sleep(4000);

     // Use contains() to filter options that contain "Nacharam"
     List<WebElement> options = m.findElements(By.xpath("//li[contains(@class,'list-group-item') and contains(text(),'nacharam')]"));
     
//	for(WebElement option :options){
//		if(option.getText().equalsIgnoreCase("nacharam"))
//		{
//			option.click();
//			
//		}
//	}
	Thread.sleep(3000);	
	m.findElement(By.className("list-group-item")).click();
	Thread.sleep(2000);
	m.findElement(By.id("new_pincode")).click();
	m.findElement(By.xpath("//input[@id='new_pincode']")).sendKeys("500076");
	m.findElement(By.cssSelector("#new_address")).click();
	m.findElement(By.id("new_address")).sendKeys("108kn.bhavani nagar,street no 3,nacharam");
	Thread.sleep(2000);
	m.findElement(By.xpath("(//button[@title='Next'][normalize-space()='Next'])[1]")).click();
	Thread.sleep(2000);
	m.findElement(By.cssSelector("label[for='package-date-27']")).click();
	Thread.sleep(2000);
	m.findElement(By.xpath("//label[normalize-space()='12:00 PM - 12:30 PM']")).click();
	m.findElement(By.cssSelector("div[class='step p-2'] button[title='Book Appointment']")).click();
	Thread.sleep(2000);
	m.findElement(By.xpath("(//button[normalize-space()='Yes, Submit'])[1]")).click();
	//m.findElement(By.xpath("//button[normalize-space()='Thank You!']")).click(); 
    
    //m.findElement(By.className("confirm")).click();
	// Locate the "Thank You!" button
	
//	This is working fine with javascript
	WebElement thankYouButton = m.findElement(By.className("confirm"));
	// Scroll to the button and click
	((JavascriptExecutor) m).executeScript("arguments[0].scrollIntoView(true);", thankYouButton);
	Thread.sleep(2000);  // Small delay to ensure visibility
	thankYouButton.click();
	
//	List<WebElement> buttons = m.findElements(By.className("confirm"));
//	if (!buttons.isEmpty()) {
//	    WebElement lastButton = buttons.get(buttons.size() - 1);  // Select the last button
//	    lastButton.click();
//	} else {
//	    System.out.println("No 'Thank You!' button found.");
//	}
    
	}
	}  
        


       
   


	
