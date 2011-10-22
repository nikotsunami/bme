//package medizin.client.selenium;
//
//import com.thoughtworks.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.regex.Pattern;
///**
// * Test for the main navigation. Every link of the navigation is clicked.To run this test
// * open browser an login first.
// * @author Adrian Alioski
// *
// */
//public class TestMcAppNav extends SeleneseTestCase {
//	@Before
//	public void setUp() throws Exception {
//		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:8888/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
//		selenium.start();
//	}
//
//	@Test
//	public void testMcAppNav() throws Exception {
//		selenium.open("/ApplicationEntry.html?gwt.codesvr=127.0.0.1:9997");
//		selenium.click("link=Systemübersicht");
//		selenium.click("link=Personen akzeptieren");
//		verifyTrue(selenium.isTextPresent("Accept Person"));
//		selenium.click("link=Fragen akzeptieren");
//		verifyTrue(selenium.isTextPresent("Fragentext"));
//		selenium.click("link=Antworten akzeptieren");
//		selenium.click("link=Prüfungsfragen akzeptieren");
//		verifyTrue(selenium.isTextPresent("Accept Ass Question"));
//		selenium.click("link=Offene Anfragen");
//		verifyTrue(selenium.isTextPresent("Open Demand"));
//		selenium.click("//table[2]/tbody/tr[1]/td/a/table/tbody/tr/td[1]/img");
//		selenium.click("link=Benutzer und Berechtigungen");
//		verifyTrue(selenium.isTextPresent("Benutzer und Berechtigungen"));
//		verifyTrue(selenium.isTextPresent("neuer Benutzer"));
//		selenium.click("//table[3]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
//		selenium.click("link=Fragen");
//		verifyTrue(selenium.isTextPresent("neuer frage erstellen"));
//		selenium.click("link=Fragentypen");
//		selenium.click("link=Institutionen und Themenstrukturen");
//		verifyTrue(selenium.isTextPresent("Name der Institution"));
//		selenium.click("//table[4]/tbody/tr[1]/td/a/table/tbody/tr/td[2]");
//		verifyTrue(selenium.isTextPresent("Prüfungen"));
//		selenium.click("link=Prüfungen");
//		verifyTrue(selenium.isTextPresent("neuer Prüfung erstellen"));
//		selenium.click("link=Prüfungsfragen zu Prüfung");
//		verifyTrue(selenium.isTextPresent("vorgeschlagene Fragen"));
//		selenium.click("link=Prüfungsheft");
//		selenium.click("link=Statische Inhalte");
//		verifyTrue(selenium.isTextPresent("Static content"));
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}
//}
