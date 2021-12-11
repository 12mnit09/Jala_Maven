package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Autocomplete extends Base {

	public Autocomplete() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()=' Autocomplete']")
	private WebElement autocompl;

	public WebElement getAutocompl() {
		return this.autocompl;
	}

	@FindBy(xpath = "//a[contains(text(),'Single Values')]")
	private WebElement singleComplete;

	public WebElement getsingleComplete() {
		return this.singleComplete;
	}

	@FindBy(xpath = "//input[@id='txtSingleAutoComplete']")
	private WebElement autoComplete;

	public WebElement getautoComplete() {
		return this.autoComplete;
	}
	
	//multiple autocomplete
	
	@FindBy(xpath="//a[contains(text(),'Multiple Values')]")
	private WebElement mulComplete;
	
	public WebElement getMulComplete() {
		return this.mulComplete;
	}

	@FindBy(xpath="//input[@id='txtMultipleAutoComplete']")
	private WebElement mulValueTags;
	
	public WebElement getMulValueTags() {
		return  this.mulValueTags;
	}
}
