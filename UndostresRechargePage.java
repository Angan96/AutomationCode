package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UndostresRechargePage {
	
	
	WebDriver driver;
	public UndostresRechargePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By TarjetaTab=By.xpath("//p[@data-qa='tarjeta-tab']");
	By UsarnuevatarjetaTab=By.xpath("//span[text()='Usar nueva tarjeta']");	
	By AccountNumber=By.xpath("//input[@data-qa='numero-de-tarjeta-input']");
	By Month=By.xpath("//input[@data-qa='mes-input']");
	By Year=By.xpath("//input[@data-qa='expyear-input']");
	By CVV=By.xpath("//input[@data-qa='cvv-input']");
	By CardHolderName=By.cssSelector(".form-control.email.preventChromeAutofill");
	By RechargeButton=By.cssSelector(".buttonPayment.pay4.limit.PulsiIndicator");
	By UserName=By.xpath("//input[@id='usrname']");
	By Password=By.xpath("//input[@id='psw']");
	//By Recaptha=By.xpath("//*[@id='recaptcha-anchor']");
	By SubmitButton=By.xpath("//button[text()='Acceso']");
	
	
	public WebElement TarjetaTab() {
		return driver.findElement(TarjetaTab);
	}
	
	public WebElement UsarnuevatarjetaTab() {
		return driver.findElement(UsarnuevatarjetaTab);

	}
	
	
	public WebElement AccountNumber() {
		return driver.findElement(AccountNumber);

	}
	
	
	public WebElement Month() {
		return driver.findElement(Month);

	}
	
	public WebElement Year() {
		return driver.findElement(Year);

	}
	
	public WebElement CVV() {
		return driver.findElement(CVV);

	}
	
	
	public WebElement CardHolderName() {
		return driver.findElement(CardHolderName);

	}
	
	public WebElement UserName() {
		return driver.findElement(UserName);
		
	}
	
	
	public WebElement Password() {
		return driver.findElement(Password);

}
	
	//public WebElement Recaptha() {
		//return driver.findElement(Recaptha);

	//}
	public WebElement SubmitButton() {
		return driver.findElement(SubmitButton);
	}
	
	public WebElement RechargeButton() {
		return driver.findElement(RechargeButton);
	}
}
	
	
	
	
	
	
