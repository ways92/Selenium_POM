package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.BasePages;

public class AddToCartStep extends BasePages {
    protected AddToCartPage addToCartPage;

    @When("User click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        addToCartPage = new AddToCartPage();
        Thread.sleep(2000);
        addToCartPage.clickAddToCart();
    }

    @When("User go to cart page")
    public void userGoToCartPage() {
        addToCartPage.goToCartPage();
    }

    @Then("see product on cart page")
    public void seeProductOnCartPage() throws InterruptedException{
        addToCartPage.validateProduct();
        Thread.sleep(3000);
        closeBrowser();
    }
}
