package pages;

import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginPage extends BasePages{

    private By usernameField =  By.id( "user-name");
    private By passwordField =  By.id("password");
    private By loginButton =  By.id("login-button");
    private By productTitle =  By.xpath("//span[contains(text(),'Products')]");


    public void enterUsername(){
        driver.findElement(usernameField).sendKeys("standard_user");
    }

    public void enterPassword(){
        driver.findElement(passwordField).sendKeys("secret_sauce");
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void verifyProductTitle(){
        Assert.assertTrue(driver.findElement(productTitle).isDisplayed());
    }

}
