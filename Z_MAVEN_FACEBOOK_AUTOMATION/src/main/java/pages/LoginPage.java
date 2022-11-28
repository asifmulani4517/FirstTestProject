package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Variables=WebElement
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()='Messenger']")
	private WebElement messengerLink ;
	
//Constructor-Initilization
		public LoginPage(WebDriver driver) //Construcrer name same as class name
		{
			PageFactory.initElements(driver,this );
		}

//Methods= Action on WebElement
		public void sendUsername()
		{
			username.sendKeys("velocity");
		}
		public void sendPassword()
		{
			password.sendKeys("1234");
		}
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		public void openMessengerPage()
		{
			messengerLink.click();
		}
		
		//Group of Actions
		
//		public void loginToApplication()
//		{
//			username.sendKeys("velocity");
//			password.sendKeys("1234");
//			loginButton.click();
//		}
		
		
}
