package test;
import org.testng.annotations.Test;

import page.CheckBoxPage;
import page.ElementPage;
import page.HomePage;
import page.WebTablePage;

public class WebTableTest extends TestCase {
	String textInputSearch="Vega";
	
	String firstName="Lê Mạnh";
	String lastName="Cường";
	String userEmail="Cuong@gmail.com";
	String age="30";
	String salary="3000000";
	String department="HN";
	//@Test
	//TC01
	public void searchByFirstNameSuccessfully() {
		
		HomePage homePage = new HomePage(testBase.driver);
		//homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Element, điều hướng trang khởi tạo trang ElementPage mới
		ElementPage elementPage = homePage.clickElement();
		elementPage.testBase.scrollToEndPage();
		// Từ ElementPage click vào WebTablePage, điều hướng trang khởi tạo trang WebTablePage mới
		WebTablePage webTablePage = elementPage.clickWebTable();
		webTablePage.inputSearch(textInputSearch);
	}
	
	@Test
	//TC02
	public void registerNewAccountSuccessfully() {
		HomePage homePage = new HomePage(testBase.driver);
		//homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Element, điều hướng trang khởi tạo trang ElementPage mới
		ElementPage elementPage = homePage.clickElement();
		elementPage.testBase.scrollToEndPage();
		// Từ ElementPage click vào WebTablePage, điều hướng trang khởi tạo trang WebTablePage mới
		WebTablePage webTablePage = elementPage.clickWebTable();
		webTablePage.clickButtonAdd();
		webTablePage.addAccount(firstName, lastName, userEmail, age, salary, department);
		webTablePage.clickSubmit();
		
	}

}
