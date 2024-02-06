package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	
	//Mở trình duyệt
	public void openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\01Automation\\03Tools\\chromedriver.exe");
		 driver= new ChromeDriver();
		//zoom nhỏ màn hình
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.body.style.zoom = '50%'");

		//Gõ url
		//driver.get("https://demoqa.com/");
		driver.get(url);		
		//maximize màn hình
		driver.manage().window().maximize();
	}
	
	//scroll to end page
	public void scrollToEndPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	//room nhỏ màn hình
	public void zoomOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '50%'");
	}
	
	//hàm lấy giá trị attribute trả về
	public String getValueOfAttribute(By locator,String attributeName) {
		String result="";
		result= driver.findElement(locator).getAttribute(attributeName);
		return result;
	}

}
