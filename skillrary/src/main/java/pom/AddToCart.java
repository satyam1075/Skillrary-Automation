package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart 
{
	@FindBy(id= "add")
	private WebElement addBtn;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-flat']")
	private WebElement addToCartbtn;
	
	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public AddToCart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartbutton() 
	{
		addToCartbtn.click();
	}
	
}
