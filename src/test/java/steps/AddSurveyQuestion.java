package steps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.createquestion;
import base.Hooks;
import io.cucumber.java.en.Then;

public class AddSurveyQuestion {
	
	static WebDriver driver;
	
	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	createquestion question;
	
	public AddSurveyQuestion(Hooks base) {
		this.base = base;
	}
	
	@Then("click on Add Question")
	public void clickOnAddQuestion() throws InterruptedException {
		question = new createquestion(base.getdriver());
		createquestion.Addquestion.click();
		Thread.sleep(2000);
		WebElement Ratingscale = createquestion.ratingscale;
		Ratingscale.click();
		Ratingscale.sendKeys(Keys.CONTROL + "a");
		Ratingscale.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Ratingscale.sendKeys(
				" Which phase of the Software Development Life Cycle (SDLC) is most suitable for Automation Testing?");
		Thread.sleep(5000);

	}

	@Then("duplicate the Question")
	public void duplicateTheQuestion() {
		createquestion.Duplicate.click();
	}

	@Then("require the question")
	public void requireTheQuestion() throws InterruptedException {
		Thread.sleep(2000);
		createquestion.Required.click();
	}

	@Then("delete the Question")
	public void deleteTheQuestion() {
		createquestion.Delete.click();
	}

	@Then("click on Add New Question")
	public void clickOnAddNewQuestion() throws InterruptedException {

		createquestion.question2.click();
		Thread.sleep(2000);
		WebElement inputElement = createquestion.inputelement;
		inputElement.click();
		inputElement.sendKeys(Keys.CONTROL + "a");
		inputElement.sendKeys(Keys.DELETE);
		inputElement.sendKeys(" Why Java for Automation testing?");
	}

	@Then("click on Long text")
	public void clickOnLongText() throws InterruptedException {
		
		createquestion.longtext.click();
		Thread.sleep(2000);
		createquestion.longtextbutton.click();
		Thread.sleep(2000);
		WebElement Longtextquestion = createquestion.longtextquestion;
		Longtextquestion.sendKeys(Keys.CONTROL + "a");
		Longtextquestion.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Longtextquestion.sendKeys(" Agile Software Development is based on which of the following type?");

	}

	@Then("click on Create Runner step Template Survey")
	public void clickOnCreateRunnerStepTemplateSurvey() {
		Wait = new WebDriverWait(base.getdriver(), Duration.ofSeconds(30));
		action = new Actions(base.getdriver());
		js = (JavascriptExecutor) base.getdriver();
		createquestion.CreateTemplateSurvey.click();
	}

	@Then("Switch to creator to Runner")
	public void switchToCreatorToRunner() throws InterruptedException {
		WebElement chooseElement1 = createquestion.chooseelement1;
		action.moveToElement(chooseElement1).perform();
		Thread.sleep(7000);
		WebElement subElement = createquestion.subelement;
		action.moveToElement(subElement).perform();
		Thread.sleep(5000);
		WebElement runnerElement = createquestion.runnerelement;
		action.moveToElement(runnerElement).perform();
		runnerElement.click();
		Thread.sleep(5000);
	}

	@Then("Switch the calendar")
	public void switchTheCalendar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement academiccalendar = createquestion.Academiccalendar;
		academiccalendar.click();
		Thread.sleep(5000);
		WebElement movedcalendar = createquestion.Movedcalendar;
		js.executeScript("arguments[0].scrollIntoView(true);", movedcalendar);
		action.moveToElement(movedcalendar).perform();
		movedcalendar.click();
		Thread.sleep(5000);
	}

	@Then("click on Run Survey")
	public void clickOnRunSurvey() {
		createquestion.RunSurvey.click();
	}

	@Then("Select  Program")
	public void selectProgram() {
		createquestion.Selectprogram.click();
	}

	@Then("click on Program name")
	public void clickOnProgramName() {
		createquestion.programname.click();
	}

	@Then("Select  term")
	public void selectTerm() {
		createquestion.selectTerm.click();
	}

	@Then("click on Regular")
	public void clickOnRegular() {
		createquestion.Regular.click();
	}

	@Then("Select Year")
	public void selectYear() {
		createquestion.selectyear.click();
	}

	@Then("click on Year")
	public void clickOnYear() {
		createquestion.year.click();
	}

	@Then("Select Level")
	public void selectLevel() {
		createquestion.selectlevel.click();
	}

	@Then("click on Level")
	public void clickOnLevel() {
		createquestion.level.click();
	}

	@Then("Select course")
	public void selectCourse() {
		createquestion.selectcourse.click();
	}

	@Then("click on course")
	public void clickOnCourse() {
		createquestion.Coursename.click();
	}

	@Then("Enter Survey version name as {string}")
	public void enterSurveyVersionNameAs(String string) {
		createquestion.Surveyversionname.sendKeys("Automation testing");
	}

	@Then("Add PLO")
	public void addPLO() {
		WebElement PLO = createquestion.plo;
		action.moveToElement(PLO).perform();
		PLO.click();

		WebElement PLO2 = createquestion.plo2;
		action.moveToElement(PLO2).perform();
		PLO2.click();
	}

	@Then("click on next")
	public void clickOnNext() {
		createquestion.next.click();
	}
	
	
	
}
