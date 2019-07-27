package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingDressPage {

	WebDriver ObDriver;
	//Constructor
	public ShoppingDressPage(WebDriver objDriver){
		this.ObDriver = objDriver;
		//This initElements method will create all WebElements
		PageFactory.initElements(ObDriver, this);
	}

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]")
	private WebElement womenBtn;

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]")
	private WebElement dressesBtn;

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]/ul")
	private WebElement dressesDropDown;

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]")
	private WebElement dressesCasualDressesBtnropDown;

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Evening Dresses\")]")
	private WebElement dressesEveningDressesBtnropDown;

	@FindBy(how= How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Summer Dresses\")]")
	private WebElement dressesSummerDressesBtnropDown;

	@FindBy(how= How.XPATH, using="//*[@id=\"center_column\"]/ul/li[" + 1 + "]")
	private WebElement summerDressNumber1;

	@FindBy(how= How.XPATH, using="//*[@id=\"center_column\"]/ul/li")
	private List<WebElement> summerDressCount;

	@FindBy(how= How.XPATH, using="//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]")
	private WebElement addToCartButton;

	@FindBy(how= How.XPATH, using="//a[@title=\"Proceed to checkout\"]")
	private WebElement proceedToCheckoutButton;

	@FindBy(how=How.ID, using="layer_cart_product_title")
	private WebElement selectedDressTitle;

	@FindBy(how=How.ID, using="layer_cart_product_attributes")
	private WebElement selectedDressColor;

	@FindBy(how= How.XPATH, using="//td[@class=\"cart_description\"]//p[@class=\"product-name\"]/a")
	private WebElement productNameOnCartSummaryPage;

	@FindBy(how= How.XPATH, using="//td[@class=\"cart_description\"]//small[2]/a")
	private WebElement productColorOnCartSummaryPage;

	@FindBy(how=How.XPATH, using="//input[@class=\"cart_quantity_input form-control grey\"]")
	private WebElement productQtyOnCartSummaryPage;

	public WebElement getProductNameOnCartSummaryPageElement() {
		return productNameOnCartSummaryPage;
	}

	public String getProductQty(){
		return productQtyOnCartSummaryPage.getAttribute("value");
	}

	public String getProductName(){
		return productNameOnCartSummaryPage.getText();
	}

	public String getProductColor(){
		return productColorOnCartSummaryPage.getText();
	}

	public String getselectedDressTitle(){
		return selectedDressTitle.getText();
	}

	public String getselectedDressColor(){
		return selectedDressColor.getText();
	}

	public WebElement getProceedToCheckoutButton(){
		return proceedToCheckoutButton;
	}

	public void clickOnProceedToCheckOutButton() {
		proceedToCheckoutButton.click();
	}

	public void hoverOverTheFirstSummerDressItem() {
		Actions action = new Actions(ObDriver);
		action.moveToElement(getSummerDressProduct(1)).perform();
	}

	public void clickOnAddToCartButton() {
		Actions action = new Actions(ObDriver);
		action.moveToElement(getSummerDressProduct(1)).perform();
		action.moveToElement(addToCartButton).perform();

		action.click(addToCartButton).build().perform();
	}


	public boolean isDressesButtonDisplayed() {
		return dressesBtn.isDisplayed();
	}

	public void hoverOverDressesButton() {
		Actions action = new Actions(ObDriver);
		action.moveToElement(dressesBtn).perform();
	}

	public WebElement getCasualDressesBtnropDown(){
		return dressesCasualDressesBtnropDown;
	}

	public boolean threeMenubuttonsExist(){
		boolean b1 = dressesCasualDressesBtnropDown.isDisplayed();
		boolean b2 = dressesEveningDressesBtnropDown.isDisplayed();
		boolean b3 = dressesSummerDressesBtnropDown.isDisplayed();
		if((b1) && (b2) && (b3)){
			return true;
		}else {
			return false;
		}
	}

	public void clickSummerDressesMenuBtn() {
		Actions action = new Actions(ObDriver);
		action.moveToElement(dressesSummerDressesBtnropDown).perform();
		dressesSummerDressesBtnropDown.click();
	}

	public WebElement getSummerDressProduct(int dressNum) {
		return ObDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"));
	}

	public boolean summerDressNumberOneIsDisplyed(){
		boolean status = false;
		status = getSummerDressProduct(1).isDisplayed();
		return status;
	}

	public boolean summerDressNumberTwoIsDisplyed(){
		boolean status = false;
		status = getSummerDressProduct(1).isDisplayed();
		return status;
	}

	public boolean summerDressNumberThreeIsDisplyed(){
		boolean status = false;
		status = getSummerDressProduct(1).isDisplayed();
		return status;
	}

	public int getCountOfSummerDresses(){
		return summerDressCount.size();
	}














}
