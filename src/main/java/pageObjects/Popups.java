package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Popups extends Base {

	public Popups() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),' Popups')]")
	private WebElement popups;

	public WebElement getPopups() {
		return this.popups;
	}

	@FindBy(xpath = "//a[@id='btn-one']")
	private WebElement popupOne;

	public WebElement getPopupOne() {
		return this.popupOne;
	}

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	private WebElement googl;

	public WebElement getGoogl() {
		return this.googl;
	}

	@FindBy(xpath = "//a[@id='btn-two']")
	private WebElement popupTwo;

	public WebElement getPopupTwo() {
		return this.popupTwo;
	}

	@FindBy(xpath = "//input[@id='search-strings']")
	private WebElement tutorialPoints;

	public WebElement getTutorialPoints() {
		return this.tutorialPoints;
	}

	@FindBy(xpath = "//a[@id='btn-three']")
	private WebElement popupThree;

	public WebElement getPopupThree() {
		return this.popupThree;
	}

	@FindBy(xpath = "//input[@class='form-control form-email-widget']")
	private WebElement tutorialteacher;

	public WebElement getTutorialteacher() {
		return this.tutorialteacher;
	}

	@FindBy(xpath = "//a[@id='btn-four']")
	private WebElement popupFour;

	public WebElement getPopupFour() {
		return this.popupFour;
	}
	
	@FindBy(xpath="//input[@id='gsc-i-id1']")
	private WebElement javaTPoint;
	
	public WebElement getJavaTPoint() {
		return this.javaTPoint;
	}
	
	@FindBy(xpath="//p[contains(text(),'Developed')]")
	private WebElement devloped;
	
	public WebElement getDevloped() {
		return this.devloped;
	}

	@FindBy(xpath = "//a[@id='btn-five']")
	private WebElement popupFive;

	public WebElement getPopupFive() {
		return this.popupFive;
	}
	

	@FindBy(xpath = "//a[@id='btn-six']")
	private WebElement popupSix;

	public WebElement getPopupSix() {
		return this.popupSix;
	}

	@FindBy(xpath = "//input[@id='alertBox']")
	private WebElement alertBox;

	public WebElement getAlertBox() {
		return this.alertBox;
	}
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement close;
	
	public WebElement getClose() {
		return this.close;
	}

	@FindBy(xpath = "//input[@id='confirmBox']")
	private WebElement confirmBox;

	public WebElement getConfirmBox() {
		return this.confirmBox;

	}

	@FindBy(xpath = "//button[@id='promptBtn']")
	private WebElement promptBtn;

	public WebElement getPromptBtn() {
		return this.promptBtn;

	}

}
