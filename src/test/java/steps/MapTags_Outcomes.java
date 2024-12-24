package steps;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Outcome_Tag;
import Pagefactory.createquestion;
import base.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MapTags_Outcomes {
	
	
	static WebDriver driver;
	
	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	Outcome_Tag Outcome;
	
	public MapTags_Outcomes(Hooks base) {
		this.base = base;
	}

	@Then("select the settings")
	public void selectTheSettings() throws InterruptedException {
		
		Outcome = new Outcome_Tag (base.getdriver());
		Wait = new WebDriverWait(base.getdriver(), Duration.ofSeconds(30));
		action = new Actions(base.getdriver());
		js = (JavascriptExecutor) base.getdriver();
 		WebElement SA1 = Outcome_Tag.Section;
		js.executeScript("arguments[0].scrollIntoView(true);", SA1);
		Thread.sleep(5000);

	}

	@And("click on More settings")
	public void clickonMoresettings() {
		Outcome_Tag.Moresettings.click();

	}

	@Then("click on outcome button")
	public void clickOnOutcomeButton() throws InterruptedException {
		WebElement Outcomebutton = Outcome_Tag .outcomebutton;
		Outcomebutton.click();
		Thread.sleep(5000);
	}

	@Then("click on course outcome")
	public void clickOnCourseOutcome() throws InterruptedException {
		Outcome_Tag.CourseOutcome.click();
		Thread.sleep(5000);
	}

	@Then("select framework")
	public void selectFramework() {
		Outcome_Tag.selectFramework.click();
	}

	@Then("click on Knowledge")
	public void clickOnKnowledge() {
		Outcome_Tag.Knowledge.click();
	}

	@Then("select Clo1checkbox")
	public void selectClo1checkbox() {
		Outcome_Tag.Clo1checkbox.click();
	}

	@Then("click on Tag")
	public void clickOnTag() {
		Outcome_Tag.Tag.click();
	}

	@Then("select TagSelection")
	public void selectTagSelection() {
		Outcome_Tag.Tagselection.click();
	}

	@Then("click on save")
	public void clickOnSave() {
		Outcome_Tag.save.click();
	}

	@Then("Select the participants")
	public void selectTheParticipants() throws InterruptedException {

		Thread.sleep(5000);
		Outcome_Tag.particpantsdropdown.click();
		Outcome_Tag.leveldropdown.click();
		Outcome_Tag.yeardropdown.click();
		Thread.sleep(5000);
		WebElement PLO3 = Outcome_Tag.plo3;
		action.doubleClick(PLO3).perform();
		Thread.sleep(5000);
	}

	@Then("Click on clock1")
	public void clickOnClock1() throws InterruptedException {

		Outcome_Tag.clock1select.click();
		Outcome_Tag.clock1label.click();
		WebElement clock1 = base.getdriver().findElement(By.xpath("//input[@placeholder=\"hh:mm (a|p)m\"]"));
		LocalTime currentTime = LocalTime.now();
		LocalTime newTime = currentTime.plusMinutes(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String formattedTime = newTime.format(formatter);
		Thread.sleep(2000);
		clock1.sendKeys(Keys.CONTROL + "a");
		clock1.sendKeys(Keys.DELETE);
		clock1.sendKeys(formattedTime);

	}

	@Then("Click on Ok button")
	public void clickOnOkButton() throws InterruptedException {
		Outcome_Tag.ok.click();
		Thread.sleep(5000);
	}

	@Then("select clock2")
	public void selectClock2() throws InterruptedException {

		Outcome_Tag.clock2select.click();
		Outcome_Tag.clock2label.click();
		WebElement clock2 = Outcome_Tag.clock2;
				
		Thread.sleep(5000);
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		LocalTime newTime = currentTime.plusMinutes(4);
		String formattedTime = newTime.format(formatter);
		Thread.sleep(2000);
		clock2.sendKeys(Keys.CONTROL + "a");
		clock2.sendKeys(Keys.DELETE);
		clock2.sendKeys(formattedTime);

	}

	@Then("Publish survey")
	public void publishSurvey() throws InterruptedException {
		Outcome_Tag.publishsurvey.click();
		Thread.sleep(2000);
		createquestion.overview.click();
		Thread.sleep(3000);
		createquestion.courseOverview.click();

	}
	
	
	
}
