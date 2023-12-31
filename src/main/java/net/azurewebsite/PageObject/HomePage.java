package net.azurewebsite.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    private By verifyHome = By.xpath("//img[@alt='Test']");

    private By homeMenu = By.xpath("//a[.='Home']");
    private By signUpMenu = By.xpath("//a[.='Sign Up']");


    /**
     * Verify HomePage
     */
    public boolean verifyHomePage() {
        return verifyDisplayed(verifyHome);
    }

    /**
     * Click Home Menu
     */

    public void clickHomeMenu() {
        clickBtn(homeMenu);
    }

    public void clickSignUpMenu(){
        clickBtn(signUpMenu);
    }

    /**
     * Verify button is clicked
     */
    public boolean homeMenuIsClicked(){
        return verifyEnabled(homeMenu);
    }
}
