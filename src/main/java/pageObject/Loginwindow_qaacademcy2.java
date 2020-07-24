package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginwindow_qaacademcy2 {
	
	public WebDriver driver;
	
	private By username=By.id("user_email");
	private By password=By.id("user_password");
	private By loginbutton=By.xpath("//input[@name='commit']");
	private By Forgotpass=By.cssSelector("a.link-below-button");
	
	public Loginwindow_qaacademcy2(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement loginbutton()
	{
		return driver.findElement(loginbutton);
		
	}
	public forgotpasswordpage forgotpassword()
	{
		 driver.findElement(Forgotpass).click();
		return new forgotpasswordpage(driver);
		 
		 
	}

}
