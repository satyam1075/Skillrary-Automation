package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	@FindBy(id="Selenium Training")
	private WebElement seleniumTraining;

	@FindBy(id="cartArea")
	private WebElement cartArea;

	public WebElement getSeleniumTraining() {
		return seleniumTraining;
	}

	public WebElement getCartArea() {
		return cartArea;
	}
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[1]")
	private WebElement facebookLike;
	
	public TestingPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  likeBtn() 
	{
		facebookLike.click();
	}
	
}


