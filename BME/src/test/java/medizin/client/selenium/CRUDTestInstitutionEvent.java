package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
/**
 * Create, read, update, delete -test for institutions and events. To start this test log on first.
 * @author niko
 *
 */
public class CRUDTestInstitutionEvent extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCRUDTestInstitutionEvent() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		verifyTrue(selenium.isTextPresent("Institutionen und Themenstrukturen"));
		selenium.click("link=Institutionen und Themenstrukturen");
		verifyTrue(selenium.isTextPresent("Name der Institution"));
		verifyTrue(selenium.isTextPresent("Neue Institution"));
		selenium.type("//input[@type='text']", "CRUDTest Institution");
		selenium.click("//div[3]/button");
		verifyTrue(selenium.isTextPresent("CRUDTest Institution"));
		selenium.click("//tr[4]/td[1]/div");
		verifyTrue(selenium.isTextPresent("Name des Themenbereichs"));
		selenium.type("//div[4]/div/div/div/div/div/div/div[3]/input", "CRUDTestThemenblock");
		selenium.click("//div[4]/div/div/div/div/div/div/div[3]/button");
		verifyTrue(selenium.isTextPresent("CRUDTestThemenblock"));
		selenium.click("//tr[4]/td[2]/div/button");
		selenium.type("//div[4]/div/div/div/div/div/div/div[3]/input", "CRUDTest Themenblock 2");
		selenium.click("//div[4]/div/div/div/div/div/div/div[3]/button");
		verifyTrue(selenium.isTextPresent("CRUDTest Themenblock 2"));
		selenium.click("//div[4]/div/div/div/div/div/div/table/tbody[1]/tr[2]/td[2]/div/button");
		verifyTrue(selenium.isTextPresent("CRUDTestThemenblock"));
		selenium.click("//div[4]/div/div/div/div/div/div/table/tbody[1]/tr/td[2]/div/button");
		selenium.click("//tr[4]/td[2]/div/button");
		verifyTrue(selenium.isTextPresent("Name der Institution"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
