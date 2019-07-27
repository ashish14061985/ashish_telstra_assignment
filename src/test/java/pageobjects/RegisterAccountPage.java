package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {

WebDriver ObDriver;
	//Constructor
	public RegisterAccountPage(WebDriver objDriver){
		this.ObDriver = objDriver;
		//This initElements method will create all WebElements
		PageFactory.initElements(ObDriver, this);
	}

	@FindBy(how=How.CLASS_NAME, using="page-heading")
	private WebElement title_createAnAccount;

	@FindBy(how=How.ID, using="id_gender1")
	private WebElement select_Mr_radiobutton;

	@FindBy(how=How.ID, using="customer_firstname")
	private WebElement firstName_Input;

	@FindBy(how=How.ID, using="customer_lastname")
	private WebElement lastName_Input;

	@FindBy(how=How.ID, using="passwd")
	private WebElement password_Input;

	@FindBy(how=How.ID, using="address1")
	private WebElement addr1_Input;

	@FindBy(how=How.ID, using="city")
	private WebElement city_Input;

	@FindBy(how=How.ID, using="postcode")
	private WebElement postcode_Input;

	@FindBy(how=How.ID, using="phone_mobile")
	private WebElement phone_mobile_Input;

	@FindBy(how=How.ID, using="id_state")
	private WebElement select_state_list;

	@FindBy(how=How.ID, using="days")
	private WebElement select_days_list;

	@FindBy(how=How.ID, using="months")
	private WebElement select_month_list;

	@FindBy(how=How.ID, using="years")
	private WebElement select_year_list;

	@FindBy(how=How.ID, using="submitAccount")
	private WebElement submit_button;

	@FindBy(how=How.XPATH, using="//div[@id=\"create_account_error\"]//li")
	private WebElement invalidEmailMsg_text;

	public String invalidEmailMsg(){
		return invalidEmailMsg_text.getText();
	}

	public void clickSubmitButton() {
		submit_button.click();
	}

	public void SelectState(String value) {
		select_state_list.sendKeys(value);
	}

	public void SelectDays(String value) {
		select_days_list.sendKeys(value);
	}

	public void SelectMonth(String value) {
		select_month_list.sendKeys(value);
	}

	public void SelectYear(String value) {
		select_year_list.sendKeys(value);
	}


	public String getPageTitle() {
		return title_createAnAccount.getText();
	}

	public void selectMrRadioButton() {
		select_Mr_radiobutton.click();
	}

	public void setFirstName(String value) {
		firstName_Input.sendKeys(value);
	}

	public void setLastName(String value) {
		lastName_Input.sendKeys(value);
	}

	public void setPassword(String value) {
		password_Input.sendKeys(value);
	}

	public void setAddr1(String value) {
		addr1_Input.sendKeys(value);
	}

	public void setCity(String value) {
		city_Input.sendKeys(value);
	}

	public void setPostCode(String value) {
		postcode_Input.sendKeys(value);
	}

	public void setPhoneMobile(String value) {
		phone_mobile_Input.sendKeys(value);
	}
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
