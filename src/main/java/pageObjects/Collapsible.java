package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Collapsible extends Base {
	
	public Collapsible() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),' Collapsible Content')]")
	private WebElement colCont;
	
	public WebElement getColCont() {
		return this.colCont;
	}
	
	@FindBy(xpath="//a[contains(text(),'Single Collapse')]")
	private WebElement singleCollapse;
	
	public WebElement getSingleCollapse() {
		return this.singleCollapse;
	}
	
	@FindBy(xpath="//a[@aria-controls='collapseOne']")
	private WebElement singleCollapse1;
	
	public WebElement getSingleCollapse1() {
		return this.singleCollapse1;
	}
	
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[2]")
	private WebElement singleCollapse2;
	
	public WebElement getSingleCollapse2() {
		return this.singleCollapse2;
		
	}
	
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[3]")
	private WebElement singleCollapse3;
	
	public WebElement getSingleCollapse3() {
		return this.singleCollapse3;
		
	}
	
	//Multiple collapse
	
	@FindBy(xpath="//a[contains(text(),'Multiple Collapse')]")
	private WebElement multipleCollapse;
	
	public WebElement getMultipleCollapse() {
		return   this.multipleCollapse;
	}
	
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[4]")
	private WebElement collWithCollapse;
	
	public WebElement getColWithCollapse() {

		return this.collWithCollapse;
	}
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[5]")
	private WebElement collWithCollapse2;
	
	public WebElement getColWithCollapse2() {

		return this.collWithCollapse2;
	}
	
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[6]")
	private WebElement collWithCollapse3;
	
	public WebElement getColWithCollapse3() {

		return this.collWithCollapse3;
	}
	
	@FindBy(xpath="(//i[@class='more-less glyphicon glyphicon-plus'])[7]")
	private WebElement collWithCollapse4;
	
	public WebElement getColWithCollapse4() {

		return this.collWithCollapse4;
	}
}
