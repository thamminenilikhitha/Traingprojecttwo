package seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rahulshettyparentandchild {

	public static void main(String[] args) throws InterruptedException {
		
// TODO Auto-generated method stub
		WebDriver r=new ChromeDriver();
		//r.get("https://rahulshettyacademy.com/AutomationPractice/");
		//parent to child
	//System.out.println(r.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	
		//child to parent
		//System.out.println(r.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
		
		
		
		
		
		
		
		//navigate
	r.get("https://dev.medtotes.com/packages/details/package-1234-3793");
	r.navigate().to("https://chatgpt.com/");
	r.navigate().back();
	Thread.sleep(2000);
	r.get("https://rahulshettyacademy.com/AutomationPractice/");
	r.navigate().forward();
	
		
		
		
		
		
		
		
		//dropdown suggestion
		
		
		/*r.get("https://rahulshettyacademy.com/dropdownsPractise/");
	r.findElement(By.id("autosuggest")).click();
	r.findElement(By.id("autosuggest")).sendKeys("ind");
		
		
	List<WebElement> options =r.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
		for(WebElement option :options)
		{

			if(option.getText().equalsIgnoreCase("India"))

			{

			option.click();
			}
		}
		*/
		
		
//		r.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		
//	
//		System.out.println(r.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//		r.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//		System.out.println(r.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//		
//		//count of checkbox
//		System.out.println(r.findElements(By.cssSelector("input[type='checkbox']")).size());
//	
//	
	
	
	
	
	
	
	
	}

	
		
	}
