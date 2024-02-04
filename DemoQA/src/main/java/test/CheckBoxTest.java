package test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import page.CheckBoxPage;
import page.ElementPage;
import page.HomePage;

public class CheckBoxTest extends TestCase{
	@Test
	// TC01
	public void verifyCheckBoxCorrectly() {
		HomePage homePage = new HomePage(testBase.driver);
		//homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Element, điều hướng trang khởi tạo trang ElementPage mới
		ElementPage elementPage = homePage.clickElement();
		// Từ ElementPage click vào CheckBoxPage, điều hướng trang khởi tạo trang CheckBoxPage mới
		CheckBoxPage checkBoxPage = elementPage.clickCheckBox();
		String actualClass = checkBoxPage.testBase.getValueOfAttribute(checkBoxPage.chkHome, "class");
		// 1. The [Home] checkbox is unchecked.
		assertTrue(actualClass.contains("rct-icon-uncheck"));
		checkBoxPage.clickIconCheckBox();
		//2. Text is shown: "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"
		String actualHomeText = checkBoxPage.getActualHomeText();
		String expectedHomeText ="You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		
		assertEquals(actualHomeText,expectedHomeText );
		assertTrue(actualClass.contains("rct-icon-check"));
		
	}

}
