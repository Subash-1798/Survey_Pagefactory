package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type =\"input\"]")
	public static WebElement username;
	
	@FindBy(xpath = "//input [@type= \"password\"]")
	public static WebElement password;
	
	@FindBy(xpath = "//button [@type= 'submit']" )
	public static WebElement submit;
	
	@FindBy(xpath = "//img[@alt=\"DigiClass\"]")
	public static WebElement Digiclass;
	
    
    
    
}

