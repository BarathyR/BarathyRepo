package Retest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecuteClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//execute main class
//test conflicts
		WebDriver d= launchBrowser();
		launchUrl("http://adactinhotelapp.com");
		
		MaxWindow();
		WebElement txtUser = d.findElement(By.id("username"));
		
		TxtValue(txtUser, "RBarathy");
		
		WebElement Password = d.findElement(By.id("password"));
		TxtValue (Password,"password");
		
		WebElement btnLogin= d.findElement(By.id("login"));
		btnClick(btnLogin);
		
		WebElement Loc = d.findElement(By.id("location"));
		DropDown(Loc, "Brisbane");
		WebElement Hotel = d.findElement(By.id("hotels"));
		DropDown(Hotel, "Hotel Hervey");
		WebElement RoomType = d.findElement(By.id("room_type"));
		DropDown(RoomType, "Double");
		WebElement NoOfRoom = d.findElement(By.id("room_nos"));
		DropDown(NoOfRoom, "3 - Three");
		WebElement Adult = d.findElement(By.id("adult_room"));
		DropDown(Adult, "2 - Two");
		WebElement Child = d.findElement(By.id("child_room"));
		DropDown(Child, "3 - Three");
		WebElement ChkIn = d.findElement(By.id("datepick_in"));
		TxtValue (ChkIn,"29/01/2020");
		WebElement ChkOut = d.findElement(By.id("datepick_out"));
		TxtValue (ChkOut,"30/01/2021");
		WebElement SearchBtn= d.findElement(By.id("Submit"));
		btnClick(SearchBtn);
		WebElement RadioBtn= d.findElement(By.id("radiobutton_0"));
		btnClick(RadioBtn);
		WebElement ContBtn= d.findElement(By.id("continue"));
		btnClick(ContBtn);
		
		WebElement txtFirst = d.findElement(By.id("first_name"));
		
		TxtValue(txtFirst, "Barathy");
		WebElement txtLast = d.findElement(By.id("last_name"));
		
		TxtValue(txtLast, "R");
		WebElement txtAdd = d.findElement(By.id("address"));
		
		TxtValue(txtAdd, "Perumbakkam");
        WebElement txtCreNum = d.findElement(By.id("cc_num"));
		
		TxtValue(txtCreNum, "5678902345678921");
		
		WebElement CCType = d.findElement(By.id("cc_type"));
		DropDown(CCType, "VISA");
		WebElement ExpDate = d.findElement(By.id("cc_exp_month"));
		DropDown(ExpDate, "June");
		WebElement Year = d.findElement(By.id("cc_exp_year"));
		DropDown(Year, "2022");
		WebElement txtCVV = d.findElement(By.id("cc_cvv"));
		TxtValue(txtCVV, "567");
		WebElement BookBtn= d.findElement(By.id("book_now"));
		btnClick(BookBtn);
	
		WebDriverWait w =new WebDriverWait(d, 20);
				w.until(ExpectedConditions.urlToBe("http://adactinhotelapp.com/BookingConfirm.php"));
		WebElement OrderNo= d.findElement(By.id("order_no"));
		
		System.out.println(OrderNo.getAttribute("value"));
		
	}
}
