package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.RegisterAccountPage;
import support.BrowserDriver;
import support.RandomEmailFunction;

import java.util.List;



public class NewUserRegistration {

    WebDriver objDriver = BrowserDriver.getCurrentDriver();
    LoginPage loginpage = new LoginPage(objDriver);
    RegisterAccountPage registeraccountpage = new RegisterAccountPage(objDriver);
  
    @When("^User open automationpractice website$")
    public void userOpenAutomationpracticeWebsite() throws Throwable {
        BrowserDriver.loadPage("http://automationpractice.com/index.php");
    }

    @Then("^the user clicks on the SignIn link$")
    public void theUserClicksOnTheSignInLink() throws Throwable {
    	loginpage.clickOnSignInLink();
    }

    @Then("^user should provide a valid email address$")
    public void userShouldProvideAValidEmailAddress() throws Throwable {
        String emailId = RandomEmailFunction.getSaltString()+"@gmail.com";
        loginpage.typeEmailId(emailId);
    }

    @Then("^user clicks on the \"([^\"]*)\" button$")
    public void userClicksOnTheButton(String arg0) throws Throwable {
    	loginpage.createAccountButton();
    }

    @Then("^user should be directed to \"([^\"]*)\" page$")
    public void userShouldBeDirectedToPage(String expectedTitle) throws Throwable {
        String actualTitle = null;
        if (expectedTitle.contains("AUTHENTICATION")) {
            actualTitle = registeraccountpage.getPageTitle();
           Assert.assertEquals(actualTitle,expectedTitle);
    }
    }
    @Then("^user click and select the \"([^\"]*)\"$")
    public void userSelectsThe(String title,DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String value = dtvalue.get(0).get(0);
        if (value.contains("Mr.")) {
        	registeraccountpage.selectMrRadioButton();
        }
    }

    @Then("^user enters the \"([^\"]*)\"$")
    public void userEntersThe(String attribute,DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String value = dtvalue.get(0).get(0);
        switch(attribute) {
            case "First Name":
            	registeraccountpage.setFirstName(value);
                break;
            case "Last Name" :
            	registeraccountpage.setLastName(value);
                break;
            case "password" :
            	registeraccountpage.setPassword(value);
                break;
            case "Address" :
            	registeraccountpage.setAddr1(value);
                break;
            case "city" :
            	registeraccountpage.setCity(value);
                break;
            case "Postcode" :
            	registeraccountpage.setPostCode(value);
                break;
            case "Mobile phone" :
            	registeraccountpage.setPhoneMobile(value);
                break;
            case "value" :
                break;

            default :
                System.out.println("Invalid data");
        }
    }

    @Then("^user enters selects the \"([^\"]*)\" as day, month and yeat$")
    public void userEntersSelectsTheAsDayMonthAndYeat(String attribute,DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String day = dtvalue.get(1).get(0);
        String month = dtvalue.get(1).get(1);
        String year = dtvalue.get(1).get(2);

        registeraccountpage.SelectDays(day);
        registeraccountpage.SelectMonth(month);
        registeraccountpage.SelectYear(year);
    }


    @Then("^user selects the \"([^\"]*)\"$")
    public void userSelectsTheList(String attribute,DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String value = dtvalue.get(0).get(0);
        registeraccountpage.SelectState(value);
    }

    @Then("^user clicks the \"([^\"]*)\" button$")
    public void userClicksTheButton(String arg0) throws Throwable {
    	registeraccountpage.clickSubmitButton();
    }


    @Then("^user should provide an Invalid email address$")
    public void userShouldProvideAnInvalidEmailAddress(DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String emailId = dtvalue.get(0).get(0);
        loginpage.typeEmailId(emailId);

    }

    @Then("^user should see the following error message$")
    public void userShouldSeeTheFollowingErrorMessage(DataTable data) throws Throwable {
        List<List<String>> dtvalue = data.raw();
        String expectedMsg = dtvalue.get(0).get(0);
        String msg = registeraccountpage.invalidEmailMsg();
        Assert.assertEquals("Invalid email error message",expectedMsg,msg);
    }
}
