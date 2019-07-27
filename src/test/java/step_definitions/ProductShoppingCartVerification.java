package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ShoppingDressPage;
import support.BrowserDriver;
import support.ProductInfo;


public class ProductShoppingCartVerification {

    WebDriver objDriver = BrowserDriver.getCurrentDriver();
    WebDriverWait wait = BrowserDriver.getCurrentWaitDriver(120);
    ShoppingDressPage shopdress = new ShoppingDressPage(objDriver);

    @Then("^user is able to click on the \"([^\"]*)\" menu from the \"([^\"]*)\" menu$")
    public void userIsAbleToClickOnTheMenuFromTheMenu(String arg0, String arg1) throws Throwable {
        boolean isDressesBtnDisplayed = shopdress.isDressesButtonDisplayed();
        Assert.assertTrue("Dresses Button is not displayed",isDressesBtnDisplayed);

        shopdress.hoverOverDressesButton();
        wait.until(ExpectedConditions.elementToBeClickable(shopdress.getCasualDressesBtnropDown()));
        boolean threeSubMenusDisplayed = shopdress.threeMenubuttonsExist();
        Assert.assertTrue("Sub Menus are not displayed",threeSubMenusDisplayed);
        shopdress.clickSummerDressesMenuBtn();
    }

    @Then("^user is able to see the summer dresses$")
    public void userIsAbleToSeeTheSummerDresses() throws Throwable {
        int countNoOfDresses = shopdress.getCountOfSummerDresses();
        Assert.assertEquals(countNoOfDresses,3);

        boolean isSummerDressNumberOneIsDisplyed = shopdress.summerDressNumberOneIsDisplyed();
        Assert.assertTrue("Summer Dress One is not displayed",isSummerDressNumberOneIsDisplyed);

        boolean isSummerDressNumberTwoIsDisplyed = shopdress.summerDressNumberTwoIsDisplyed();
        Assert.assertTrue("Summer Dress two is not displayed",isSummerDressNumberTwoIsDisplyed);

        boolean isSummerDressNumberThreeIsDisplyed = shopdress.summerDressNumberThreeIsDisplyed();
        Assert.assertTrue("Summer Dress three is not displayed",isSummerDressNumberThreeIsDisplyed);
    }

    @Then("^user clicks \"([^\"]*)\" button for one summer dress$")
    public void userClicksButtonForOneSummerDress(String arg0) throws Throwable {
    	shopdress.hoverOverTheFirstSummerDressItem();
    	shopdress.clickOnAddToCartButton();
    }

    @Then("^user is able to see and click the \"([^\"]*)\" button on the status dialog$")
    public void userIsAbleToSeeTheButtonOnTheStatusDialog(String arg0) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(shopdress.getProceedToCheckoutButton()));
        ProductInfo.setProductName(shopdress.getselectedDressTitle());
        ProductInfo.setProductColor(shopdress.getselectedDressColor());
        shopdress.clickOnProceedToCheckOutButton();
    }

    @Then("^user validates the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" on the \"([^\"]*)\" page$")
    public void userValidatesTheAndOnThePage(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(shopdress.getProductNameOnCartSummaryPageElement()));
        String actualProductName = shopdress.getProductName();
        String actualProductColor = shopdress.getProductColor();
        String actualProductQty = shopdress.getProductQty();

        String expectedProductName = ProductInfo.getProductName();
        String expectedProductColor = ProductInfo.getProductColor();

        Assert.assertEquals("Product Name does not match: ",actualProductName,expectedProductName);
        Assert.assertTrue(actualProductColor.contains(expectedProductColor));
        Assert.assertEquals("Product Qty does not match: ",actualProductQty,"1");



    }
}
