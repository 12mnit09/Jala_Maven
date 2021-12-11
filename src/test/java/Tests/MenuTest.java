package Tests;

import org.testng.annotations.Test;

import pageObjects.Menu;
import resources.Base;

public class MenuTest extends Base {

	
	@Test(priority = 5)
	public void singleMenu() throws InterruptedException {

		Menu me= new Menu();
		// To select the menu we use the Action Class
		clck(me.getMenu());
		clck(me.getSingleMenu());
		actionMenu(me.getTesting());
		Thread.sleep(2000);
		actionMenu(me.getJava());
		Thread.sleep(2000);
		actionMenu(me.getNet());
		Thread.sleep(2000);
		actionMenu(me.getDataBase());
		
		//To select the sub menus
		clck(me.getSubMenus());
		//Testing
		actionMenu(me.getSubTesting());
		actionMenu(me.getSubSelenium());
		Thread.sleep(1000);
		actionMenu(me.getSubManualTesting());
		Thread.sleep(1000);
		actionMenu(me.getSubDBTesting());
		Thread.sleep(1000);
		actionMenu(me.getSubUnitTesting());
		
		//Java
		actionMenu(me.getSubJavaa());
		actionMenu(me.getSubAdvJava());
		Thread.sleep(1000);
		actionMenu(me.getSubCoreJava());
		Thread.sleep(1000);
		actionMenu(me.getSubSpring());
		Thread.sleep(1000);
		actionMenu(me.getSubHibernate());
		Thread.sleep(1000);
		//.Net
		actionMenu(me.getSubNet());
		actionMenu(me.getSubC());
		Thread.sleep(1000);
		actionMenu(me.getSubAsp());
		Thread.sleep(1000);
		actionMenu(me.getSubNet());
		Thread.sleep(1000);
		actionMenu(me.getSubAdo());
		
		//Database
		actionMenu(me.getSubDataBase());
		actionMenu(me.getSubSql());
		Thread.sleep(1000);
		actionMenu(me.getSubMySql());
		Thread.sleep(1000);
		actionMenu(me.getSubOracle());
		Thread.sleep(1000);
		actionMenu(me.getSubH2());
		
		
		
		
		
		
		
	}

}
