package steps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Reports_Page;
import Pagefactory.createquestion;
import base.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SurveyReports {

	
static WebDriver driver;
	
	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	Reports_Page Report;
	
	String mainWindowHandle;
	
	public SurveyReports(Hooks base) {
		this.base = base;
	}
	

	@When("switch to the MainWindow")
	public void switchToMainWindow() throws Exception {
		mainWindowHandle = base.getdriver().getWindowHandle();
		base.getdriver().switchTo().window(mainWindowHandle);
		base.getdriver().navigate().refresh();
		
		
		System.out.println("Switched back to the main window.");
	}

	@Then("click on Report icon")
	public void clickOnReportIcon() {
		Report = new Reports_Page(base.getdriver());
		Reports_Page.Reporticon.click();
		Wait = new WebDriverWait(base.getdriver(), Duration.ofSeconds(30));
		action = new Actions(base.getdriver());
		js = (JavascriptExecutor) base.getdriver();
	}

	@Then("click on ViewReports")
	public void clickOnViewReports() throws InterruptedException {
		Reports_Page.ViewReports.click();
		Thread.sleep(3000);
	}

	@Then("Move to Learningoutcomesection page")
	public void moveToLearningoutcomesectionPage() throws InterruptedException {
		WebElement Learningoutcomesection = Reports_Page.learningoutcomesection;
		js.executeScript("arguments[0].scrollIntoView(true);", Learningoutcomesection);
		Thread.sleep(5000);
		WebElement Learningoutcomesection1 = Reports_Page.learningoutcomesection1;
		js.executeScript("arguments[0].scrollIntoView(true);", Learningoutcomesection1);
		Thread.sleep(5000);
	}

	@Then("drag down to sectionA")
	public void dragDownToSectionA() throws InterruptedException {
		Reports_Page.SectionA.click();
		Thread.sleep(5000);
	}

	@Then("click on static Anaysis")
	public void clickOnStaticAnaysis() throws InterruptedException {
		Reports_Page.staticAnalysis.click();
		Thread.sleep(5000);
	}

	@Then("click am on the Questionnaire page")
	public void clickAmOnTheQuestionnairePage() throws InterruptedException {
		WebElement Questionnaire = Reports_Page.Question;
		js.executeScript("arguments[0].scrollIntoView(true);", Questionnaire);
		Thread.sleep(5000);
	}

	@Then("click on the individual question")
	public void clickOnTheIndividualQuestion() throws InterruptedException {
		WebElement IndividualQuestions = Reports_Page.individualQuestions;
		Actions actions = new Actions(base.getdriver());
		actions.moveToElement(IndividualQuestions, 500, 0).click().perform();
		Thread.sleep(5000);
	}

	@Then("drag down to question")
	public void dragDownToQuestion() throws InterruptedException {
		Reports_Page.dragDownToQuestion.click();
		Thread.sleep(5000);
	}

	@Then("click on Individual Responders")
	public void clickOnIndividualResponders() throws InterruptedException {

		WebElement i1 = Reports_Page.L1;
		js.executeScript("arguments[0].scrollIntoView(true);", i1);
		Thread.sleep(5000);
		WebElement IndividualResponders = Reports_Page.individualResponders;
		action.moveToElement(IndividualResponders, 500, 0).click().perform();
		Thread.sleep(5000);

	}

	@Then("click on the individual responders link")
	public void clickOnTheIndividualRespondersLink() throws InterruptedException {
		Reports_Page.individualResponderslink.click();
		Thread.sleep(5000);
	}

	@Then("click on the View Reports")
	public void clickOnTheViewReports() throws InterruptedException {
		Reports_Page.viewreports1.click();
		Thread.sleep(4000);
	}

	@Then("go back to the previous page")
	public void goBackToThePreviousPage() throws InterruptedException {
		Reports_Page.Goback.click();
		Thread.sleep(5000);

	}

	@Then("click on Sentiment Analysis")
	public void clickOnSentimentAnalysis() throws InterruptedException {
		Reports_Page.SentimentAnalysis.click();
		Thread.sleep(5000);
		Reports_Page.checkQA.click();
		Thread.sleep(5000);
	}

	@Then("scroll to View By Individual Response")
	public void scrollToViewByIndividualResponse() throws InterruptedException {
		WebElement Emoji = Reports_Page.IndividualResponse1;
		js.executeScript("arguments[0].scrollIntoView(true);", Emoji);
		Thread.sleep(5000);
		base.getdriver().quit();
	}
}
