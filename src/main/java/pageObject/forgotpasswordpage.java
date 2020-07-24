package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpasswordpage {
	
	public WebDriver driver;

	private By forgotemail=By.id("user_email");
	private By instructionbtn=By.xpath("//input[@name='commit']");
	

	public forgotpasswordpage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement Enteremailforpassowrd()
	{
		return driver.findElement(forgotemail);
	}
	public WebElement clickinstructionbtn()
	{
		 return driver.findElement(instructionbtn);
		 	}

}
