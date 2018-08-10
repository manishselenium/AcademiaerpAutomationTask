package TestSuit;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PagesAcademia.SignInPage;
import Utils.ReadPropertiesFileAcedmia;

public class TestCasesSignInAcedmia {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();

	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	SignInPage LoginPageObj = new SignInPage();
	String CurrentUrl = "http://school.academiaerp.com/";

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFileAcedmia readConfigFile = new ReadPropertiesFileAcedmia();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void LoginWithWrongUsernamePassword() throws Exception {

		LoginPageObj.WrongUserNamePassword(driver);
		driver.get("http://school.academiaerp.com/");

		int EleSize = driver.findElements(By.xpath("//span[@id='button-1049-btnIconEl']")).size();

		int i = 1;

		Assert.assertEquals(i, EleSize);
	}

	@Test(priority = 2)
	public void LoginWithBlankUsernamePassword() throws Exception {

		LoginPageObj.BlankUserNamePassword(driver);
		driver.get("http://school.academiaerp.com/");
		int EleSize = driver.findElements(By.xpath("//span[@id='button-1049-btnIconEl']")).size();

		int i = 1;

		Assert.assertEquals(i, EleSize);
	}

	@Test(priority = 3)
	public void LoginWithBlankUserNameOnly() throws Exception {

		LoginPageObj.LoginWithBlankUserName(driver);
		driver.get("http://school.academiaerp.com/");
		int EleSize = driver.findElements(By.xpath("//span[@id='button-1049-btnIconEl']")).size();

		int i = 1;

		Assert.assertEquals(i, EleSize);
	}

	@Test(priority = 4)
	public void LoginWithBlankPasswordOnly() throws Exception {

		LoginPageObj.LoginWithBlankPassword(driver);
		driver.get("http://school.academiaerp.com/");
		int EleSize = driver.findElements(By.xpath("//span[@id='button-1049-btnIconEl']")).size();

		int i = 1;

		Assert.assertEquals(i, EleSize);

	}

	@AfterTest
	public void CloseBrowser() {
		LoginPageObj.CloseBrowser(driver);

	}
}
