package Internal1.Internal1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon {
	WebDriver driver;
	@Given("I am on the Login page URL {string}")
	public void i_am_on_the_login_page_url(String string) {
		System.out.println("Given Executed...");
		  System.setProperty("webdriver.chrome.driver","C:/Users/Keerthi Vardhani/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		  driver= new ChromeDriver();					
		  driver.manage().window().maximize();			
		  driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@Then("I click on sign in button and wait for sign in page")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() throws InterruptedException {
	    System.out.println("Waiting for the sign in page");
	    Thread.sleep(12000);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		WebElement login=driver.findElement(By.cssSelector("input[type='email']"));
	    login.sendKeys("+917075259383");
	}

	@When("I Click on Continue button")
	public void i_click_on_continue_button() {
		WebElement contin=driver.findElement(By.id("continue"));
	    contin.click();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("jagadeesh");
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
	   WebElement signin=driver.findElement(By.id("signInSubmit"));
	   signin.click();
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
	    System.out.println("Successfull logged in");
	}

	@Then("I search different {string} from the search bar")
	public void i_search_different_from_the_search_bar(String string) {
	   WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	   search.sendKeys(string);
	   search.submit();
	}
}
