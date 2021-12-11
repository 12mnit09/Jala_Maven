package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Menu extends Base {

	public Menu() {

		PageFactory.initElements(driver, this);
	}

	// Single Menu Page Objects

	@FindBy(xpath = "(//i[@class='fa fa-hand-o-right'])[2]")
	private WebElement menu;

	public WebElement getMenu() {
		return this.menu;
	}

	@FindBy(xpath = "//a[text()='Single Menus']")
	private WebElement singleMenu;

	public WebElement getSingleMenu() {
		return this.singleMenu;
	}

	@FindBy(xpath = "//a[text()='Testing']")
	private WebElement testing;

	public WebElement getTesting() {
		return this.testing;
	}

	@FindBy(xpath = "//a[text()='Java']")
	private WebElement java;

	public WebElement getJava() {
		return this.java;
	}

	@FindBy(xpath = "//a[text()='.Net']")
	private WebElement net;

	public WebElement getNet() {
		return this.net;
	}

	@FindBy(xpath = "//a[text()='Data Base']")
	private WebElement dataBase;

	public WebElement getDataBase() {
		return this.dataBase;
	}

	// Submenus Menu Page Objects

	@FindBy(xpath = "//a[text()='Sub Menus']")
	private WebElement subMenus;

	public WebElement getSubMenus() {
		return this.subMenus;
	}

	@FindBy(xpath = "(//a[text()='Testing'])[2]")
	private WebElement subTesting;

	public WebElement getSubTesting() {
		return this.subTesting;
	}

	@FindBy(xpath = "//a[text()='Selenium']")
	private WebElement subSelenium;

	public WebElement getSubSelenium() {
		return this.subSelenium;
	}
	@FindBy(xpath = "//a[text()='Manual Testing']")
	private WebElement subManualTesting;

	public WebElement getSubManualTesting() {
		return this.subManualTesting;
	}
	@FindBy(xpath = "//a[text()='DB Testing']")
	private WebElement subDBTesting;

	public WebElement getSubDBTesting() {
		return this.subDBTesting;
	}

	@FindBy(xpath = "//a[text()='Unit Testing']")
	private WebElement subUnitTesting;

	public WebElement getSubUnitTesting() {
		return this.subUnitTesting;
	}

	// sub menu Java
	@FindBy(xpath = "//a[text()='JAVA']")
	private WebElement subJavaa;

	public WebElement getSubJavaa() {
		return this.subJavaa;
	}

	@FindBy(xpath = "//a[text()='Adv Java']")
	private WebElement subAdvJava;

	public WebElement getSubAdvJava() {
		return this.subAdvJava;
	}

	@FindBy(xpath = "//a[text()='Core Java']")
	private WebElement subCoreJava;

	public WebElement getSubCoreJava() {
		return this.subCoreJava;
	}

	@FindBy(xpath = "//a[text()='Spring']")
	private WebElement subSpring;

	public WebElement getSubSpring() {
		return this.subSpring;
	}

	@FindBy(xpath = "//a[text()='Hibernate']")
	private WebElement subHibernate;

	public WebElement getSubHibernate() {
		return this.subHibernate;
	}

	// .Net

	@FindBy(xpath = "(//a[text()='.Net'])[2]")
	private WebElement subNet;

	public WebElement getSubNet() {
		return this.subNet;
	}

	@FindBy(xpath = "//a[text()='C#']")
	private WebElement subC;

	public WebElement getSubC() {
		return this.subC;
	}

	@FindBy(xpath = "//a[text()='ASP.NET']")
	private WebElement subAsp;

	public WebElement getSubAsp() {
		return this.subAsp;
	}

	@FindBy(xpath = "//a[text()='ADO.NET']")
	private WebElement subAdo;

	public WebElement getSubAdo() {
		return this.subAdo;
	}

	@FindBy(xpath = "//a[text()='MVC']")
	private WebElement subMvc;

	public WebElement getSubMvc() {
		return this.subMvc;
	}

	// Database
	@FindBy(xpath = "//a[text()='Database']")
	private WebElement subDataBase;

	public WebElement getSubDataBase() {
		return this.subDataBase;
	}

	@FindBy(xpath = "//a[text()='SQL']")
	private WebElement subSql;

	public WebElement getSubSql() {
		return this.subSql;
	}

	@FindBy(xpath = "//a[text()='My Sql']")
	private WebElement subMySql;

	public WebElement getSubMySql() {
		return this.subMySql;
	}

	@FindBy(xpath = "//a[text()='Oracle']")
	private WebElement subOracle;

	public WebElement getSubOracle() {
		return this.subOracle;
	}

	@FindBy(xpath = "//a[text()='H2']")
	private WebElement subH2;

	public WebElement getSubH2() {
		return this.subH2;
	}

}
