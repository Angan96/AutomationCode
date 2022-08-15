package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UndostresLoginPage {
	
	
	WebDriver driver;
	public UndostresLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By MobileNumber=By.xpath("//input[@suggestmobile='mobile-numbers']");
	By OperatorName=By.xpath("//input[@data-qa='celular-operator']");
	By RechargeTab=By.xpath("//input[@data-qa='celular-amount']");
	By RechargeCategory1=By.xpath("//div[@for='cat1']");
	By RechargeAmount1=By.xpath("//li[@data-id='1']");
	By RechargeButton=By.xpath("//button[@data-qa='celular-pay']");
	
	
	
	
	
	public WebElement MobileNumber() {
		return driver.findElement(MobileNumber);
	}
	
	public WebElement OperatorName() {
		return driver.findElement(OperatorName);

	}
	

	
	public WebElement RechargeTab() {
		return driver.findElement(RechargeTab);

	}
	
	
	public WebElement RechargeCategory1() {
		return driver.findElement(RechargeCategory1);

	}
	
	public WebElement RechargeAmount1() {
		return driver.findElement(RechargeAmount1);

	}
	
	public WebElement RechargeButton() {
		return driver.findElement(RechargeButton);

	}	

}
