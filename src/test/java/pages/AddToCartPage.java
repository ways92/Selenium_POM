package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends BaseClass {

    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartMenuButton = By.className("shopping_cart_link");
    private By itemProductCart = By.id("item_4_title_link");


    public void clickAddToCart(){
       driver.findElement(addToCartButton).click();
    }

    public void goToCartPage(){
        driver.findElement(cartMenuButton).click();
    }

    public void validateProduct(){
        Assert.assertTrue(driver.findElement(itemProductCart).isDisplayed());

    }


}
