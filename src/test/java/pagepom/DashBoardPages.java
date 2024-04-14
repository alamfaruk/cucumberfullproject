package pagepom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Commons;

public class DashBoardPages extends Commons{
   public DashBoardPages(WebDriver driver) {	
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	  
   }
   //locators
   
   By CustomersMenu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
   By Customersbtn=By.xpath("(//a[@class='nav-link']//p[contains(text(),' Customers')])[1]");
   
   public void clickon_customers() throws InterruptedException {
	   driver.findElement(CustomersMenu).click();
	   Thread.sleep(2000);
   }
   
   public void clickon_customerbtn() throws InterruptedException {
	   driver.findElement(Customersbtn).click();
	   Thread.sleep(2000);
   }
}
