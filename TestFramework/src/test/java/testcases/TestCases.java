package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CalculatorHome;
import pages.PercentageCalculator;

public class TestCases {
	
	WebDriver driver;
	CalculatorHome calculatorHome;
	PercentageCalculator percentageCalculator;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
		
		driver = new ChromeDriver();
		calculatorHome = new CalculatorHome(driver);
		percentageCalculator = new PercentageCalculator(driver);
	}
	
	
	@Test
	public void tcCalculatePercentage() {
		
		driver.get("https://www.calculator.net/");
		
		
		driver.manage().window().maximize();		
		calculatorHome.clickPercentageLink();
		
		percentageCalculator.enterPercentage("5");
		percentageCalculator.enterValue("250");
		percentageCalculator.clickCalculate();
	}

}
