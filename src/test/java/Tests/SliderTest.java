package Tests;

import org.testng.annotations.Test;

import pageObjects.Slider;
import resources.Base;

public class SliderTest extends Base {

	@Test(priority = 9)
	public void sliding() throws InterruptedException {

		Slider s = new Slider();
		clck(s.getSlid());
		sliderAct(s.getSliderButton(),
				Integer.parseInt(prop.getProperty("sli1")),
				Integer.parseInt(prop.getProperty("sli1")));
		Thread.sleep(2000);

	}

}
