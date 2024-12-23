package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createquestion {

	WebDriver driver;

	public createquestion(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Add Question']")
	public static WebElement Addquestion;

	@FindBy(xpath = "(//span[@class=\"sv-string-editor\"])[5]")
	public static WebElement ratingscale;

	@FindBy(xpath = "(//span[text()='Duplicate'])[2]")
	public static WebElement Duplicate;

	@FindBy(xpath = "(//span[text()='Required'])[2]")
	public static WebElement Required;

	@FindBy(xpath = "(//span[text()='Delete'])[3]")
	public static WebElement Delete;

	@FindBy(xpath = "(//span[text()='Add Question'])[1]")
	public static WebElement question2;

	@FindBy(xpath = "(//span[@class=\"sv-string-editor\"])[11]")
	public static WebElement inputelement;

	@FindBy(xpath = "(//span[@class=\"svc-element__question-type-selector-icon\"])[1]")
	public static WebElement longtext;

	@FindBy(xpath = "(//div[@title='Long Text'])[3]")
	public static WebElement longtextbutton;

	@FindBy(xpath = "(//span[@class=\"sv-string-editor\"])[17]")
	public static WebElement longtextquestion;

	@FindBy(xpath = "//button[text()=\"Create Template Survey\"]")
	public static WebElement CreateTemplateSurvey;

	@FindBy(xpath = "(//button[text()='Run Survey'])[1]")
	public static WebElement RunSurvey;

	@FindBy(xpath = "//div/span[text()='Select Program']")
	public static WebElement Selectprogram;

	@FindBy(xpath = "//li[text() = 'MT007 - Medicine Testing']")
	public static WebElement programname;

	@FindBy(xpath = "//div/span[text() = 'Select Term']")
	public static WebElement selectTerm;

	@FindBy(xpath = "//li[text()='Regular']")
	public static WebElement Regular;

	@FindBy(xpath = "//div/span[text()='Select Year']")
	public static WebElement selectyear;

	@FindBy(xpath = "//li[contains(@data-value,'year2')]")
	public static WebElement year;

	@FindBy(xpath = "//div/span[text()='Select Level']")
	public static WebElement selectlevel;

	@FindBy(xpath = "//li[text()='Level 4']")
	public static WebElement level;

	@FindBy(xpath = "//div/span[text()='Select Course']")
	public static WebElement selectcourse;

	@FindBy(xpath = "//li[@class=\"MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-35ms2r\"]")
	public static WebElement Coursename;

	@FindBy(xpath = "//input[@placeholder=\"Enter Survey version name\"]")
	public static WebElement Surveyversionname;

	@FindBy(xpath = "//button[text() = 'Overview']")
	public static WebElement overview;

	@FindBy(xpath = "//button[text()='Course level']")
	public static WebElement courseOverview;

	@FindBy(xpath = "//*[@class=\"fa fa-angle-down profile_icon \"]")
	public static WebElement chooseelement1;

	@FindBy(xpath = "//div[normalize-space()='Logged in as Survey Template Creator']")
	public static WebElement subelement;

	@FindBy(xpath = "//li[normalize-space()='Survey Template Runner']")
	public static WebElement runnerelement;

	@FindBy(xpath = "//div[text ()= 'Automation Staging']")
	public static WebElement Academiccalendar;

	@FindBy(xpath = "//li[text() = '2024-20258']")
	public static WebElement Movedcalendar;
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	public static WebElement plo;
	
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[3]")
	public static WebElement plo2;
	
	@FindBy(xpath = "//span[@class=\"text-nowrap px-3\"]")
	public static WebElement next;
	

}
