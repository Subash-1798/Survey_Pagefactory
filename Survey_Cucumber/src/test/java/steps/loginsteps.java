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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Login;
import Pagefactory.Outcome_Tag;
import Pagefactory.Reports_Page;
import Pagefactory.Survey_Creation;
import Pagefactory.createquestion;
import base.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pagefactory.Student;

public class loginsteps {
	static WebDriver driver;
	static WebDriver incognitoDriver;

	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	Login login;
	Survey_Creation creator;
	createquestion question;
	Outcome_Tag Outcome;
	Student Studentflow;
	Reports_Page Report;
	
	
	
	public loginsteps(Hooks base) {
		this.base = base;

	}

	String incognitoWindowHandle = "";
	String mainWindowHandle;

	@Before
	public void setUp() {
		base.incognito();
		base.setUpDriver();
	}

	
	
	@Given("user enter username as {string}")
	public void userEnterUsernameAs(String string) {
		login = new Login(base.getdriver());		
		base.getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Login.username.sendKeys("sf61@mail.com");
		
		
	}

	@Given("user enter password as {string}")
	public void userEnterPasswordAs(String string) {
		Login.password.sendKeys("12345678");
	}

	@When("user click the submit button")
	public void userClickTheSubmitButton() {
		Login.submit.click();
	}

	@Then("loginShouldBeSuccess")
	public void loginShouldBeSuccess() {
		System.out.println("The login is successfully done");
	}

	@Then("click on Digiclass")
	public void clickOnDigiclass() throws InterruptedException {
		Thread.sleep(7000);
		Login.Digiclass.click();
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

	@Then("select the settings")
	public void selectTheSettings() throws InterruptedException {
		
		Outcome = new Outcome_Tag (base.getdriver());
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

	@When("switch to the incognito window")
	public void switchToTheIncognitoWindow() throws InterruptedException {
		base.getincognitodriver().switchTo().window(incognitoWindowHandle);
		Thread.sleep(3000);
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

	@When("switch to the MainWindow")
	public void switchToMainWindow() throws Exception {
		mainWindowHandle = base.getdriver().getWindowHandle();
		base.getdriver().switchTo().window(mainWindowHandle);
		base.getdriver().navigate().refresh();
		System.out.println("Switched back to the main window.");
	}

	@Then("click on Report icon")
	public void clickOnReportIcon() {
		
		Studentflow = new Student(base.getincognitodriver());
		Report = new Reports_Page(base.getdriver());
		Reports_Page.Reporticon.click();
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
