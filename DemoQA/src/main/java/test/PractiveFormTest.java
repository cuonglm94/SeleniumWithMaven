package test;

import org.testng.annotations.Test;

import page.ElementPage;
import page.FormPage;
import page.HomePage;
import page.PractiveFormPage;

public class PractiveFormTest extends TestCase{
	
	@Test
	//TC01
	public void submitDataSuccessfully() {
		HomePage homePage = new HomePage(testBase.driver);
		//homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Form, điều hướng trang khởi tạo trang Form mới
		FormPage formPage = homePage.clickForm();
		//Từ Form page click vào practive form
		PractiveFormPage practiveFormPage= formPage.clickPractiveForm();
		practiveFormPage.testBase.zoomOut();
		practiveFormPage.testBase.scrollToEndPage();
		practiveFormPage.inputPractiveForm();
		practiveFormPage.clickSubmit();
		
	}
}
