package org.step;



import org.pom.BaseClass;
import org.pom.LoginPageFace;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {
	 
	
	@When("Usrer will enter the Url")
	public void usrer_will_enter_the_Url() {
		
		loadUrl("https://en-gb.facebook.com"); 
		maximize();
	}

	@When("use will enter the {string} in User field")
	public void use_will_enter_the_in_User_field(String user) {
		LoginPageFace l=new LoginPageFace();
		insert(l.getTextUser(), user);
		
	  
	}
	@When("User will enter the{string}in the Pass field")
	public void user_will_enter_the_in_the_Pass_field(String pass) {
		LoginPageFace l=new LoginPageFace();
		insert(l.getTextpass(), pass);
		
	    
	}

	@Then("User will has to click to Login button")
	public void user_will_has_to_click_to_Login_button() {
		LoginPageFace l=new LoginPageFace();
		
		click(l.getCliklgn());
	   
	}

	@Then("The user wll not get home Page")
	public void the_user_wll_not_get_home_Page() {
		System.out.println(" user wont get home page");
	    
	}



}
