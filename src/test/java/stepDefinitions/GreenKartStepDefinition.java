package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreenKartStepDefinition {
	WebDriver driver;
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "");
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 
	   }

	@When("user searched with short name {string} and extracted actual name of product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String string) {
		
	    }

	@Then("user searched for same short name on offers page to check if product exist")
	public void user_searched_for_same_short_name_on_offers_page_to_check_if_product_exist() {
		
		
	   }

}
