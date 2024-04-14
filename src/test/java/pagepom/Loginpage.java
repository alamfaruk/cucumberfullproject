package pagepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Commons;

public class Loginpage extends Commons {
	WebDriver driver;
	@FindBy(id="Email") WebElement emailfield;
	@FindBy(id="Password") WebElement Passwordfield;
	@FindBy(xpath ="//button[text()='Log in']") WebElement login_btn;
	//action method
     public void provide_email(String email) throws InterruptedException {
    	waitforclickable(emailfield);
    	emailfield.click();
    	emailfield.clear();
    	emailfield.sendKeys(email);
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
	
	public Loginpage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
}
