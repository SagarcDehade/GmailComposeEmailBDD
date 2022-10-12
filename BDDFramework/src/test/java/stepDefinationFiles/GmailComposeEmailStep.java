package stepDefinationFiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//import org.openqa.se1enium.WebDriver;

public class GmailComposeEmailStep 


{
	WebDriver driver;
	@BeforeMethod
	void setUp()
	{
		System.setProperty("webdriver.edge.driver","D:\\Study material\\selenium jar files\\edgedriver_win64\\msedgedriver.exe");
	    driver=new EdgeDriver(); 	
	}
	
	@Given("I navigate to gmail home page")
	public void navigateToGmailHomePage()
	{
			
		driver.get("https://accounts.google.com/");//get() method is used to navigate any url
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies(); //it deletes browser history 
	    driver.manage().window().maximize();// it maximizes browser's screen

	}
	
	@Then("I see gmail home page title is displaying as (string)")
	public void verifyTitle(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@Then("I see email text box is displaying")
	public void verifyEmailTextBox()
	{
		WebElement emailTextBox=driver.findElement(By.id("identifierId"));
		Assert.assertTrue(emailTextBox.isDisplayed());
	}
	
	@Then("I see next button is displaying")
	public void verifyNextButton1()
	{
		WebElement nextButton=driver.findElement(By.className("VfPpkd-vQzf8d"));
		Assert.assertTrue(nextButton.isDisplayed());
	}
	
	@Then("I see password text box is displaying")
	public void verifyPasswordTextBox()
	{
		WebElement passwordTextBox=(WebElement) driver.findElements(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
		Assert.assertTrue(passwordTextBox.isDisplayed());
	}
	
	@Then("I see next button is displaying")
	public void verifyNextButton2()
	{
		WebElement nextButton=driver.findElement(By.className("VfPpkd-vQzf8d"));
		Assert.assertTrue(nextButton.isDisplayed());
	}

	@Then("I enter email {string}")
	public void enterEmail(String email)
	{
		WebElement emailTextBox=driver.findElement(By.id("identifierId"));
		emailTextBox.sendKeys(email);
	}
	
	@Then("I click on next button")
	public void clickNextButton1() 
	{
		WebElement nextButton=driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextButton.click();
	}
	
	@Then("I enter password {string}")
	public void enterPassword(String password)
	{
		WebElement passwordTextBox=(WebElement) driver.findElements(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
		passwordTextBox.sendKeys(password);
	}
	
	@Then("I click on next button")
	public void clickNextButton2() 
	{
		WebElement nextButton=driver.findElement(By.className("VfPpkd-vQzf8d"));
		nextButton.click();
	}

	@Then("I click on compose button")
	public void clickComposeButton() 
	{
		WebElement composeButton=driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
		composeButton.click();
	}
	
	@Then("I enter valid reveiver email as {string}")
	public void enterReceiverAddress(String ReceiverEmail)
	{
		WebElement receiverAddressTextBox=(WebElement) driver.findElements(By.className("agP aFw"));
		receiverAddressTextBox.sendKeys(ReceiverEmail);
	}
	
	@Then("I enter subject line as {string}")
	public void enterSubjectLine(String Subject)
	{
		WebElement subjectLineTextBox=(WebElement) driver.findElements(By.xpath("//input[@name='subjectbox']"));
		subjectLineTextBox.sendKeys(Subject);
	}
	
	@Then("I enter email body as {string}")
	public void enterMailBody(String EmailBody)
	{
		WebElement emailBodyTextBox=(WebElement) driver.findElements(By.className("Am Al editable LW-avf tS-tW"));
		emailBodyTextBox.sendKeys(EmailBody);
	}
	
	@Then("I click on send button")
	public void clickSendButton() 
	{
		WebElement sendButton=driver.findElement(By.className("T-I J-J5-Ji aoO v7 T-I-atl L3"));
		sendButton.click();
	}
	
}
