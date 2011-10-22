package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class CreateAssessmentTest extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCreateAssessment() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Fragen");
		selenium.click("//table[4]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Prüfungen");
		verifyTrue(selenium.isTextPresent("neuer Prüfung erstellen"));
		selenium.click("//button[@type='button']");
		selenium.type("//input[@type='text']", "TestPrüfung");
		selenium.click("//tr[@id='dateOfAssesment']/td[2]/input");
		selenium.click("//div[4]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]");
		selenium.click("//tr[@id='dateOpen']/td[2]/input");
		selenium.click("//td/table/tbody/tr[2]/td[3]");
		selenium.click("//tr[@id='dateClosed']/td[2]/input");
		selenium.click("//td/table/tbody/tr[2]/td[4]");
		selenium.type("//tr[@id='place']/td[2]/input", "TestOrt");
		selenium.click("gwt-uid-18");
		selenium.select("//tr[@id='mc']/td[2]/select", "label=mc_1 (1)");
		selenium.select("//tr[@id='repeFor']/td[2]/select", "label=TestAssesment1 (1)");
		selenium.type("//tr[@id='percentSameQuestion']/td[2]/input", "5");
		selenium.type("//tr[@id='logo']/td[2]/input", "testLogo");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("TestPrüfung"));
		verifyTrue(selenium.isTextPresent("2011-03-01"));
		verifyTrue(selenium.isTextPresent("2011-03-02"));
		verifyTrue(selenium.isTextPresent("TestOrt"));
		verifyTrue(selenium.isTextPresent("testLogo"));
		verifyTrue(selenium.isTextPresent("TestAssesment1 (1)"));
		verifyTrue(selenium.isTextPresent("mc_1 (1)"));
		verifyTrue(selenium.isTextPresent("2011-03-03"));
		selenium.click("//button[2]");
		selenium.click("//td[1]/div/div");
		selenium.click("//tr[2]/td[1]/div/div");
		selenium.click("//tr[3]/td[1]/div/div");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
