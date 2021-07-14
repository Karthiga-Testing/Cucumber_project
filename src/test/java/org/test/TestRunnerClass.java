package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue ="org.step", dryRun=false,monochrome=true, tags="@Regression",plugin= {"pretty","html:src\\test\\resources\\Report\\faild",
		"json:src\\test\\resources\\Report\\JsonRepot.json",
		"junit:src\\test\\resources\\Report\\junitreport.xml",
		"rerun:CucumberSample\\FailedReport\\Filedreport.txt"
		})
public class TestRunnerClass {
	@AfterClass
	
	public  static void jvmre() {
		JvmClass.jvmRepot("src\\\\test\\\\resources\\\\Report\\\\JsonRepot.json");

	}

}
