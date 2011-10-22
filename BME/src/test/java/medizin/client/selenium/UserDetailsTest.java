//package medizin.client.selenium;
//
//import com.thoughtworks.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class UserDetailsTest extends SeleneseTestCase {
//	@Before
//	public void setUp() throws Exception {
//		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/");
//		selenium.start();
//	}
//
//	@Test
//	public void testUserDetails() throws Exception {
//		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997#PlaceOpenDemand:PlaceOpenDemand");
//		selenium.click("//table[2]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
//		selenium.click("link=Benutzer und Berechtigungen");
//		verifyTrue(selenium.isTextPresent("Böhler"));
//		verifyTrue(selenium.isTextPresent("David"));
//		verifyTrue(selenium.isTextPresent("david.boehler@unibas.ch"));
//		verifyTrue(selenium.isTextPresent("david.boehler@unibas.ch"));
//		verifyTrue(selenium.isTextPresent("079 455 00 11"));
//		verifyEquals("true", selenium.getText("//tr[2]/td[6]/div"));
//		verifyEquals("true", selenium.getTable("//div[2]/div/div/div[1]/div/div/div/table.2.6"));
//		selenium.click("//div[2]/div/div/div[1]/div/div/div/table/tbody[1]/tr[2]/td[1]/div");
//		selenium.click("//tr[2]/td[2]/div");
//		verifyEquals("2", selenium.getText("//tr[@id='id']/td[2]/span"));
//		verifyEquals("0", selenium.getText("//tr[@id='version']/td[2]"));
//		verifyEquals("Böhler", selenium.getText("//tr[@id='name']/td[2]/span"));
//		verifyEquals("David", selenium.getText("//tr[@id='prename']/td[2]/span"));
//		verifyEquals("david.boehler@unibas.ch", selenium.getText("//tr[@id='email']/td[2]/span"));
//		verifyEquals("david.boehler@unibas.ch", selenium.getText("//tr[@id='alternativEmail']/td[2]/span"));
//		verifyEquals("079 455 00 11", selenium.getText("//tr[@id='phoneNumber']/td[2]/span"));
//		verifyEquals("true", selenium.getText("//tr[@id='isAdmin']/td[2]/span"));
//		verifyEquals("true", selenium.getText("//tr[@id='isAccepted']/td[2]/span"));
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}
//}
