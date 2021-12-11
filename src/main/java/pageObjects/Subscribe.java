package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Subscribe extends Base {

	public Subscribe() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Subscribe to News Letter']")
	private WebElement subscrLetter;

	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement subscrFirstName;

	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement subscrLastName;

	@FindBy(xpath = "//input[@id='EmailId']")
	private WebElement subscrEmailid;

	@FindBy(xpath = "//input[@id='MobileNo']")
	private WebElement subscrMobileno;

	@FindBy(xpath = "//input[@name='Country']")
	private WebElement subscrCountry;

	@FindBy(xpath = "//input[@name='State']")
	private WebElement subscrState;

	@FindBy(xpath = "//input[@name='City']")
	private WebElement subscrCity;

	@FindBy(xpath = "//input[@name='Captcha']")
	private WebElement subscrCaptcha;

	@FindBy(xpath = "//a[text()='Back']")
	private WebElement subscrBack;

	public WebElement getSubscrBack() {

		return this.subscrBack;
	}

	public WebElement getSubscrLetter() {

		return this.subscrLetter;

	}

	public WebElement getSubscrFirstName() {

		return this.subscrFirstName;

	}

	public WebElement getSubscrLastName() {

		return this.subscrLastName;

	}
	public WebElement getSubscrEmailid() {

		return this.subscrEmailid;

	}
	public WebElement getSubscrMobileno() {

		return this.subscrMobileno;

	}
	public WebElement getSubscrCountry() {

		return this.subscrCountry;

	}

	public WebElement getSubscrState() {

		return this.subscrState;

	}

	public WebElement getSubscrCity() {

		return this.subscrCity;

	}
	public WebElement getSubscrCaptcha() {

		return this.subscrCaptcha;

	}

}
