package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage extends Page{
	public By lbInputSearch=By.xpath("//input[@id='searchBox']");

	public WebTablePage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	public void inputSearch(String textInputSearch) {
		//click vao Type to Search
		driverWeb.findElement(By.xpath("//input[@id='searchBox']")).click();
		//Nhập input data search
		driverWeb.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(textInputSearch);
		//click button search
		driverWeb.findElement(By.xpath("//div[@class='input-group-append']/span[1]//*[name()='svg']")).click();	
	}
	public void clickButtonAdd() {
		//click button Add
		driverWeb.findElement(By.id("addNewRecordButton")).click();
	}
	
	public void addAccount(String firstName, String lastName, String userEmail, String age, String salary, String department) {
		//Nhập firstname
		driverWeb.findElement(By.id("firstName")).sendKeys(firstName);
		//nhap lastname
		driverWeb.findElement(By.id("lastName")).sendKeys(lastName);
		//nhap email
		driverWeb.findElement(By.id("userEmail")).sendKeys(userEmail);
		//nhap age
		driverWeb.findElement(By.id("age")).sendKeys(age);
		//nhap salary
		driverWeb.findElement(By.id("salary")).sendKeys(salary);
		//nhap Department
		driverWeb.findElement(By.id("department")).sendKeys(department);
	}
	
	public void clickSubmit() {
		//click submit
		driverWeb.findElement(By.id("submit")).click();
	}

}
