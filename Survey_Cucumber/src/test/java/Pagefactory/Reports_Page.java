package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports_Page {

	WebDriver driver;

	public Reports_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class=\"cursor-pointer\"])[2]")
	public static WebElement Reporticon;

	@FindBy(xpath = "//div[text()='View Reports']")
	public static WebElement ViewReports;

	@FindBy(xpath = "(//div/h6[text() = 'Overall Response'])[2]")
	public static WebElement learningoutcomesection;

	@FindBy(xpath = "//div/h6[text() = 'Overall Response Rate']")
	public static WebElement learningoutcomesection1;

	@FindBy(xpath = "//button[text() = 'Section A']")
	public static WebElement SectionA;

	@FindBy(xpath = "//button[text() = 'Statistic Analysis']")
	public static WebElement staticAnalysis;

	@FindBy(xpath = "//h6[text()='Questionnaire - Mean & Standard Deviation']")
	public static WebElement Question;

	@FindBy(xpath = "//div/span[text()='Individual Questions']")
	public static WebElement individualQuestions;

	@FindBy(xpath = "//div/span[text()='Individual Questions']")
	public static WebElement dragDownToQuestion;

	@FindBy(xpath = "//div[text() = 'Why Java for Automation testing?']")
	public static WebElement L1;

	@FindBy(xpath = "//span[text()='Individual Responders']")
	public static WebElement individualResponders;

	@FindBy(xpath = "//span[text()='Individual Responders']")
	public static WebElement individualResponderslink;

	@FindBy(xpath = "//div/button[text()='View Reports']")
	public static WebElement viewreports1;

	@FindBy(xpath = "(//*[name()='svg'])[12]")
	public static WebElement Goback;

	@FindBy(xpath = "//span[text()='Sentiment Analysis']")
	public static WebElement SentimentAnalysis;

	@FindBy(xpath = "(//*[name()='svg'])[14]")
	public static WebElement checkQA;

	@FindBy(xpath = "//div[text()='View By Individual Response']")
	public static WebElement IndividualResponse1;

}
