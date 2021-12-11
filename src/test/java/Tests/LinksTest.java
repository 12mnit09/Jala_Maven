package Tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import pageObjects.Links;
import resources.Base;

public class LinksTest extends Base {

	@Test
	public void linksmet()
			throws InterruptedException, MalformedURLException, IOException {

		Links li = new Links();
		clck(li.getLinks());
		Thread.sleep(1000);
		clck(li.getWorkingLinks());
		Thread.sleep(1000);
		pop_up(li.getLink1());
		Thread.sleep(2000);
		driver.navigate().refresh();
		pop_up(li.getLink2());
		Thread.sleep(2000);
		driver.navigate().refresh();
		pop_up(li.getLink3());
		Thread.sleep(2000);

		// broken Links

		clck(li.getBrokenLinks());
		Thread.sleep(2000);
		brokenLinks(li.getBrokenLinks());

		// image links
		clck(li.getImgLinks());
		pop_up2(li.getGrowLinks());
		Thread.sleep(3000);
		pop_up2(li.getLinkedinkss());
		Thread.sleep(2000);
		pop_up2(li.getGoogleLinks());
		Thread.sleep(2000);
		pop_up2(li.getJalatech());

		

	}

}
