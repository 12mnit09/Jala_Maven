package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Employee extends Base {

	public Employee() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@href='#'])[2]")
	private WebElement employeeOption;

	public WebElement getEmployeeOption() {

		return this.employeeOption;
	}

	@FindBy(xpath = "//i[@class='fa fa-pencil-square-o']")
	private WebElement createOption;

	public WebElement getCreateOption() {

		return this.createOption;
	}

	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement employeeFirstName;

	public WebElement getEmployeeFirstName() {

		return this.employeeFirstName;
	}

	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement employeeLastName;

	public WebElement getEmployeeLastName() {

		return this.employeeLastName;
	}

	@FindBy(xpath = "//input[@name='EmailId']")
	private WebElement employeeEmailId;

	public WebElement getEmployeeEmailId() {

		return this.employeeEmailId;
	}

	@FindBy(xpath = "//input[@name='MobileNo']")
	private WebElement employeeMobileNo;

	public WebElement getEmployeeMobileNo() {

		return this.employeeMobileNo;
	}

	@FindBy(xpath = "//input[@id='DOB']")
	private WebElement employeeDOB;

	public WebElement getEmployeeDOB() {

		return this.employeeDOB;
	}

	@FindBy(xpath = "//input[@id='rdbMale']")
	private WebElement employeeGender;

	public WebElement getEmployeeGender() {

		return this.employeeGender;
	}

	@FindBy(xpath = "//textarea[@id='Address']")
	private WebElement employeeAddress;

	public WebElement getEmployeeAddress() {

		return this.employeeAddress;
	}

	@FindBy(xpath = "//select[@id='CountryId']")
	private WebElement employeeCountry;

	public WebElement getEmployeeCountry() {

		return this.employeeCountry;
	}

	@FindBy(xpath = "//select[@id='CityId']")
	private WebElement employeeCity;

	public WebElement getEmployeeCity() {

		return this.employeeCity;
	}

	@FindBy(xpath = "//input[@id='chkSkill_5']")
	private WebElement aws;

	public WebElement getAws() {

		return this.aws;
	}

	@FindBy(xpath = "//input[@id='chkSkill_3']")
	private WebElement devOPS;

	public WebElement getDevOPS() {

		return this.devOPS;
	}

	@FindBy(xpath = "//input[@id='chkSkill_1']")
	private WebElement qaAutomation;

	public WebElement getQaAutomation() {

		return this.qaAutomation;
	}
	
	@FindBy(xpath="//select[@name='CountryId']")
	private WebElement allCountry;
	
	public WebElement getAllCountry() {
		return this.allCountry;
	}	
	
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement createButton;
	
	public WebElement getCreateButton() {
		return this.createButton;
	}
	
	@FindBy(xpath = "(//i[@class='fa fa-hand-o-right'])[1]")
	private WebElement multipleTabs;

	public WebElement getMultipleTabs() {
		return this.multipleTabs;
	}
	
	@FindBy(xpath="//input[@id='MobileNo']")
	private WebElement fname;
	
	public WebElement getFname() {
		return this.fname;
	}
}
