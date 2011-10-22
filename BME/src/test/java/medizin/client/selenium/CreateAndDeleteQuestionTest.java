package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
/**
 * Creates and deletes a new question.
 * @author Adrian Alioski
 *
 */
public class CreateAndDeleteQuestionTest extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCreateAndDeleteQuestion() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Fragen");
		selenium.click("//button[@type='button']");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr");
		selenium.click("link=Fragen");
		verifyTrue(selenium.isTextPresent("neuer frage erstellen"));
		selenium.click("//button[@type='button']");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Fragen");
		verifyTrue(selenium.isTextPresent("neuer frage erstellen"));
		selenium.click("//button[@type='button']");
		selenium.select("//tr[@id='rewiewer']/td[2]/select", "label=Böhler (2)");
		selenium.select("//tr[@id='questEvent']/td[2]/select", "label=Themenblock 1 / Inst 1 (1)");
		selenium.select("//tr[@id='questionType']/td[2]/select", "label=queston_type_test1 (1)");
		selenium.click("//tr[@id='mcs']/td[2]/div/button");
		selenium.click("//tr[@id='mcs']/td[2]/div/div[2]/button");
		selenium.select("//div[4]/div/div/div/div/div/select", "label=Böhler (2)");
		selenium.click("//td[2]/div/button[1]");
		selenium.click("//tr[@id='mcs']/td[2]/div/button");
		selenium.click("//td[2]/div/button[1]");
		selenium.click("link=Fragen");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
		selenium.click("link=Fragen");
		verifyTrue(selenium.isTextPresent("neuer frage erstellen"));
		selenium.click("//td[2]/div/div");
		selenium.click("//button[@type='button']");
		verifyTrue(selenium.isTextPresent("Neue Frage erstellen"));
		selenium.select("//tr[@id='rewiewer']/td[2]/select", "label=Böhler (2)");
		selenium.select("//tr[@id='questEvent']/td[2]/select", "label=Themenblock 1 / Inst 1 (1)");
		selenium.select("//tr[@id='questionType']/td[2]/select", "label=queston_type_test1 (1)");
		selenium.click("//tr[@id='mcs']/td[2]/div/button");
		selenium.click("//tr[@id='mcs']/td[2]/div/button");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("Was ist die Antwort auf alle Fragen?"));
		selenium.click("//button[2]");
		verifyTrue(selenium.isTextPresent("neuer frage erstellen"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
