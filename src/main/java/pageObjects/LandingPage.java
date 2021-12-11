package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class LandingPage extends Base {

	public LandingPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='UserName']")
	private WebElement myUserName;

	@FindBy(xpath = "//input[@name='Password']")
	private WebElement myPassword;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-flat']")
	private WebElement mySignin;

	public WebElement getUserName() {

		return this.myUserName;
	}

	public WebElement getPassword() {

		return this.myPassword;
	}

	public WebElement getSignin() {

		return this.mySignin;
	}

}
