//package medizin.client.selenium;
//
//import com.thoughtworks.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class AcceptPersonTest extends SeleneseTestCase {
//	@Before
//	public void setUp() throws Exception {
//		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/");
//		selenium.start();
//	}
//
//	@Test
//	public void testAcceptPerson() throws Exception {
//		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997#PlaceSystemOverview:PlaceSystemOverview");
//		selenium.click("//td[2]");
//		selenium.click("link=Personen akzeptieren");
//		verifyTrue(selenium.isTextPresent("Accept Person"));
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}
//}
