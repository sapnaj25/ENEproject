package E2Eprojects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Landingpage_qaacademcy;
import pageObject.Loginwindow_qaacademcy2;
import pageObject.forgotpasswordpage;
import resources.Base;

public class Homepage extends Base {
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException 
	{
		driver = initialiszeDriver();
		log.info("driver is instailised");
		
	}

	@Test(dataProvider = "getdata")
	public void userlogin(String Username, String Pass, String text) throws IOException

	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
		Landingpage_qaacademcy lq = new Landingpage_qaacademcy(driver);
		Loginwindow_qaacademcy2 lw=lq.getlogin();
		
		lw.username().sendKeys(Username);
		lw.password().sendKeys(Pass);
		lw.loginbutton().click();
		log.info(text);
		forgotpasswordpage fp=lw.forgotpassword();
		fp.Enteremailforpassowrd().sendKeys("jenasapna@gmail.com");
		fp.clickinstructionbtn().click();
		
		
		
	}
	


	@DataProvider
	public Object[][] getdata() {

		// Row stands for how many different data types test should run
		// col stands for how mnay values per each text
		Object[][] data = new Object[2][3];
		data[0][0] = "sapnauser1";
		data[0][1] = "12345";
		data[0][2] = "restricted user";

		data[1][0] = "sapnauser2";
		data[1][1] = "123456";
		data[1][2] = "Non restricted";
		return data;
	}
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}
}
