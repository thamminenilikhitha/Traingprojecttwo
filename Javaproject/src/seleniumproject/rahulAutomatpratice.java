package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulAutomatpratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
String name="Rahul";
				WebDriver rahul= new ChromeDriver();

				rahul.get("https://rahulshettyacademy.com/AutomationPractice/");
				rahul.findElement(By.id("name")).sendKeys("Text");
				rahul.findElement(By.id("alertbtn")).click();
				System.out.println(rahul.switchTo().alert().getText());
				rahul.switchTo().alert().accept();
				
				rahul.findElement(By.id("confirmbtn")).click();
				Thread.sleep(2000);
				rahul.switchTo().alert().dismiss();
				
				
				
				
				
				
				
				
				
	}

}
