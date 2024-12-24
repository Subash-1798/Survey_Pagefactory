package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Student;
import base.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentAnswer {
	
	
	static WebDriver incognitoDriver;

	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	Student Studentflow;
	
	
	String incognitoWindowHandle = "";
	String mainWindowHandle;
	
	public StudentAnswer(Hooks base) {
		this.base = base;
	}

	
	@When("switch to the incognito window")
	public void switchToTheIncognitoWindow() throws InterruptedException {
		base.getincognitodriver().switchTo().window(incognitoWindowHandle);
		Thread.sleep(3000);
		Wait = new WebDriverWait(base.getdriver(), Duration.ofSeconds(30));
		action = new Actions(base.getdriver());
		js = (JavascriptExecutor) base.getdriver();
		System.out.println("Switched to the incognito window.");

	}

	@Given("student enters username as {string}")
	public void studentEntersUsernameAs(String username) {
		Studentflow = new Student(base.getincognitodriver());
		Student.username.sendKeys("studenttesting10@digi.com");
	}

	@Given("student enters password as {string}")
	public void studentEntersPasswordAs(String password) {
		Student.Password.sendKeys("12345678");
	}

	@When("student clicks the submit button")
	public void studentClicksTheSubmitButton() {
		Student.Submit.click();

	}

	@Then("student login should be successful")
	public void studentLoginShouldBeSuccessful() throws InterruptedException {
		// You can add assertions here to verify successful login
		System.out.println("The login is successfully done");
		Thread.sleep(4000);
	}

	@Then("click on studentsideicon")
	public void clickOnStudentsideicon() {
		Student.studentsideicon.click();
	}

	@Then("click on survey1")
	public void clickOnSurvey1() {
		Student.survey.click();
	}

	@Then("click on Mysurvey")
	public void clickOnMysurvey() throws InterruptedException {
		Student.Mysurvey.click();
		Thread.sleep(5000);
	}

	@Then("click on Courselevel")
	public void clickOnCourselevel() {
		Student.Courselevel.click();
	}

	@Then("switch the calendar1")
	public void switchTheCalendar1() throws InterruptedException {
		WebElement academicCalendar1 = Student.AcademicCalendar1;
		Actions action = new Actions(base.getincognitodriver());
		action.moveToElement(academicCalendar1).perform();
		Thread.sleep(5000);
		academicCalendar1.click();
		Student.changedcalendar.click();
		Thread.sleep(5000);
		

	}

	@Then("click on Go to survey")
		public void clickGoToSurvey() throws InterruptedException {
		    

		steps.loginsteps.incognitoDriver = base.getincognitodriver();
		for (int i = 0; i < 4; i++) {
		    try {
		        WebDriverWait wait = new WebDriverWait(base.getincognitodriver(), Duration.ofSeconds(30));
		        WebElement goToSurveyButton = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//button[text()='GO TO SURVEY'])[1]")));

		        goToSurveyButton.click();
		        System.out.println("Clicked on 'GO TO SURVEY' button.");
		        break; // Exit the loop if successfully clicked
		    } catch (Exception e) {
		        System.out.println("GO TO SURVEY button not found or not clickable. Attempt: " + (i + 1));
		    }

		    // Wait before retrying and refresh the page
		    Thread.sleep(20000);
		    base.getincognitodriver().navigate().refresh();
		}
	}
	
	@Then("click on StronglyAgree")
	public void clickOnStronglyAgree() throws InterruptedException {
		Thread.sleep(5000);
		Student.StronglyAgree.click();;

	}
	

	@Then("click on Neutral")
	public void clickOnNeutral() {
		Student.Neutral.click();
	}

	@Then("click on next page")
	public void clickOnNextPage() {
		Student.Next.click();
	}

	@Then("click on StronglyDisAgree")
	public void clickOnStronglyDisAgree() {
		Student.StronglyDisAgree.click();
	}

	@Then("click on Agree")
	public void clickOnAgree() {
		Student.Agree.click();
	}

	@Then("Answer the openend question")
	public void answerTheOpenendQuestion() {
		Student.OpenendAnswer.sendKeys("testing done good");
	}

	@Then("click on complete")
	public void clickOnComplete() throws InterruptedException {
		Student.Complete.click();
		Thread.sleep(5000);
	}

	@Then("close the survey")
	public void closeTheSurvey() {
		Student.closeAnswer.click();

	}
	
	@And("click on the Preview button")
	public void clickOnThePreviewButton() throws InterruptedException {

		
		
		
		for (int i = 0; i < 4; i++) {
		    try {
		        // Wait for the "Preview" button to become visible
		        WebElement preview = base.getincognitodriver().findElement(By.xpath("(//button[text()='preview'])[1]"));

		        // Check if the button is displayed and click it
		        if (preview.isDisplayed()) {
		            preview.click();
		            System.out.println("The Preview button is clicked.");
		            break; // Exit the loop if successfully clicked
		        }

		    } catch (Exception e) {
		        System.out.println("The Preview button is not found. Attempt: " + (i + 1));

		    }

		    base.getincognitodriver().navigate().refresh();
		    Thread.sleep(20000); // Give time for page reload
		}
	}

	@Then("click on next button")
	public void clickOnNextButton() throws InterruptedException {
		Thread.sleep(5000);
		Student.nextbutton.click();
	}

	@And("click on the Previous button")
	public void clickOnThePreviousButton() throws InterruptedException {
		Thread.sleep(5000);
		Student.previous.click();
		 base.getincognitodriver().quit();
	}

	
}
