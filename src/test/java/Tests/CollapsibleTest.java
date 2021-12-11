package Tests;

import org.testng.annotations.Test;

import pageObjects.Collapsible;
import resources.Base;

public class CollapsibleTest extends Base {
	
    @Test(priority = 7)
	public void collapsibleContent() throws InterruptedException {

    	Collapsible co= new Collapsible();
    	clck(co.getColCont());
    	Thread.sleep(3000);
    	clck(co.getSingleCollapse());
    	Thread.sleep(3000);
    	clck(co.getSingleCollapse1());
    	Thread.sleep(3000);
    	clck(co.getSingleCollapse2());
    	
    	//multiple collapse
    	clck(co.getMultipleCollapse());
    	Thread.sleep(2000);
    	clck(co.getColWithCollapse());
    	Thread.sleep(2000);
    	clck(co.getColWithCollapse2());
    	
    	
	}


}
