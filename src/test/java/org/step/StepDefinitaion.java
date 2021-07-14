package org.step;


import java.util.List;

import org.openqa.selenium.WebDriver;

import org.pom.BaseClass;
import org.pom.LoginPageFace;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinitaion extends BaseClass {
	LoginPageFace l;

	@Given("User will launch the chrome browser")
	public void user_will_launch_the_chrome_browser() {
		launchBrowser();
	
	}

	@When("User will hit the url")
	public void user_will_hit_the_url() {
	// driver.get("https://en-gb.facebook.com/");
	 loadUrl("https://en-gb.facebook.com/");
	maximize();
		
	}

	@When("User has to enter the invalide username")
	public void user_has_to_enter_the_invalide_username(DataTable d) {
		//driver.findElement(By.id("email")).sendKeys("karthiga");
		  List<String> li = d.asList();
		  
		 l=new LoginPageFace();
		insert(l.getTextUser(), li.get(1));
	    
	}

	@When("User has to enter the invalide password")
	public void user_has_to_enter_the_invalide_password(DataTable d) {
		List<List<String>> lis = d.asLists();
		 l=new LoginPageFace();
		insert(l.getTextpass(), lis.get(1).get(3));
		//driver.findElement(By.name("pass")).sendKeys("6738746");
	   
	}

	@Then("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		 l=new LoginPageFace();
		click(l.getCliklgn());
		//driver.findElement(By.name("login")).click();
	   
	}

	@Then("User will not get the home page")
	public void user_will_not_get_the_home_page() {
	   System.out.println("User get tyhe error msg");
	   closeBrowser();
	  // driver.close();
	}

	
	

}
