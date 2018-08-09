package PagesAcademia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ExcelUtils1;
import Utils.ExcelUtilsAcedemia;
import Utils.WrappeForGenericMethodAcademia;

public class SignInPage {

	By user = By.id("username-inputEl");
	By password = By.id("password-inputEl");
	By SignIn = By.xpath("//span[@id='button-1049-btnIconEl']");
	WrappeForGenericMethodAcademia Action = new WrappeForGenericMethodAcademia();
	ExcelUtilsAcedemia obj = new ExcelUtilsAcedemia();

	public void WrongUserNamePassword(WebDriver driver) throws Exception {

		String Username = ExcelUtils1.GetCellData(3, 0);
		String Password = ExcelUtils1.GetCellData(3, 1);

		Action.Sendkeys(driver, user, Username);
		Action.Sendkeys(driver, password, Password);
		Action.Click(driver, SignIn);

	}

	public void BlankUserNamePassword(WebDriver driver) throws Exception {

		Action.Sendkeys(driver, user, "");
		Action.Sendkeys(driver, password, "");

	}

	public void LoginWithBlankUserName(WebDriver driver) throws Exception {
		String Password = ExcelUtils1.GetCellData(3, 1);

		Action.Sendkeys(driver, user, "");
		Action.Sendkeys(driver, password, Password);

	}

	public void LoginWithBlankPassword(WebDriver driver) throws Exception {

		String Username = ExcelUtils1.GetCellData(3, 0);

		Action.Sendkeys(driver, user, Username);
		Action.Sendkeys(driver, password, "");

	}

	public void CloseBrowser(WebDriver driver) {

		driver.close();
	}

}