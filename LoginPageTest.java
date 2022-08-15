package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Test1.UndostresLoginPage;
import Test1.UndostresRechargePage;

public class LoginPageTest {

	
	@Test
	
	public void LoginAttempt() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();

		 options.addArguments("start-maximized");

		 options.addArguments("disable-infobars");

		 options.addArguments("--disable-extensions");
	        WebDriver driver=new ChromeDriver(options);
	        driver.manage().window().maximize(); 
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        
	        UndostresLoginPage page1=new UndostresLoginPage(driver);
	        driver.get("http://sanbox.undostres.com.mx");
	        
	        page1.MobileNumber().sendKeys("8465433546");
	        page1.OperatorName().click();
	        	        
	        List<WebElement> Operators=driver.findElements(By.cssSelector(".suggestion.suggestion-ul-container li"));
	       
	       for(WebElement Operator:Operators) {
	    	   
	    	   
	    	   if(Operator.getText().equalsIgnoreCase("Telcel")) {
	    		   
	    		   Operator.click();
	    		   break;
	    	   }
	    	   
	       }
	       page1.RechargeTab();
	       page1.RechargeCategory1().click();
	       page1.RechargeAmount1().click();
	       page1.RechargeButton().click();
	       	
		UndostresRechargePage page2=new UndostresRechargePage(driver);
		
		page2.TarjetaTab().click();
		Thread.sleep(3000);
		page2.UsarnuevatarjetaTab().click();
		page2.AccountNumber().sendKeys("4111111111111111");
		page2.Month().sendKeys("11");
		page2.Year().sendKeys("25");
		page2.CVV().sendKeys("111");
        page2.CardHolderName().sendKeys("test@test.com");
        page2.RechargeButton().click();
        Thread.sleep(5000);
        page2.UserName().sendKeys("automationexcersise@test.com");
        Thread.sleep(5000);
        page2.Password().sendKeys("123456");
        Thread.sleep(5000);
       
        WebElement wb=driver.findElement(By.xpath("//span[@role='checkbox']"));
        WebDriverWait wait=new WebDriverWait(driver, 10);
        WebDriverWait wait1=new WebDriverWait(driver, 10);
        
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//iframe[@style='display: none;']"));
        wait1.until(ExpectedConditions.elementToBeClickable(wb));
        page2.SubmitButton().click();
        
       
   
        
	}
}
