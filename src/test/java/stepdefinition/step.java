package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	WebDriver d;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
	}

	@When("the user enters the valid {string} and {string}")
	public void the_user_enters_the_valid_username_and_password(String Username, String Password) {

		d.findElement(By.id("user-name")).sendKeys(Username);
		d.findElement(By.id("password")).sendKeys(Password);

	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Exception {
		d.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
	}

	@Then("^the user should be navigate to the home page$")
	public void the_user_should_be_navigate_to_the_home_page() throws Exception {
		d.findElement(By.className("inventory_item_img")).click();
		Thread.sleep(5000);
	}
	@Then("user should not navigate to the payment page without selecting Product")
	public void user_should_not_navigate_to_the_payment_page_without_selecting_product() throws Exception {
		Thread.sleep(5000);
		System.out.println("Buy a Useful Product");
		d.close();
	}

}
