package com.w2a.utilities;

import java.io.File;

import org.openqa.selenium.interactions.internal.DisplayAction;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		
		if(extent==null) {
			extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\Html\\exttentreport.html",true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resource\\extentconfig\\ReportsConfig.xml"));
			
		}
		return extent;
	}
	

}
