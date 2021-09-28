package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppLogin 
{
	@FindBy(id ="course")
	private WebElement courseBtn;
	
	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumTrainingBtn;
	
	@FindBy(xpath = "//select[@name = 'addresstype']")
	private WebElement dropbtn;
	
	
	public WebElement getDropbtn() {
		return dropbtn;
	}


	public SkillraryDemoAppLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getCourseBtn() {
		return courseBtn;
	}
	
	public void seleniumtariningtab() {
		seleniumTrainingBtn.click();
	}
}
