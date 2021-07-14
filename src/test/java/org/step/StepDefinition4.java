package org.step;

import org.openqa.selenium.By;
import org.pom.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition4 extends BaseClass {
	@Given("user has to launch the browser")
	public void user_has_to_launch_the_browser() {
		launchBrowser();
	
	}

	
	@When("user will enter the url")
	public void user_will_enter_the_url() {
		
		loadUrl("https://www.amazon.in/");
		maximize();
	}

	@When("user has to enter some product name")
	public void user_has_to_enter_some_product_name() {
		driver.findElement(By.xpath("dsfb")).sendKeys("iphone");

	}

	@When("user have to click the search button")
	public void user_have_to_click_the_search_button() {
		
	}

	@Then("user get the product to visible")
	public void user_get_the_product_to_visible() {
	    
	}

	


}
