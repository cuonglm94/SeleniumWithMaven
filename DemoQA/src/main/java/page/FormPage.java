package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends Page {

	public FormPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
	
	public PractiveFormPage clickPractiveForm() {
		driverWeb.findElement(By.xpath("//span[text()='Practive Form']")).click();
		return new PractiveFormPage(driverWeb);
	}

}
