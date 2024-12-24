package base;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
	WebDriver driver;
	WebDriver incognitoDriver;
	
	public WebDriver getdriver() {
		return driver;

	}
	
	
	
    public void setUpDriver() {
        String baseURL = "https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/staging1-dcweb/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized", "use-fake-ui-for-media-stream"));
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    
    public WebDriver getincognitodriver() {
    	
		return incognitoDriver;

	}
    
    
    
    public  void incognito() {
		ChromeOptions chromeOptions = new ChromeOptions();
		@SuppressWarnings("unused")
		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromeOptions.addArguments("--incognito");
		incognitoDriver = new ChromeDriver(chromeOptions);
		incognitoDriver.manage().window().maximize();
		incognitoDriver.get("https://digival-staging-nginx-ds-yk25kmkzeq-el.a.run.app/staging1-dcweb/");

	}
	
	
}
