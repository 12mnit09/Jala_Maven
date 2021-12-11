package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class More extends Base {

	public More() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement more;

	public WebElement gMore() {

		return this.more;
	}

	@FindBy(xpath = "(//i[@class='fa fa-hand-o-right'])[1]")
	private WebElement multipleTabs;

	public WebElement getMultipleTabs() {
		return this.multipleTabs;
	}

	@FindBy(xpath = "//a[text()='Plan to Succeed']")
	private WebElement planToSucceed;

	public WebElement getPlanToSucceed() {
		return this.planToSucceed;
	}

	@FindBy(xpath = "//input[@id='textbox1']")
	private WebElement firstTextBox;

	public WebElement getFirstTextBox() {
		return this.firstTextBox;
	}

	@FindBy(xpath = "//input[@id='textbox2']")
	private WebElement secondTextBox;

	public WebElement getSecondTextBox() {
		return this.secondTextBox;
	}

	@FindBy(xpath="//a[text()='UnLearning']")
	private WebElement unLearning;
	
	public WebElement getUnLearning() {
		return this.unLearning;
	}
	
	@FindBy(xpath="//input[@id='textbox3']")
	private WebElement firstUnlearning;

	public WebElement getFirstUnlearning() {
		return this.firstUnlearning;
	}
	
	@FindBy(xpath="//input[@id='textbox4']")
	private WebElement secondUnlearning;
	
	public WebElement getSecondUnlearning() {
		return this.secondUnlearning;
	}
	
	@FindBy(xpath="//a[text()='Ways of Unlearning']")
	private WebElement waysOfLearning;
	
	public WebElement getWaysOfLearning() {
		return this.waysOfLearning;
	}
	
	@FindBy(xpath="//input[@id='textbox5']")
	private WebElement wolFirstTextBox;
	
	public WebElement getWolFirstTextBox() {
		return this.wolFirstTextBox;
	}
	
	
	@FindBy(xpath="//input[@id='textbox6']")
	private WebElement wolSecondTextBox;
	
	public WebElement getWolSecondTextBox() {
		return this.wolSecondTextBox;
	}
	
	
	
	
	
	
	
	
	
}
