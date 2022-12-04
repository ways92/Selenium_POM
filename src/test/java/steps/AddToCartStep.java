package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import base.BaseClass;

public class AddToCartStep extends BaseClass {
    protected AddToCartPage addToCartPage = new AddToCartPage();

    @When("User click add to cart")
    public void userClickAddToCart() throws InterruptedException {
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
    }

}
