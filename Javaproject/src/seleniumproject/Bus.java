package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
	         WebDriver r=new ChromeDriver();
	         r.get("https://www.abhibus.com/");
	         r.manage().window().maximize();
//r.findElement(By.name("input[@placeholder='From Station']")).click();
r.findElement(By.cssSelector("input[placeholder='From Station']")).click();
WebElement hyderabadOption = r.findElement(By.xpath("//div[contains(text(), 'Hyderabad')]"));
hyderabadOption.click();
r.findElement(By.cssSelector("input[placeholder='To Station']")).click();
WebElement BangaloreOption = r.findElement(By.xpath("//div[contains(text(), 'Bangalore')]"));
BangaloreOption.click();
r.findElement(By.cssSelector("input[placeholder='Onward Journey Date']")).click();
r.findElement(By.xpath("//button[contains(@class, 'btn')]")).click();
	}



	}


