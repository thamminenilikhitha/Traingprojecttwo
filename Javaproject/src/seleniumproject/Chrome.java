package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
	driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
	
	
	
	
	
	
	}

}
