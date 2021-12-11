package Tests;

import org.testng.annotations.Test;

import pageObjects.More;
import resources.Base;

public class Multipletabs extends Base {

	@Test(priority = 4)
	public void multipleTabs() throws InterruptedException {

		More m = new More();
		Thread.sleep(2000);
		clck(m.gMore());
		Thread.sleep(2000);
		clck(m.getMultipleTabs());
		Thread.sleep(2000);
		clck(m.getPlanToSucceed());
		allInAllElement(m.getFirstTextBox(), "I will become SDET");
		allInAllElement(m.getSecondTextBox(),
				"I will become an expert in Automation Tester");

		clck(m.getUnLearning());
		allInAllElement(m.getFirstUnlearning(),
				"Deepak Prabhu will become SDET");
		allInAllElement(m.getSecondUnlearning(), "He is good in Selenium");

		clck(m.getWaysOfLearning());
		allInAllElement(m.getWolFirstTextBox(), "Deepak Prabhu");
		allInAllElement(m.getWolSecondTextBox(), "I need my atha Baby");

	}

}
