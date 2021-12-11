package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Links extends Base {

	public Links() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Links')]")
	private WebElement links;

	public WebElement getLinks() {
		return this.links;
	}

	// Working Links

	@FindBy(xpath = "//a[contains(text(),'Working Links')]")
	private WebElement workingLinks;

	public WebElement getWorkingLinks() {
		return this.workingLinks;
	}

	@FindBy(xpath = "(//a[contains(text(),'Link 1')])[1]")
	private WebElement link1;

	public WebElement getLink1() {
		return this.link1;
	}

	@FindBy(xpath = "(//a[contains(text(),'Link 2')])[1]")
	private WebElement link2;

	public WebElement getLink2() {
		return this.link2;
	}

	@FindBy(xpath = "(//a[contains(text(),'Link 3')])[1]")
	private WebElement link3;

	public WebElement getLink3() {
		return this.link3;
	}

	// Broken Links

	@FindBy(xpath = "//a[contains(text(),'Broken Links')]")
	private WebElement brokenLinks;

	public WebElement getBrokenLinks() {
		return this.brokenLinks;
	}

	// image links
	@FindBy(xpath = "//a[contains(text(),'Image Links')]")
	private WebElement imgLinks;

	public WebElement getImgLinks() {
		return this.imgLinks;
	}

	@FindBy(xpath = "//img[@alt='Growic Link']")
	private WebElement growLinks;

	public WebElement getGrowLinks() {
		return this.growLinks;
	}

	@FindBy(xpath = "//img[@alt='Linkedin Link']")
	private WebElement linkeInLinks;

	public WebElement getLinkedinkss() {

		return this.linkeInLinks;
	}

	@FindBy(xpath = "//img[@alt='Goggle Link']")
	private WebElement googleLink;

	public WebElement getGoogleLinks() {

		return this.googleLink;
	}

	@FindBy(xpath = "//img[@alt='Jala Technologies Link']")
	private WebElement jalaTechnolgiesLink;

	public WebElement getJalatech() {

		return this.jalaTechnolgiesLink;
	}

	// status codes

	@FindBy(xpath = "//a[contains(text(),'Status')]")
	private WebElement statusCodes;

	public WebElement getStatusCodes() {
		return this.statusCodes;
	}
	
	@FindBy(xpath="//a[contains(text(),'200')]")
	private WebElement two200;
	
	public WebElement getTwo200() {
		return this.two200;
	}
	
	@FindBy(xpath="//a[contains(text(),'301')]")
	private WebElement three301;
	
	public WebElement getThree301() {
		return this.three301;
	}
	
	@FindBy(xpath="//a[contains(text(),'404')]")
	private WebElement four404;
	
	public WebElement getFour404() {
		return this.four404;
	}
	
	@FindBy(xpath="//a[contains(text(),'500')]")
	private WebElement five500;
	
	public WebElement getFive500() {
		return this.five500;
	}
	

}
