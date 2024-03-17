package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoSamplePage extends Page{
	public By lbHeading= By.id("sampleHeading");
	//public By lbMessage= By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']");

	public DemoSamplePage(WebDriver dr) {
		super(dr);
	}
	

}
