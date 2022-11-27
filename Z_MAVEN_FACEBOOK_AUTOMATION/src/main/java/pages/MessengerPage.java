package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	//Variables
	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy (xpath="//a[text()='Features']")
	private WebElement features;
	
	@FindBy (xpath="//a[text()='Desktop app']")
	private WebElement desktopApp;
	
	//Constructor=initilization
	public MessengerPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	
	//Method Action on WebElement
	public void clickonRoomsTab()
	{
		rooms.click();
	}
	
	public void clickonFeaturesTab()
	{
		features.click();
	}

	public void clickonDesktopAppTab()
	{
		desktopApp.click();
	}

	
	
}
