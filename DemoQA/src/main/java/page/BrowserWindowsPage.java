package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class BrowserWindowsPage extends Page {
	public By btnNewTab = By.id("tabButton");
	public By btnNewWindow = By.id("windowButton");
	public By btnNewWindowMessage = By.id("messageWindowButton");

	public BrowserWindowsPage(WebDriver dr) {
		super(dr);
	}

	public DemoSamplePage clickNewtab() {
		testBase.switchNewWindowByClick(btnNewTab, timeout_short);
		return new DemoSamplePage(driverWeb);

	}

	public DemoSamplePage clickNewWindow() {
		testBase.switchNewWindowByClick(btnNewWindow, timeout_short);
		return new DemoSamplePage(driverWeb);
	}

	public DemoSampleWindowAlertPage clickNewWindowMessage() {
		System.out.println("Start Click");
		testBase.switchNewWindowByClick(btnNewWindowMessage, timeout_short);
		
		return new DemoSampleWindowAlertPage(driverWeb);
	}
	
	
	public void clickNewtabToPlus() {
		String MainTab = driverWeb.getWindowHandle();
		System.out.println(MainTab);
		driverWeb.switchTo().newWindow(WindowType.TAB);
		driverWeb.get("https://demoqa.com/sample");
		System.out.println(driverWeb.getWindowHandles());
		driverWeb.switchTo().window(MainTab);
		System.out.println(driverWeb.getTitle());
	}

}
