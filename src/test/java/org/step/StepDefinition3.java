package org.step;

import java.util.List;
import java.util.Map;

import org.pom.BaseClass;
import org.pom.LoginPageFace;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 extends BaseClass {
	LoginPageFace l;
	@When("user will hit the url")
	public void user_will_hit_the_url() {
     loadUrl("https://en-gb.facebook.com");
     maximize();
		
		
	}
	@When("user will enter the username")
	public void user_will_enter_the_username(io.cucumber.datatable.DataTable d) {
		       List<String> li = d.asList();
		l=new LoginPageFace();
		insert(l.getTextUser(),li.get(2));
	    
	
	
	}

	@When("user will enter new passowrd")
	public void user_will_enter_new_passowrd(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> mp = d.asMaps();
		l=new LoginPageFace();
		insert(l.getTextpass(), mp.get(2).get("password3"));
	    
	}
	
	@Then("user has yto click the login button")
	public void user_has_yto_click_the_login_button() {
		l=new LoginPageFace();
		click(l.getCliklgn());
	    
	}

	@Then("user wont get the home page")
	public void user_wont_get_the_home_page() {
		closeBrowser();
	   
	}


}
