package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
/**
 * Creates a new User called Jeffery Lebowski
 * @author niko
 *
 */
public class CreateNewUserTest extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCreateNewUser() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[2]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Benutzer und Berechtigungen");
		selenium.click("//button[@type='button']");
		selenium.type("//input[@type='text']", "Lebowski");
		selenium.type("//tr[@id='prename']/td[2]/input", "Jeffrey");
		selenium.type("//tr[@id='email']/td[2]/input", "jlebowski@fantasymail.com");
		selenium.type("//tr[@id='alternativEmail']/td[2]/input", "thedude@fantasymail.com");
		selenium.type("//tr[@id='phoneNumber']/td[2]/input", "061 123 45 67");
		selenium.click("gwt-uid-17");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("Lebowski Jeffrey"));
		verifyTrue(selenium.isTextPresent("Jeffrey"));
		verifyTrue(selenium.isTextPresent("jlebowski@fantasymail.com"));
		verifyTrue(selenium.isTextPresent("061 123 45 67"));
		verifyTrue(selenium.isTextPresent("nein"));
		verifyTrue(selenium.isTextPresent("ja"));
		selenium.click("link=Benutzer und Berechtigungen");
		verifyTrue(selenium.isTextPresent("Lebowski"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
