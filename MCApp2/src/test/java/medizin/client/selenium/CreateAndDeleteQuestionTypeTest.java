package medizin.client.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;
/**
 * Create, edit and delete a questionType. To start this test user has to log on as administrator first.
 * @author niko
 *
 */
public class CreateAndDeleteQuestionTypeTest extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.start();
	}

	@Test
	public void testCreateAndDeleteQuestionType() throws Exception {
		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[1]");
		selenium.click("link=Fragentypen");
		verifyTrue(selenium.isTextPresent("neuen Fragetyp erstellen"));
		selenium.click("//button[@type='button']");
		verifyTrue(selenium.isTextPresent("Neuen Fragetyp erstellen"));
		selenium.type("//input[@type='text']", "Fragetyp4Testing");
		selenium.click("gwt-uid-21");
		selenium.click("gwt-uid-21");
		selenium.type("//tr[@id='trueAnswers']/td[2]/input", "5");
		selenium.type("//tr[@id='falseAnswers']/td[2]/input", "4");
		selenium.type("//tr[@id='sumAnswers']/td[2]/input", "9");
		selenium.type("//tr[@id='maxLetters']/td[2]/input", "50");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("Fragetyp4Testing"));
		selenium.click("//td[2]/div/button[1]");
		selenium.type("//input[@type='text']", "Fragetyp4TestingEdited");
		selenium.type("//tr[@id='trueAnswers']/td[2]/input", "6");
		selenium.type("//tr[@id='falseAnswers']/td[2]/input", "5");
		selenium.type("//tr[@id='sumAnswers']/td[2]/input", "11");
		selenium.click("//td[2]/div/button[1]");
		selenium.type("//tr[@id='trueAnswers']/td[2]/input", "1");
		selenium.type("//tr[@id='sumAnswers']/td[2]/input", "6");
		selenium.click("//td[2]/div/button[1]");
		selenium.click("//td/button");
		selenium.type("//input[@type='text']", "FragetypEdited");
		selenium.click("//td[2]/div/button[1]");
		verifyTrue(selenium.isTextPresent("FragetypEdited"));
		selenium.click("//button[2]");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
