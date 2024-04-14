package step_definitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pagepom.Customerpage;
import pagepom.Dashboarpage;
import pagepom.Loginpage;
import pagepom.pages;
import utilities.Commons;
public class Step_defination extends pages {
	

	@Given("user launch {string} with {string}")
	public void user_launch_with(String Browser, String url) throws InterruptedException {
	 log.info("***** starting the browser and headimg url");
	 browser(Browser, url);
	}

	@Then("user navigated  to {string}")
	public void user_navigated_to(String loginpagetitle) {
		log.info("*******loginpagetitle verifying");
		Verifypagetitle(loginpagetitle);
		
	
	}

	@Then("uaser enters validcredential email as {string} and password as {string}")
	public void uaser_enters_validcredential_email_as_and_password_as(String email, String password) throws InterruptedException {
	 log.info("**** puting valid credential ");
	  loginpage =new Loginpage(driver);
	  loginpage.provide_email(email);
	  loginpage.provide_Password(password);
	  Thread.sleep(2000);
	  
		
	}

	@Then("click on loginbutton")
	public void click_on_loginbutton() throws InterruptedException {
		log.info("clicking on login button");
		loginpage.click_loginbtn();
		Thread.sleep(2000);
	    
	}

	@Then("user  land on {string} Page")
	public void user_land_on_page(String expectedtitle) {
		log.info("**** verify page title");
		Verifypagetitle(expectedtitle);
	 
	}

@Then("user click on {string} menu")
public void user_click_on_menu(String menuitem) throws InterruptedException {
	log.info("***** clicking on menu");
	dashboardpage =new Dashboarpage(driver);
	dashboardpage.clickoncustomermenu();
	Thread.sleep(2000);
	

}
@Then("user click on Customer Button")
public void user_click_on_customer_button() throws InterruptedException {
	log.info("clicking on customer btn");
	dashboardpage.clickoncustomerbtn();
	Thread.sleep(2000);
	
 
}
@Then("click on {string} Field")
public void click_on_field(String string) {
  
}
@Then("insert {string} as email")
public void insert_as_email(String expectedEmail) throws InterruptedException {
	log.info("insertemail");
	   customerpage=new Customerpage(driver);
	   customerpage.inser_SearchEmail(expectedEmail);
	   Thread.sleep(2000);
}
@Then("click on search button")
public void click_on_search_button() throws InterruptedException {
    customerpage.searchbtn_click();
    Thread.sleep(2000);
}
@Then("Email should be visible")
public void email_should_be_visible() {
   Assert.assertTrue(customerpage.searchCustomerByEmail("james_pan@nopCommerce.com"),"Email Id is present");
}

}
