package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

	//hàm contructor do kế thừa Class Page có hàm khởi tạo
	public HomePage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	//click vào Element
	public ElementPage clickElement() {
		driverWeb.findElement(By.xpath("//h5[text()='Elements']")).click();
		return new ElementPage(driverWeb);
	}
	

}
