package pagepom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Commons;

public class Dashboarpage extends Commons{
	
	 public Dashboarpage(WebDriver driver) { 
		 this.driver=driver;
		 PageFactory.initElements(driver,this);	
	}
	 //different locator
	 By Customermenu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	 By Customerbtn=By.xpath("(//a[@class='nav-link']//p[contains(text(),' Customers')])[1]");
	 
	 public void clickoncustomerbtn() throws InterruptedException {
		 driver.findElement(Customerbtn).click();
		 Thread.sleep(2000);
	 }
	 public void clickoncustomermenu() throws InterruptedException {
		 driver.findElement(Customermenu).click();
		 Thread.sleep(2000);
	 }
	
	

}
