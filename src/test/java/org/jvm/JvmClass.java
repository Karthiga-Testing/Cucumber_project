package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmClass {
	public static void jvmRepot(String json) {

	File f= new File("/CucumberSample/src/test/resources/Report/Jvmreport");
	Configuration c=new Configuration(f, "amazon");
	c.addClassifications("window", "7");
	c.addClassifications("project", "sample of cucumber");
	c.addClassifications("name", "karthiga");
	
	List<String>l=new ArrayList<String>();
	l.add(json);
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
	
}
}
