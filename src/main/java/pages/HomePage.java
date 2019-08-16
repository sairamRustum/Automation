package pages;

import org.openqa.selenium.WebElement;
import java.util.Random;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'/roadrunner/commerce/profile/B2CProfileFormHandler.value.email')]")
	private WebElement emailfield;
	
	
	public HomePage enterEmail(String email) 
	{
		Random rand = new Random();
		highLighterMethod(driver, emailfield);
		int n = rand.nextInt(5000);
		String a = Integer.toString(n);
		type(emailfield,email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'loginEmailFormBtn')]")
	private WebElement nextButton;
	
	public HomePage clickNext() 
	{
		
		click(nextButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'/roadrunner/commerce/profile/B2CProfileFormHandler.value.password')]")
	private WebElement passwordfield;
	
	
	public HomePage enterPassword(String password) 
	{
		
		highLighterMethod(driver, passwordfield);
		type(passwordfield,password);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'loginEmailPasswordFormBtn')]")
	private WebElement signInButton;
	
	public HomePage clickSignIn() 
	{
		
		click(signInButton);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(text(),'My Account')]")
	private WebElement login;
	
	public HomePage clickLogin() 
	{
		
		click(login);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'account-user')]")
	private WebElement username;
	
	public LandingPage verifyUsername() 
	{
		
		verifyDisplayed(username);
		highLighterMethod(driver, username);
		return new LandingPage();
	}
	

}
