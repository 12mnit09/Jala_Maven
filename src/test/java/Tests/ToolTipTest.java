package Tests;

import org.testng.annotations.Test;

import pageObjects.Tooltip;
import resources.Base;

public class ToolTipTest extends Base {
	@Test(priority = 10)
	public void toolTip() {
		Tooltip to = new Tooltip();
		clck(to.getToolTip());
		toolTips(to.getButtonToolTip());
	}
}
