package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Student {

	WebDriver incognitoDriver;

	public Student(WebDriver incognitoDriver) {

		this.incognitoDriver = incognitoDriver;
		PageFactory.initElements(incognitoDriver, this);

	}

	@FindBy(xpath = "//input[@class='floating-input ']")
	public static WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public static WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Submit;

	@FindBy(xpath = "//div[@class='digi-side-toggle digi-side-left-min']")
	public static WebElement studentsideicon;

	@FindBy(xpath = "(//a[@class='d-flex align-items-center TreeActive-inactive '])[2]")
	public static WebElement survey;

	@FindBy(xpath = "//a/div[text()='My Survey']")
	public static WebElement Mysurvey;

	@FindBy(xpath = "//button[text()='Course level']")
	public static WebElement Courselevel;

	@FindBy(xpath = "//div[text()='Regression-3 2023-2024']")
	public static WebElement AcademicCalendar1;

	@FindBy(xpath = "//li[text()='2024-20258']")
	public static WebElement changedcalendar;

	@FindBy(xpath = "(//span[text()='Strongly Agree'])[1]")
	public static WebElement StronglyAgree;

	@FindBy(xpath = "(//span[text()='Neutral'])[2]")
	public static WebElement Neutral;

	@FindBy(xpath = "//input[@title='Next']")
	public static WebElement Next;

	@FindBy(xpath = "(//span[text()='Strongly Disagree'])[1]")
	public static WebElement StronglyDisAgree;

	@FindBy(xpath = "(//span[text()='Agree'])[2]")
	public static WebElement Agree;

	@FindBy(xpath = "//textarea[@id=\"sq_104i\"]")
	public static WebElement OpenendAnswer;

	@FindBy(xpath = "//input[@title='Complete']")
	public static WebElement Complete;

	@FindBy(xpath = "(//*[name()='svg'])[13]")
	public static WebElement closeAnswer;

	@FindBy(xpath = "//input[@title=\"Next\"]")
	public static WebElement nextbutton;

	@FindBy(xpath = "//input[@title=\"Previous\"]")
	public static WebElement previous;

}
