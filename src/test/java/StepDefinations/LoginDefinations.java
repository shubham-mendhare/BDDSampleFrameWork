package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinations {
	
	public WebDriver driver;
	
	@Given("Intialize the setup and lunch the browser")
	public void intialize_the_setup_and_lunch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@When("User navigate to url")
	public void user_navigate_to_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Then("User present on Login page")
	public void user_present_on_login_page() {
	   // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
	}
	@Given("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("username")).sendKeys("student");
		 driver.findElement(By.id("password")).sendKeys("Password123");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	}
	@Then("User should get get land on Dashboard")
	public void user_should_get_get_land_on_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   String headerText =driver.findElement(By.cssSelector("[class=\"post-header\"] h1")).getText();
	   Assert.assertEquals(headerText, "Logged In Successfully");
	}
	
	@Given("^User enters credentials (.+) and (.+)$")
	public void user_enters_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
	}
	
	 @After
	    public void tearDown() {
	        driver.quit();
	    }

}
