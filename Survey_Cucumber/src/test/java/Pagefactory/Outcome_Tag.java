package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Outcome_Tag {

	WebDriver driver;

	public Outcome_Tag(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text() = 'Section A']")
	public static WebElement Section;

	@FindBy(xpath = "(//button[@title=\"More Settings\"])[4]")
	public static WebElement Moresettings;

	@FindBy(xpath = "//div[@class=\"border d-flex align-items-center justify-content-between p-2 rounded\"]")
	public static WebElement outcomebutton;

	@FindBy(xpath = "//div[@class=\"pl-4 ml-2\"]")
	public static WebElement CourseOutcome;

	@FindBy(xpath = "//div[@class=\"d-flex align-items-center pl-5\"]")
	public static WebElement selectFramework;

	@FindBy(xpath = "(//div[@class=\"d-flex align-items-center pl-5 ml-4\"])[1]")
	public static WebElement Knowledge;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[5]")
	public static WebElement Clo1checkbox;

	@FindBy(xpath = "(//div[@class=\"border d-flex align-items-center justify-content-between p-2 rounded\"])[2]")
	public static WebElement Tag;

	@FindBy(xpath = "(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[8]")
	public static WebElement Tagselection;

	@FindBy(xpath = "//span[text() = 'Save']")
	public static WebElement save;

	@FindBy(xpath = "//label[text()='Medicine Testing']")
	public static WebElement particpantsdropdown;

	@FindBy(xpath = "(//*[@data-testid=\"ExpandMoreIcon\"])[1]")
	public static WebElement leveldropdown;

	@FindBy(xpath = "(//*[@data-testid=\"ExpandMoreIcon\"])[2]")
	public static WebElement yeardropdown;

	@FindBy(xpath = "(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[4]")
	public static WebElement plo3;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	public static WebElement clock1select;

	@FindBy(xpath = "//button[@aria-label=\"clock view is open, go to text input view\"]")
	public static WebElement clock1label;

	@FindBy(xpath = "(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"])[2]")
	public static WebElement clock2select;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInherit MuiIconButton-sizeMedium MuiPickersToolbar-penIconButton css-1beylcr\"]")
	public static WebElement clock2label;

	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd css-b52kj1\"])[5]")
	public static WebElement clock2;

	@FindBy(xpath = "//button[text()='OK']")
	public static WebElement ok;

	@FindBy(xpath = "//span[text()='Publish Survey']")
	public static WebElement publishsurvey;

}
