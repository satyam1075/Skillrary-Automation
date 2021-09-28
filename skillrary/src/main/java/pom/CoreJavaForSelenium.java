package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium 
{
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath = " //span[text()='Share via Twitter']")
	private WebElement twitter;
	
	@FindBy(id="gdpr-cookie-accept")
	private WebElement accept;

	public CoreJavaForSelenium(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void play() 
	{
		playbtn.click();
	}
	public void pause() 
	{
		pausebtn.click();
	}
	public void shareTwitter() 
	{
		twitter.click();
	}
	
	public void acceptCookies() 
	{
		accept.click();
	}
}