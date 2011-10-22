package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class CRUDTestAssessment extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCRUDTestAssessment() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[4]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Prüfungen");
		selenium.click("//button[@type='button']");
		selenium.type("//input[@type='text']", "TestPrüfung");
		selenium.click("//tr[@id='dateOfAssesment']/td[2]/input");
		selenium.click("//div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]");
		selenium.click("//tr[@id='dateOpen']/td[2]/input");
		selenium.click("//div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]");
		selenium.click("//tr[@id='dateClosed']/td[2]/input");
		selenium.click("//div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]");
		selenium.type("//tr[@id='place']/td[2]/input", "TestOrt");
		selenium.select("//tr[@id='mc']/td[2]/select", "label=mc_1 (1)");
		selenium.type("//tr[@id='logo']/td[2]/input", "TestLogo");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("TestPrüfung"));
		verifyTrue(selenium.isTextPresent("TestLogo"));
		verifyTrue(selenium.isTextPresent("TestOrt"));
		verifyTrue(selenium.isTextPresent("2011-03-01"));
		selenium.click("//td[1]/button");
		selenium.click("//tr[@id='questionTypesAssigned']/td[2]/div/button");
		selenium.select("//tr[@id='questionTypesAssigned']/td[2]/div/div[2]/select", "label=queston_type_test1 (1)");
		selenium.type("//input[@type='text']", "50");
		selenium.click("//td[2]/div/div/div/button[1]");
		verifyTrue(selenium.isTextPresent("50"));
		selenium.click("//div[2]/div/div/table/tbody/tr[1]/td[1]/button");
		selenium.select("//tr[@id='responsiblePerson']/td[2]/select", "label=Böhler (2)");
		selenium.select("//tr[@id='questionEvent']/td[2]/select", "label=Themenblock 1 / Inst 1 (1)");
		selenium.type("//input[@type='text']", "10");
		selenium.click("//div[2]/button[1]");
		verifyTrue(selenium.isTextPresent("Böhler (2)"));
		verifyTrue(selenium.isTextPresent("10"));
		selenium.click("//button[2]");
		verifyTrue(selenium.isTextPresent("Assesment löschen"));
		selenium.click("//div[2]/div/div/table/tbody/tr[2]/td/table/tbody[1]/tr/td[5]/div/button");
		selenium.click("//td[4]/div/button");
		selenium.click("//button[2]");
		verifyTrue(selenium.isTextPresent("neuer Prüfung erstellen"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
