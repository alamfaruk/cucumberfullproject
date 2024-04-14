package pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Commons;

public class Loginpages extends Commons {
	WebDriver driver;
	
	public Loginpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email") WebElement emailfield;
	@FindBy(id="Password") WebElement Passwordfield;
	@FindBy(xpath ="//button[text()='Log in']") WebElement login_btn;
	
	public void provide_email(String Given_email) throws InterruptedException {
		waitforclickable(emailfield);
		emailfield.click();
		emailfield.clear();
		emailfield.sendKeys(Given_email);
		Thread.sleep(2000);
	}
	public void provide_Password(String Given_password) throws InterruptedException {
		waitforclickable(Passwordfield);
		Passwordfield.click();
		Passwordfield.clear();
		Passwordfield.sendKeys(Given_password);
		Thread.sleep(2000);
	}
	public void click_loginbtn() {
		login_btn.click();
	}
	
	

}
