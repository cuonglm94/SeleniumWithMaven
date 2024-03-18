package test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.AlertsFrameWindowsPage;
import page.FramesPage;
import page.HomePage;

public class FramesTest extends TestCase {
	public By txtIframe = By.id("sampleHeading");
	
	@Test
	public void verifyDisplayFrames() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		alertsFrameWindowsPage.testBase.scrollToEndPage();
		FramesPage framePage = alertsFrameWindowsPage.clickFrames();

		testBase.driver.switchTo().frame("frame1");

		String actualFrameText = testBase.getTextByLocator(txtIframe);
		String expectedFrameText = "This is a sample page";

		assertEquals(actualFrameText, expectedFrameText);

		testBase.driver.switchTo().defaultContent();

	}

}
