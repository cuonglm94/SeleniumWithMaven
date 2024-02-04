package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page {
	public By lbName=By.id("name");
	public By lbEmail=By.id("email");
	public By lbCurrentAddress=By.xpath("//p[@id='currentAddress']");
	public By lbPermananetAddress=By.xpath("//p[@id='permanentAddress']");
	public By txtEmail=By.id("userEmail");

	// hàm contructor do kế thừa Class Page có hàm khởi tạo
	public TextBoxPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	// Nhập input data đúng cho TC01
	public void inputData(String userName, String userEmail, String currentAddress, String  permanentAddress) {
		// Nhập input data
		driverWeb.findElement(By.id("userName")).sendKeys(userName);
		driverWeb.findElement(txtEmail).sendKeys(userEmail);
		driverWeb.findElement(By.id("currentAddress")).sendKeys(currentAddress);
		driverWeb.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
	}
	
	// Nhập input data sai cho TC02
	/*
	 * public void InputData1(String userName, String userEmail1, String
	 * currentAddress, String permanentAddress) { // Nhập input data
	 * driverWeb.findElement(By.id("userName")).sendKeys(userName);
	 * driverWeb.findElement(By.id("userEmail")).sendKeys(userEmail1);
	 * driverWeb.findElement(By.id("currentAddress")).sendKeys(currentAddress);
	 * driverWeb.findElement(By.id("permanentAddress")).sendKeys(permanentAddress);
	 * }
	 */
	
	//click button Submit
	public void clickSubmit() {
		testBase.scrollToEndPage();
		// Nhập input data
		driverWeb.findElement(By.id("submit")).click();
	}
	
	//get text
	public String getActualText(By locator) {
		String result ="";
		String originText = driverWeb.findElement(locator).getText();
		//Cắt chuỗi từ phải đến dấu ':'
		int index = originText.indexOf(":");
		result = originText.substring(index + 1);
		return result;
	}
	
	//get
	/*
	 * public String getValueOfAttribute() { String result=""; result=
	 * driverWeb.findElement(txtEmail).getAttribute("class"); return result; }
	 */

}
