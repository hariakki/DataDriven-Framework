package dd_testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dd_core.Page;
import dd_util.TestUtil;

public class Test_1 {
	public static String GlobalUsername;
	@BeforeTest
	public void isSkip(){
		
		if(!TestUtil.isExecutable("LoginTest")){
			
			throw new SkipException("Skipping the test as the Run mode is No");
			
		}
		
		
	}
	
	@Test(dataProvider="getData")
	public void doLogin() throws IOException{
		
		//logs.debug("Inside Login Test");
		
		
		dd_core.Page.driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("swatimadan");
		dd_core.Page.driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("swatimadan");
		dd_core.Page.driver.findElement(By.xpath(".//*[@id='Email']")).click();
		
//		findElement("username").sendKeys(username);
//		findElement("password").sendKeys(password);
//		findElement("login").click();
		TestUtil.CaptureScreenshot();
		//GlobalUsername = username;
		
	
	}
	
	
	@DataProvider
	public static Object[][] getData(){
		
		return TestUtil.getData("LoginTest");
		
		
		
	}
	

}
