package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.Subscribe;
import resources.Base;

public class LoginTest extends Base {

	@Test(priority = 1)
	public void subscribeNewsLetter() {

		Subscribe sub = new Subscribe();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		clck(sub.getSubscrLetter());
		driver.getCurrentUrl();
		allInAllElement(sub.getSubscrFirstName(), prop.getProperty("firstname"));
		allInAllElement(sub.getSubscrLastName(), prop.getProperty("lastname"));
		allInAllElement(sub.getSubscrEmailid(), prop.getProperty("email"));
		allInAllElement(sub.getSubscrMobileno(), prop.getProperty("mobileno"));
		allInAllElement(sub.getSubscrCountry(), prop.getProperty("country"));
		allInAllElement(sub.getSubscrState(), prop.getProperty("state"));
		allInAllElement(sub.getSubscrCity(), prop.getProperty("city"));
		allInAllElement(sub.getSubscrCaptcha(), prop.getProperty("captcha"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clck(sub.getSubscrBack());
	}

	@BeforeMethod
	public void openApplication() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 2)
	public void login() {
		driver.getTitle();
		LandingPage lp = new LandingPage();
		enaDis(lp.getUserName());
		allInAllElement(lp.getUserName(), prop.getProperty("username"));
		enaDis(lp.getPassword());
		allInAllElement(lp.getPassword(), prop.getProperty("password"));
		clck(lp.getSignin());
	}
}