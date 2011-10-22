//package medizin.client.selenium;
//
//
//import com.thoughtworks.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.regex.Pattern;
//
//
//import com.thoughtworks.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.regex.Pattern;
//
//public class UserFrontendTest extends SeleneseTestCase {
//	@Before
//	public void setUp() throws Exception {
//		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://127.0.0.1:8888/");
//		selenium.start();
//	}
//
//	@Test
//	public void testUserFrontend() throws Exception {
//		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
//		selenium.click("//table[2]/tbody/tr[1]/td/a/table/tbody/tr/td[1]/img");
//		selenium.click("link=Benutzer und Berechtigungen");
//		selenium.click("//tr[1]/td[1]");
//		selenium.click("//td[2]/div");
//		verifyTrue(selenium.isTextPresent("Barack"));
//		selenium.click("//div[3]/div/div/div/div/div[1]/button");
//		selenium.type("//input[@type='text']", "BarackHallo");
//		selenium.type("//tr[@id='prename']/td[2]/input", "AntonHallo");
//		selenium.click("//div[2]/button[1]");
//		verifyTrue(selenium.isTextPresent("BarackHallo"));
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}
//}
//

