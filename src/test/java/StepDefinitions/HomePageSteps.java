package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.azurewebsite.PageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class HomePageSteps {
    public WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);

    @Given("User already on website")
    public void userAlreadyOnWebsite() {
        Assert.assertTrue(homePage.verifyHomePage());
    }

    @When("User click home menu")
    public void userClickHomeMenu() {
        homePage.clickHomeMenu();
    }

    @Then("Home Page is displayed")
    public void homePageIsDisplayed() {
        Assert.assertTrue(homePage.homeMenuIsClicked());
    }
}
