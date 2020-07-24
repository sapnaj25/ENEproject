package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage_qaacademcy {
	
	public WebDriver driver;

	private By login=By.xpath("//span[contains(text(),'Login')]");
	private By Title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By navigationbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	public Landingpage_qaacademcy(WebDriver driver) {
		this.driver=driver;
	}

	public Loginwindow_qaacademcy2 getlogin()
	{
		driver.findElement(login).click();
		return new Loginwindow_qaacademcy2(driver);
		 
		  }
	public WebElement gettitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getnavigation()
	{
		return driver.findElement(navigationbar);
	}
	

}
