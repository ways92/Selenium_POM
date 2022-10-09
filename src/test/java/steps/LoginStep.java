package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import base.BaseClass;
import pages.LoginPage;


public class LoginStep extends BaseClass {
    protected LoginPage loginPage;

    @Given("On page login")
    public void onPageLogin() {
        loginPage = new LoginPage();
        goToSite();
    }

    @When("User enter  field username")
    public void userEnterFieldUsername() {
        loginPage.enterUsername();
    }

    @When("User enter field password")
    public void userEnterFieldPassword() {
        loginPage.enterPassword();
    }

    @When("User click button login")
    public void userClickButtonLogin() {
        loginPage.clickLogin();
    }

    @Then("Navigate to dashboard")
    public void navigateToDashboard() {
        loginPage.verifyProductTitle();
        closeBrowser();
    }

}
