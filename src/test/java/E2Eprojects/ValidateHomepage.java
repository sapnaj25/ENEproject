package E2Eprojects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Landingpage_qaacademcy;

import resources.Base;

public class ValidateHomepage extends Base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException {
		driver = initialiszeDriver();
		log.info("driver is instailised");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
	}

	@Test
	public void validatetitle() throws IOException

	{
		
		
		Landingpage_qaacademcy lp = new Landingpage_qaacademcy(driver);
		Assert.assertEquals(lp.gettitle().getText(), "FEATURED COURSES123");
		log.info("Text message on landing page is matched");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
