package test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import common.Utils;
import page.ElementPage;
import page.FormPage;
import page.HomePage;
import page.PractiveFormPage;

public class PractiveFormTest extends TestCase{
	
	@Test
	//TC01
	public void submitDataSuccessfully() {
		//String dataFile = System.getProperty("user.dir") + "\\testdata\\DemoQA_TestCase_v1.3.xlsx";
		//String dataSheet= "PractiveForm_data";
		//List<HashMap<String, String>> dataList= Utils.getTestDataFromCSV(dataFile, dataSheet);
		
		String dataFile = System.getProperty("user.dir") + "\\testdata\\PracticeFormData.csv";
		List<Map> listData = Utils.getTestDataFromCSV(dataFile);
		//String [][] testDataTable=Utils.getTableObject(dataFile, dataSheet);
		
		
		HomePage homePage = new HomePage(testBase.driver);
		//homePage.testBase.zoomOut();
		homePage.testBase.scrollToEndPage();
		// Từ Home Page click vào Form, điều hướng trang khởi tạo trang Form mới
		FormPage formPage = homePage.clickForm();
		//Từ Form page click vào practive form
		PractiveFormPage practiveFormPage= formPage.clickPractiveForm();
		//practiveFormPage.testBase.zoomOut();
		//practiveFormPage.testBase.scrollToEndPage();
		//System.out.println(listData.get(0));
		//System.out.println(listData.get(0).get("First name").toString());
		practiveFormPage.inputData(listData.get(0));
		practiveFormPage.testBase.scrollToEndPage();
		practiveFormPage.clickSubmit();
		
		String actualStudentName = practiveFormPage.getTextResult(practiveFormPage.txtStudentName);
		String expectedStudenName= listData.get(0).get("First name").toString()+" "+ listData.get(0).get("Last name").toString();
		assertEquals(actualStudentName, expectedStudenName);
		
		String actualStudentEmail = practiveFormPage.getTextResult(practiveFormPage.txtStudentEmail);
		String expectedStudentEmail= listData.get(0).get("Email").toString();
		assertEquals(actualStudentEmail, expectedStudentEmail);
		
		String actualGender = practiveFormPage.getTextResult(practiveFormPage.txtGender);
		String expectedGender= listData.get(0).get("Gender").toString();
		assertEquals(actualGender, expectedGender);
		
		String actualMobile = practiveFormPage.getTextResult(practiveFormPage.txtMobile);
		String expectedMobile= listData.get(0).get("Mobile").toString();
		assertEquals(actualMobile, expectedMobile);
		
		String actualDateOfBirth = practiveFormPage.getTextResult(practiveFormPage.txtDateOfBirth).replace(","," ");
		String expectedDateOfBirth= listData.get(0).get("Date of Birth(DD MMM YYYY)").toString();
		assertEquals(actualDateOfBirth, expectedDateOfBirth);
		
		String actualSubjects = practiveFormPage.getTextResult(practiveFormPage.txtSubjects);
		String expectedSubjects= listData.get(0).get("Subjects").toString();
		assertEquals(actualSubjects, expectedSubjects);
		
		String actualHobbies = practiveFormPage.getTextResult(practiveFormPage.txtHobbies);
		String expectedHobbies= listData.get(0).get("Hobbies").toString();
		assertEquals(actualHobbies, expectedHobbies);
		
		String actualPicture = practiveFormPage.getTextResult(practiveFormPage.txtPicture);
		String urlPath = listData.get(0).get("Picture").toString();
		// Sử dụng lớp File để lấy tên tập tin
        File file = new File(urlPath);
        String fileName = file.getName();
		assertEquals(actualPicture, fileName);
		
		String actualAddress = practiveFormPage.getTextResult(practiveFormPage.txtAddress);
		String expectedAddress= listData.get(0).get("Current Address").toString();
		assertEquals(actualAddress, expectedAddress);
		
		String actualStateAndCity = practiveFormPage.getTextResult(practiveFormPage.txtStateAndCity);
		String expectedStateAndCity= listData.get(0).get("State").toString()+" "+ listData.get(0).get("City").toString();
		assertEquals(actualStateAndCity, expectedStateAndCity);
		
		
	}
	
}
