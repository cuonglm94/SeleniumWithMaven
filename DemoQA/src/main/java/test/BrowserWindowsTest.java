package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import page.AlertsFrameWindowsPage;
import page.BrowserWindowsPage;
import page.DemoSamplePage;
import page.DemoSampleWindowAlertPage;
import page.FormPage;
import page.HomePage;
import page.PractiveFormPage;

public class BrowserWindowsTest extends TestCase {
	//@Test
	public void verifyNewTabSuccessfully() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào AlertFrame, điều hướng trang khởi tạo trang AlertFrame
		// mới
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		// Từ AlertFrame page click vào Browser form
		BrowserWindowsPage browserWindowsPage = alertsFrameWindowsPage.clickBrowserWindows();
		DemoSamplePage demoSamplePage = browserWindowsPage.clickNewtab();
		
		String actualHeading= demoSamplePage.testBase.getText(demoSamplePage.lbHeading, demoSamplePage.timeout_short);
		assertEquals(actualHeading, "This is a sample page");
	}
	
	//@Test
	public void verifyNewWindowSuccessfully() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào AlertFrame, điều hướng trang khởi tạo trang AlertFrame
		// mới
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		// Từ AlertFrame page click vào Browser form
		BrowserWindowsPage browserWindowsPage = alertsFrameWindowsPage.clickBrowserWindows();
		DemoSamplePage demoSamplePage = browserWindowsPage.clickNewWindow();
		
		String actualHeading= demoSamplePage.testBase.getText(demoSamplePage.lbHeading, demoSamplePage.timeout_short);
		assertEquals(actualHeading, "This is a sample page");
	}
	
	@Test
	public void verifyNewWindowMessageSuccessfully() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào AlertFrame, điều hướng trang khởi tạo trang AlertFrame
		// mới
		
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		
		// Từ AlertFrame page click vào Browser form
		BrowserWindowsPage browserWindowsPage = alertsFrameWindowsPage.clickBrowserWindows();
		DemoSampleWindowAlertPage alertPage = browserWindowsPage.clickNewWindowMessage();
		
		//String actualText= alertPage.testBase.getText(alertPage.lbMessage,alertPage.timeout_short);
		//assertEquals(actualText, "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
	}
	
	

}
