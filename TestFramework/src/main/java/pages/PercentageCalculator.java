package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PercentageCalculator{
	
	WebDriver driver;
	
	By txtPercentage = By.id("cpar1");
	By txtValue = By.id("cpar2");
	By btnCalculate = By.xpath("//input[@alt='Calculate']");
	
	public PercentageCalculator(WebDriver prmdriver) {
		this.driver = prmdriver;
	}
	
	// Method for enter the percentage
	
	public void enterPercentage(String percentage) {
		
		driver.findElement(txtPercentage).sendKeys(percentage);
	}
	
	// Method for enter the value
	
	public void enterValue(String value) {
		
		driver.findElement(txtValue).sendKeys(value);
		
	}
	
	// method for calculate value
	public void clickCalculate() {
		
		driver.findElement(btnCalculate).click();
	}
	
}