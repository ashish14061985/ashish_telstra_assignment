package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	WebDriver ObDriver;
	//Constructor
	public LoginPage(WebDriver objDriver){
		this.ObDriver = objDriver;
		//This below method will create all WebElements
		PageFactory.initElements(ObDriver, this);
	}

	@FindBy(how=How.XPATH, using="//a[@class='login']")
	private WebElement signIn_link;

	@FindBy(how=How.ID, using="email_create")
	private WebElement emailCreate_input;

	@FindBy(how=How.ID, using="SubmitCreate")
	private WebElement createAnAccount_button;

	public void clickOnSignInLink(){
		signIn_link.click();
	}

	public void typeEmailId(String emailId) {
		emailCreate_input.sendKeys(emailId);
	}

	public void createAccountButton() {
		createAnAccount_button.click();
	}


}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
