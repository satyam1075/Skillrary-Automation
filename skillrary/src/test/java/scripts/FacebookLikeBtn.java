package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.SkillraryDemoAppLogin;
import pom.SkillraryLoginPage;
import pom.TestingPage;

public class FacebookLikeBtn extends BaseClass

{

	@Test
	public void fbLike() throws FileNotFoundException, IOException 
	{
		SkillraryLoginPage sl = new SkillraryLoginPage(driver);
		sl.gearsButton();
		sl.demoApplication();
		utilies.switchTabs(driver);
		
		SkillraryDemoAppLogin d = new SkillraryDemoAppLogin(driver);
		utilies.dropDown(d.getDropbtn(), pdata.getData("coursedd"));
		 
		TestingPage t = new TestingPage(driver);
		utilies.dragAndDrop(driver, t.getSeleniumTraining(), t.getCartArea());
		t.likeBtn();
		
		
		Assert.assertEquals(driver.getCurrentUrl(), pdata.getData("fbTitle"));
		
		
	}
	
}
