package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Slider extends Base {

	public Slider() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[contains(text(),' Slider')]")
	private WebElement slid;
	
	public WebElement getSlid() {
		return this.slid;
	}
	
	@FindBy(xpath="//div[@class='slider-handle min-slider-handle round']")
	private WebElement sliderButton;
	
	public WebElement getSliderButton() {
		return this.sliderButton;
	}
}
