package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page.AlertsFrameWindowsPage;
import page.HomePage;
import page.ModalDialogsPage;

public class ModalDialogsTest extends TestCase{
	public By btnSmallModal = By.id("showSmallModal");
	public By txtSmallModal = By.xpath("//div[@class='modal-body']");
	public By btnLargeModal = By.id("showLargeModal");
	public By txtLargeModal = By.xpath("//div[@class='modal-body']/p[1]");
	
	//@Test
	public void verifyDisplayModal() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		alertsFrameWindowsPage.testBase.scrollToEndPage();
		ModalDialogsPage modalDialogsPage= alertsFrameWindowsPage.clickModalDialogs();
		modalDialogsPage.testBase.clickByLocator(btnSmallModal);
		String actualSmallModal=testBase.getTextByLocator(txtSmallModal);
		String expectedSmallModal= "This is a small modal. It has very less content";
		assertEquals(actualSmallModal, expectedSmallModal);
	}
	
	@Test
	public void verifyDisplayModal1() {
		HomePage homePage = new HomePage(testBase.driver);
		// homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePage.clickAlertsFrameWindows();
		alertsFrameWindowsPage.testBase.scrollToEndPage();
		ModalDialogsPage modalDialogsPage= alertsFrameWindowsPage.clickModalDialogs();
		modalDialogsPage.testBase.clickByLocator(btnLargeModal);
		String actualSmallModal=testBase.getTextByLocator(txtLargeModal);
		String expectedSmallModal= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		assertEquals(actualSmallModal, expectedSmallModal);
	}

}
