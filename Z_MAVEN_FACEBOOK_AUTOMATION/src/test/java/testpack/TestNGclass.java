package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGclass {
	
	private WebDriver driver;
@BeforeClass
public void beforeClass()
{
	System.out.println("Befor class");
	System.setProperty("webdriver.chrome.driver","C:\\AsifSelenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("=======================");
}
@BeforeMethod

public void beforeMethod()
{
	System.out.println("https://www.facebook.com/");
	driver.get("https://www.facebook.com/");
	System.out.println("=======================");
}
@Test
public void test1()
{
	System.out.println("Test case for check url and title");
	//Actual results
	String url=driver.getCurrentUrl();
	String  title=driver.getTitle();
	Assert.assertEquals(url, "https://www.facebook.com/");
	System.out.println("URl="+url);
	System.out.println("Title="+title);
	System.out.println("=======================");
}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}	
	

}
