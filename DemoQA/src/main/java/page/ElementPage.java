package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPage extends Page {

	// hàm contructor do kế thừa Class Page có hàm khởi tạo
	public ElementPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	// click vào TextBox
	public TextBoxPage clickTextBox() {
		driverWeb.findElement(By.xpath("//span[text()='Text Box']")).click();
		return new TextBoxPage(driverWeb);
	}

	// click vào CheckBox
	public CheckBoxPage clickCheckBox() {
		driverWeb.findElement(By.xpath("//span[text()='Check Box']")).click();
		return new CheckBoxPage(driverWeb);
	}

	// click vào Webtable
	public WebTablePage clickWebTable() {
		driverWeb.findElement(By.xpath("//span[text()='Web Tables']")).click();
		return new WebTablePage(driverWeb);
	}

}
