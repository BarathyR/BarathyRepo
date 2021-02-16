package Retest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		return driver;

	}
	
	public static void launchUrl(String url)
	{
		driver.get(url);
	}

	public static void MaxWindow() {
		driver.manage().window().maximize();

	}
	
	
	
	
	public static void TxtValue(WebElement e,String value) {
	
		e.sendKeys(value);

	}
	
	public static void btnClick(WebElement e1) {
		e1.click();
		
	
	}
	
	public static void DropDown(WebElement e2,String val1) {
		Select s=new Select (e2);
		
		s.selectByVisibleText(val1);
 
	}
}
