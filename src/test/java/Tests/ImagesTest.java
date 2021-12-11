package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Images;
import resources.Base;

public class ImagesTest extends Base {

	@Test(priority = 8)
	public void upload() throws IOException {
		

		Images i = new Images();
		clck(i.getImages());
		upLoadFile(i.getUpload());
		allInAllElement(i.getFileName(), "firstimage");
		clck(i.getUploadFile());
		driver.navigate().refresh();

	}

}
