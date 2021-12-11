package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static Select s;
	public static Actions act;
	public static WebDriverWait wait;
	public static Alert al;
	
	Logger log = Logger.getLogger(Base.class);

	public WebDriver initializeDriver() throws IOException {

		
		BasicConfigurator.configure();
		prop = new Properties();

		String propPath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\resources\\Jala.properties";
		FileInputStream fis = new FileInputStream(propPath);

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public void allInAllElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public void clck(WebElement element) {

		element.click();

	}

	public void getVal(WebElement element) {

		String attribute = element.getAttribute("placeholder");
		log.info(attribute);

	}

	public void cler(WebElement element) {

		element.clear();

	}

	public void moveEle(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}

	public void enaDis(WebElement element) {

		if (element.isEnabled()) {
			log.info("It is enabled");
		} else {
			log.info("it is disabled");
		}

	}

	public void dropDown(WebElement element, String elem) {
		s = new Select(element);
		s.selectByVisibleText(elem);
	}

	public void checkBox(WebElement element) {

		element.click();

	}

	public void countryCount(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {

			String text = webElement.getText();
			log.info(text);
		}

	}

	public void waitt(WebElement element) {

		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void actionMenu(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}

	public void keyboardClas(WebElement element, String value)
			throws InterruptedException {

		element.clear();
		element.sendKeys(value);
		String tex;
		do {
			element.sendKeys(Keys.ARROW_DOWN);
			tex = element.getAttribute("value");
			if (tex.equalsIgnoreCase(prop.getProperty("tags"))) {
				Thread.sleep(2000);
				element.sendKeys(Keys.ENTER);
				break;
			}
		} while (!tex.isEmpty());

	}

	public void mulAutoComplete(WebElement element, String arr[])
			throws InterruptedException {

		for (int i = 0; i < arr.length; i++) {

			element.sendKeys(arr[i]);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			element.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			element.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
	}

	public void upLoadFile(WebElement element) {

		String projectPath = System.getProperty("user.dir");
		element.sendKeys(projectPath + "\\ImageUpload\\n1.jpg");

	}

	public void sliderAct(WebElement element, int val, int val2) {

		act = new Actions(driver);
		act.dragAndDropBy(element, val, val2).build().perform();
		act.doubleClick();

	}

	public void toolTips(WebElement element) {

		act = new Actions(driver);
		act.moveToElement(element).build().perform();
		act.doubleClick(element).build().perform();
		String attribute = element.getAttribute("data-original-title");
		log.info(attribute);

	}

	public void popup(WebElement element, WebElement element2)
			throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		log.info("Parent Window Handle " + parentWindow + " "
				+ driver.getTitle());

		element.click();
		Thread.sleep(4000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				element2.sendKeys("Selenium");
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.navigate().refresh();
	}

	public void pop_up(WebElement element) throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		element.click();
		Thread.sleep(4000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.navigate().refresh();
	}

	public void alertpoUp(WebElement element) {
		element.click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();

	}

	public void promptAler(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		al = driver.switchTo().alert();
		log.info(al.getText());
		Thread.sleep(2000);
		al.sendKeys("Deepak Prabhu");
		al.dismiss();
	}

	public void brokenLinks(WebElement element)
			throws MalformedURLException, IOException, InterruptedException {

		List<WebElement> findElements = element.findElements(By.tagName("a"));

		Thread.sleep(2000);
		for (WebElement webElement : findElements) {
			String url = webElement.getAttribute("href");
			if (url == null || url.isEmpty()) {
				log.info("URL is Empty");
				continue;

			}
			HttpURLConnection huc = (HttpsURLConnection) (new URL(url)
					.openConnection());
			huc.connect();
			if (huc.getResponseCode() >= 400) {
				log.info(url + "is broken");
			} else {
				log.info(url + "is valid");
			}
		}

	}
	public void pop_up2(WebElement element) throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		element.click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}

	public void statusCodes(WebElement element)
			throws InterruptedException, IOException {

		String pareWind = driver.getWindowHandle();
		element.click();
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(pareWind)) {
				driver.switchTo().window(string);
				Thread.sleep(3000);
				List<WebElement> li = element.findElements(By.tagName("a"));
				log.info("No of Links:" + li.size());

				for (WebElement web : li) {
					String url = web.getAttribute("href");
					URL ur = new URL(url);
					HttpURLConnection openConnection = (HttpURLConnection) ur
							.openConnection();
					openConnection.setConnectTimeout(5000);
					openConnection.connect();
					if (openConnection.getResponseCode() >= 400) {
						log.info(url + "--->"
								+ openConnection.getResponseMessage()
								+ "is a broken link");
					} else {

						log.info(url + "--->"
								+ openConnection.getResponseMessage());
					}
				}
			}
		}

	}

}
