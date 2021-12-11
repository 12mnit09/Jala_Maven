package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Images extends Base {

	public Images() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Images')]")
	private WebElement images;

	public WebElement getImages() {
		return this.images;
	}

	@FindBy(xpath = "//input[@id='file']")
	private WebElement upload;

	public WebElement getUpload() {
		return this.upload;
	}

	@FindBy(xpath = "//input[@id='fileName']")
	private WebElement fileName;

	public WebElement getFileName() {
		return this.fileName;
	}

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement uploadFile;

	public WebElement getUploadFile() {
		return this.uploadFile;
	}

}
