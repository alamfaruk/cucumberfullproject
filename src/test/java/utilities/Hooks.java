package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Commons {
	//@Before(order=1)
	//public void alam () {
	//	System.out.println("this is alam all the above");
	//}
	
	@Before()
	public void before () {
		//log.info(" configure extent report");
		// configreport();
	}
	@After
	public void after() {
		//log.info("prepairing report");
		//extent.flush();
		log.info("browser closing");
		teardown();
	}
	 
	
	

}
