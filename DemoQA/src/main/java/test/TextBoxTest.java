package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import page.CheckBoxPage;
import page.ElementPage;
import page.HomePage;
import page.TextBoxPage;

//All testcase of Textbox Page
public class TextBoxTest extends TestCase {

	@Test
	// TC01
	public void SubmitSuccessfully() {
		// openBrowser();
		
		String userNameInput = "Cường";
		String userEmailInput = "Cuong@gmail.com";
		String currentAddressInput = "HN";
		String  permanentAddressInput ="HCM";
		// scroll home page to end
		HomePage homePage = new HomePage(testBase.driver);
		homePage.testBase.scrollToEndPage();

		// Từ Home Page click vào Element, điều hướng trang khởi tạo trang ElementPage mới
		ElementPage elementPage = homePage.clickElement();
		// Từ ElementPage click vào TextBoxPage, điều hướng trang khởi tạo trang TextBoxPage mới
		TextBoxPage textBoxPage = elementPage.clickTextBox();
		textBoxPage.inputData(userNameInput, userEmailInput, currentAddressInput, permanentAddressInput);
		textBoxPage.clickSubmit();
		assertEquals(textBoxPage.getActualText(textBoxPage.lbName), "Cường");
		assertEquals(textBoxPage.getActualText(textBoxPage.lbEmail), "Cuong@gmail.com");
		assertEquals(textBoxPage.getActualText(textBoxPage.lbCurrentAddress), "HN");
		assertEquals(textBoxPage.getActualText(textBoxPage.lbPermananetAddress), "HCM");
	}

	//@Test
	// TC02
	public void verifyInvalidEmail() {
		String userNameInput = "Cường";
		String userEmailInput = "Cuonggmail.com";
		String currentAddressInput = "HN";
		String  permanentAddressInput ="HCM";
		// scroll home page to end
		HomePage homePage = new HomePage(testBase.driver);
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Element, điều hướng trang khởi tạo trang ElementPage mới
		ElementPage elementPage = homePage.clickElement();
		// Từ ElementPage click vào TextBoxPage, điều hướng trang khởi tạo trang TextBoxPage mới
		TextBoxPage textBoxPage = elementPage.clickTextBox();
		textBoxPage.inputData(userNameInput, userEmailInput, currentAddressInput, permanentAddressInput);
		textBoxPage.testBase.scrollToEndPage();
		textBoxPage.clickSubmit();
		assertTrue(textBoxPage.testBase.getValueOfAttribute(textBoxPage.txtEmail,"class").contains("field-error"));
	}

	

}
