package seleniumproject;
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulcartincreseDecrese {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdervier.chrome.driver","/user/likhitha/D:\\eclipsee\\chromedriver.exe");
	         WebDriver r=new ChromeDriver();
	         r.get("https://rahulshettyacademy.com/dropdownsPractise/");
	         r.manage().window().maximize();
	         //System.out.println("webiste opened");
	         
	      //DropDOwn selection  
	/*WebElement staticDropdown =r.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	        
	Select Dropdown=new Select(staticDropdown);     
	    Dropdown.selectByIndex(3);//defaulty select option 
	   System.out.println(Dropdown.getFirstSelectedOption().getText());
	    Dropdown.selectByVisibleText("AED");      
	    System.out.println(Dropdown.getFirstSelectedOption().getText());     
	    Dropdown.selectByVisibleText("USD");     
	    System.out.println(Dropdown.getFirstSelectedOption().getText());  */
	       
	         //like add to cart type increase and decrease
	    /*r.findElement(By.id("divpaxinfo")).click(); 
	    Thread.sleep(2000);
	    System.out.println(r.findElement(By.id("divpaxinfo")).getText());   
	    int i=1;
	    while(i<4)
	    //{
	    	
	    	r.findElement(By.id("hrefIncAdt")).click();
	    	i++;
	    //}
	         
	    r.findElement(By.id("btnclosepaxoption")).click();    
	    System.out.println(r.findElement(By.id("divpaxinfo")).getText()); */   
	         
	        //from to To  scenario 
	         
	         
	         
	         
	         //radio button enable date 
	         System.out.println(r.findElement(By.id("Div1")).getDomAttribute("style"));
	         
	         r.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	         System.out.println(r.findElement(By.id("Div1")).getDomAttribute("style"));
	    
          if(r.findElement(By.id("Div1")).getDomAttribute("style").contains("1"));{
        	  System.out.println("it's enabled");
                 Assert.assertTrue(true); }
     //  else
          {
           
          
        	  Assert.assertTrue(false);  
          }
	}

}
