package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Survey_Creation;
import base.Hooks;
import io.cucumber.java.en.Then;

public class CreateSurvey {

	
	static WebDriver driver;
	
	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	Survey_Creation creator;
	
	public CreateSurvey(Hooks base) {
		this.base = base;
	}
	
	@Then("click on Survey")
	public void clickOnSurvey() throws InterruptedException {

		Wait = new WebDriverWait(base.getdriver(), Duration.ofSeconds(30));
		action = new Actions(base.getdriver());
		js = (JavascriptExecutor) base.getdriver();
		creator = new Survey_Creation(base.getdriver());
				
		Survey_Creation.Sidebutton.click();
		WebElement Surveybutton = base.getdriver().findElement(By.xpath("//div[text() = 'Survey']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Surveybutton);
		Surveybutton.click();
		Thread.sleep(5000);

	}

	@Then("click on Survey Management")
	public void clickOnSurveyManagement() throws InterruptedException {
		Survey_Creation.SurveyManagement.click();
		Thread.sleep(5000);
	}

	@Then("click on Survey bank")
	public void clickOnSurveyBank() {
		Survey_Creation.Surveybank.click();
	}

	@Then("click on Survey Templates")
	public void clickOnSurveyTemplates() {
		Survey_Creation.SurveyTemplate.click();
	}

	@Then("click on Course Level")
	public void clickOnCourseLevel() throws InterruptedException {
		Thread.sleep(5000);
		Survey_Creation.courselevel.click();
	}

	@Then("click on CreateSurvey")
	public void clickOnCreateSurvey() throws InterruptedException {
		Thread.sleep(5000);
		Survey_Creation.CreateSurvey.click();
	}

	@Then("click on CreateTemplate")
	public void clickOnCreateTemplate() {
		Survey_Creation.CreateTemplate.click();
	}

	@Then("enter Survey Title as {string}")
	public void enterSurveyTitleAs(String string) {
		Survey_Creation.EnterSurveyTitle.sendKeys("Survey Automation");
	}

	@Then("enter Description as {string}")
	public void enterDescriptionAs(String string) {
		Survey_Creation.EnterDescription.sendKeys("Testing");
	}

	@Then("click on Survey Level")
	public void clickOnSurveyLevel() {
		Survey_Creation.SurveyLevel.click();
	}

	@Then("click on Survey type selection")
	public void clickOnSurveyTypeSelection() {
		Survey_Creation.Surveytypeselection.click();
	}

	@Then("click on Survey type")
	public void clickOnSurveyType() {
		Survey_Creation.Surveytype.click();
	}

	@Then("select Learning Outcome")
	public void selectLearningOutcome() {
		Survey_Creation.LearningOutcome.click();
	}

	@Then("select Mapping Outcome")
	public void selectMappingOutcome() {
		Survey_Creation.MappingOutcome.click();
	}

	@Then("selectTagOutcome")
	public void selectTagOutcome() {
		Survey_Creation.TagMapping.click();
	}

	@Then("click on start Creation")

	public void clickOnStartCreation() {
		Survey_Creation.StartCreation.click();
	}
	
	
	
}
