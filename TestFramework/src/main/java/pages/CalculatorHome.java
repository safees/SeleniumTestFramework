package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorHome {
	
	WebDriver driver;
	
	By link_percentage = By.linkText("Percentage Calculator");
	
	
	public CalculatorHome(WebDriver driverparm) {
		
		this.driver = driverparm;
	}
	
	// create method
	
	public void clickPercentageLink() {
		
		driver.findElement(link_percentage).click();
		
	}

}









