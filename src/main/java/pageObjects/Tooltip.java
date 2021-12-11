package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Tooltip extends Base {

	
	public Tooltip() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Tooltips')])[1]")
	private WebElement toolTip;
	
	public WebElement getToolTip() {
		return this.toolTip;
	}
	
	@FindBy(xpath="//button[@id='btnTooltip']")
	private WebElement buttonToolTip;
	
	public WebElement getButtonToolTip() {
		return this.buttonToolTip;
	}
	
	
	
	
	
	
}
