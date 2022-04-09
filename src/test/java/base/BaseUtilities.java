package base;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtilities {
	
	public static WebDriver Driver;

	public ExtentReports extent;

	public static ExtentTest scenarioDef;

	public static ExtentTest features;

	public static String reportLocation = "/Users/vk2/extent";

}
