package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	WebDriver d;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
	}

	@When("the user enters the valid user name and password")
	public void the_user_enters_the_valid_user_name_and_password() {

		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws InterruptedException {
		d.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
	}

	@Then("the user should be navigate to the home page")
	public void the_user_should_be_navigate_to_the_home_page() {
		d.findElement(By.className("inventory_item_img")).click();
		
		d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

		System.out.println("Buy a Useful Product");
		d.close();
	}

}
