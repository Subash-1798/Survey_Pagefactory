package steps;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pagefactory.Login;
import base.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	static WebDriver driver;
	static WebDriver incognitoDriver;

	public WebDriverWait Wait;
	public Actions action;
	public JavascriptExecutor js;
	public Hooks base;
	
	Login login;

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

}
