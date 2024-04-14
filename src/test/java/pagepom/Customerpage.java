package pagepom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Commons;

public class Customerpage extends Commons{
	
	public Customerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locators:way of three 
	@FindBy(how = How.ID,using = "SearchEmail" )WebElement searchEmail_field;
	@FindBy(how = How.ID,using = "search-customers")WebElement searchbtn;
	@FindBy(how = How.XPATH,using = "//table[@id='customers-grid']") WebElement table;
	@FindBy(how = How.XPATH,using = "//table[@id='customers-grid']/tbody/tr") List<WebElement> TableRows;
	@FindBy(how = How.XPATH,using = "//table[@id='customers-grid']/tbody/tr/td" )List<WebElement> tableColumns;
	
	public void  inser_SearchEmail(String search_Email) {
		searchEmail_field.click();
		searchEmail_field.clear();
		searchEmail_field.sendKeys(search_Email);
	}
	public void searchbtn_click() {
		searchbtn.click();
		
	}
	
    public int getnoofRows() {
    	return(TableRows.size());
    }
    public boolean searchCustomerByEmail(String expected_email) {
    	boolean flag=false;
    	for(int i=1;i<=getnoofRows();i++) {
    	String ActualEmailid=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
    	System.out.println(ActualEmailid);
    	if(ActualEmailid.equals(expected_email)) {
    		flag=true;
    		System.out.println("**********************eamail found*********************");
    	}
    	}
    	return flag;
    }
    
}
