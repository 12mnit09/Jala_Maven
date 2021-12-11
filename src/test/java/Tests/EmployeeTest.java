package Tests;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.Employee;
import resources.Base;

public class EmployeeTest extends Base {

	Logger log = Logger.getLogger(EmployeeTest.class);
	@Test(priority = 3)
	public void employeeCreation() throws InterruptedException, IOException {

		Employee em = new Employee();
		driver.navigate().refresh();
		clck(em.getEmployeeOption());
		clck(em.getCreateOption());
		allInAllElement(em.getEmployeeFirstName(),
				prop.getProperty("firstname"));
		allInAllElement(em.getEmployeeLastName(), prop.getProperty("lastname"));
		allInAllElement(em.getEmployeeEmailId(), prop.getProperty("email"));
		getVal(em.getEmployeeEmailId());
		allInAllElement(em.getEmployeeMobileNo(), prop.getProperty("mobileno"));
		cler(em.getEmployeeMobileNo());
		allInAllElement(em.getEmployeeMobileNo(), prop.getProperty("mobileno"));
		allInAllElement(em.getEmployeeDOB(), prop.getProperty("DOB"));
		// Gender
		clck(em.getEmployeeGender());
		// To check total no of radio buttons in the attributes
		List<WebElement> findElement = driver
				.findElements(By.xpath("//input[@type='radio']"));
		log.info(findElement.size());

		// How to get the selected radio button label text
		List<WebElement> findElement2 = driver
				.findElements(By.xpath("//input[@name='rdbGender']"));
		int size = findElement2.size();
		log.info(size);
		
		
		for (WebElement webElement : findElement2) {

			String text = webElement.getText();
			log.info(text);
		}

		// Print all the options available in the dropdown
		countryCount(em.getAllCountry());

		allInAllElement(em.getEmployeeAddress(), prop.getProperty("address"));
		dropDown(em.getEmployeeCountry(), prop.getProperty("country"));
		dropDown(em.getEmployeeCity(), prop.getProperty("city"));
		checkBox(em.getAws());
		checkBox(em.getDevOPS());
		checkBox(em.getQaAutomation());
		clck(em.getCreateButton());
		waitt(em.getFname());
		
	}
}
