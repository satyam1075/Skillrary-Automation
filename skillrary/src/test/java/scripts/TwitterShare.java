package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.CoreJavaForSelenium;
import pom.SeleniumPage;
import pom.SkillraryLoginPage;

public class TwitterShare extends BaseClass
{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException 
	{
		SkillraryLoginPage sl = new SkillraryLoginPage(driver);
		sl.search(pdata.getData("name"));
		sl.clickSearch();
		
		SeleniumPage sp = new SeleniumPage(driver);
		sp.seleniumTab();
		
		CoreJavaForSelenium cjs = new CoreJavaForSelenium(driver);
		cjs.acceptCookies();
		utilies.switchFrame(driver);
		cjs.play();
		Thread.sleep(4000);
		cjs.pause();
		utilies.switchBackFrame(driver);
		cjs.shareTwitter();
		
		//Assert.assertEquals(driver.getCurrentUrl(), pdata.getData("twitterUrl"));
		
		
	}
}

