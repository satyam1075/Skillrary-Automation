package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.AddToCart;
import pom.SkillraryDemoAppLogin;
import pom.SkillraryLoginPage;

public class AddingCourseToCart extends BaseClass
{
	@Test
	public void course() throws FileNotFoundException, IOException 
	{
		SkillraryLoginPage sLog = new SkillraryLoginPage(driver);
		sLog.gearsButton();
		sLog.demoApplication();
		utilies.switchTabs(driver);
		
		SkillraryDemoAppLogin demo = new SkillraryDemoAppLogin(driver);
		utilies.mouseHover(driver, demo.getCourseBtn());
		demo.seleniumtariningtab();
		
		AddToCart cart = new AddToCart(driver);
		utilies.doubleClick(driver, cart.getAddBtn());
		cart.addtocartbutton();
		utilies.alertPopup(driver);
		
		
		Assert.assertEquals(driver.getTitle(), pdata.getData("addtocarttitle"));
	}
}
