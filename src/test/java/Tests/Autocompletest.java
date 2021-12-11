package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Autocomplete;
import resources.Base;

public class Autocompletest extends Base {
	
	@Test(priority = 6)
	public void complete() throws InterruptedException, IOException {
		
		
		Autocomplete ac= new Autocomplete();
		Thread.sleep(2000);
		clck(ac.getAutocompl());
		clck(ac.getsingleComplete());
		keyboardClas(ac.getautoComplete(), prop.getProperty("tags"));
		clck(ac.getMulComplete());
		clck(ac.getMulValueTags());
		mulAutoComplete(ac.getMulValueTags(),prop.getProperty("multags").split(","));
		
		
		
		
	}
}
