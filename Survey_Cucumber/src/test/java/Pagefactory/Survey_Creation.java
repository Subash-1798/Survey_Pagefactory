package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Survey_Creation {

	WebDriver driver;

	public Survey_Creation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"digi-side-toggle digi-side-left-min\"]")
	public static WebElement Sidebutton;

	@FindBy(xpath = "//div[text()='Survey Management']")
	public static WebElement SurveyManagement;

	@FindBy(xpath = "//button[text() = 'Survey Bank']")
	public static WebElement Surveybank;

	@FindBy(xpath = "//button[text()='Survey Templates']")
	public static WebElement SurveyTemplate;

	@FindBy(xpath = "//button[text() = 'Course level']")
	public static WebElement courselevel;

	@FindBy(xpath = "//button[text()='Create Survey']")
	public static WebElement CreateSurvey;

	@FindBy(xpath = "//div[text()='Create Template']")
	public static WebElement CreateTemplate;

	@FindBy(xpath = "//input[@placeholder=\"Enter Survey Title\"]")
	public static WebElement EnterSurveyTitle;

	@FindBy(xpath = "//textarea[@placeholder=\"Enter Description\"]")
	public static WebElement EnterDescription;

	@FindBy(xpath = "(//input[@type=\"radio\"])[3]")
	public static WebElement SurveyLevel;

	@FindBy(xpath = "//div[@role=\"combobox\"]")
	public static WebElement Surveytypeselection;

	@FindBy(xpath = "//label[text()='Automation final testing']")
	public static WebElement Surveytype;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
	public static WebElement LearningOutcome;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[3]")
	public static WebElement MappingOutcome;

	@FindBy(xpath = "(//input[@type=\"checkbox\"])[4]")
	public static WebElement TagMapping;

	@FindBy(xpath = "//button[text()='Start Creation']")
	public static WebElement StartCreation;

}
