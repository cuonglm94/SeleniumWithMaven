package page;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page {
	
	//khởi tạo biến toàn cục trong class Page
	public WebDriver driverWeb;
	//Kế thừa Has-A đến Class TestBase
	public TestBase testBase= new TestBase();
	
	//Khởi tạo hàm constructor
	public Page(WebDriver dr) {
		//super();
		testBase.driver = dr;
		this.driverWeb = testBase.driver;
	}
	

}
