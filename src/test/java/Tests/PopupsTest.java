package Tests;

import org.testng.annotations.Test;

import pageObjects.Popups;
import resources.Base;

public class PopupsTest extends Base {

	@Test
	public void popupone() throws InterruptedException {

		Popups pp = new Popups();

		clck(pp.getPopups());

		popup(pp.getPopupOne(), pp.getGoogl());

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		popup(pp.getPopupTwo(), pp.getTutorialPoints());

		driver.navigate().refresh();

		Thread.sleep(2000);

		popup(pp.getPopupThree(), pp.getTutorialteacher());

		driver.navigate().refresh();

		popup(pp.getPopupFour(), pp.getJavaTPoint());

		driver.navigate().refresh();

		pop_up(pp.getPopupFive());

		driver.navigate().refresh();

		Thread.sleep(2000);

		pop_up(pp.getPopupSix());

		Thread.sleep(2000);

		alertpoUp(pp.getAlertBox());

		Thread.sleep(2000);

		driver.navigate().refresh();

		alertpoUp(pp.getConfirmBox());

		Thread.sleep(2000);

		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		promptAler(pp.getPromptBtn());
		
		Thread.sleep(2000);

		driver.navigate().refresh();
		

	}
}
