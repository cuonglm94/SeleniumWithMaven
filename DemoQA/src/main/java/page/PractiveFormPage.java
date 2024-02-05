package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PractiveFormPage extends Page{

	public PractiveFormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	public void inputPractiveForm() {
		//Nhập firtName
		driverWeb.findElement(By.id("firstName")).sendKeys("Lê Mạnh");
		//Nhập LastName
		driverWeb.findElement(By.id("lastName")).sendKeys("Cường");
		//Nhập Email
		driverWeb.findElement(By.id("useremail")).sendKeys("cuongmin94@gmail.com");
		//Click chọn giới tính
		driverWeb.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		//Nhập sdt
		driverWeb.findElement(By.id("userNumber")).sendKeys("0353173939");

		//Click DateOfBirth
		driverWeb.findElement(By.id("dateOfBirthInput")).click();
			//click chọn năm
		driverWeb.findElement(By.id("react-datepicker__year-select")).click();
		driverWeb.findElement(By.xpath("//option[text()='1994']")).click();
			//click chọn tháng
		driverWeb.findElement(By.id("react-datepicker__month-select")).click();
		driverWeb.findElement(By.xpath("//option[text()='December']")).click();
			//click chọn ngày
		//driverWeb.findElement(By.class("react-datepicker__day react-datepicker__day--009")).click();

		//Nhập subject
		//driverWeb.findElement(By.class("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3")).sendKeys("Nội dung ghi chú");

		//click Hotbies
		driverWeb.findElement(By.xpath("//label[text()='Reading']")).click();

		//Upload ảnh
		driverWeb.findElement(By.id("uploadPicture")).click();
		//chọn file ảnh
		//...

		//Nhập địa chỉ hiện tại
		driverWeb.findElement(By.id("currentAddress")).sendKeys("Hà Nội");

		//click chọn State
		driverWeb.findElement(By.xpath("//div[text()='Select State']")).click();
			//chọn nội dung trong State and City
		//	...
			
		//click chọn City

	}
	
	public void clickSubmit() {
		//click submit
		driverWeb.findElement(By.id("submit")).click();
	}

}
