package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=-1)
	public void inbox() {
		Reporter.log("inbox",true);
	}
	
	@Test(priority=-1,invocationCount=4)
	public void outbox() {
		Reporter.log("outbox",true);
	}
	
	@Test(enabled=false)
	public void sent() {
		Reporter.log("sent",true);
	}

}
