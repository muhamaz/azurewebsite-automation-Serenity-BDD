package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.azurewebsite.PageObject.HomePage;
import net.azurewebsite.PageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {

    public WebDriver driver = Hooks.driver;

    RegisterPage registerPage = new RegisterPage(driver);
    HomePage homePage = new HomePage(driver);

    @When("User click sign up menu")
    public void userClickSignUpMenu() {
        homePage.clickSignUpMenu();
    }

    @Then("User navigate to register page")
    public void userNavigateToRegisterPage() {
        String text = "Add new user";
        Assert.assertEquals(text, registerPage.getAddNewUserText());
    }

    @When("User input firstname {string}")
    public void userInputFirstname(String firstname) {
        registerPage.setFirstname(firstname);
    }

    @And("User input lastname {string}")
    public void userInputLastname(String lastname) {
        registerPage.setLastname(lastname);
    }

    @And("User input E-post {string}")
    public void userInputEPost(String post) {
        registerPage.setPost(post);
    }

    @And("User input mobile phone number {string}")
    public void userInputMobilePhoneNumber(String phoneNum) {
        registerPage.setMobilePhoneNumber(phoneNum);
    }

    @And("User input username {string}")
    public void userInputUsername(String username) {
        registerPage.setUsername(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        registerPage.setPassword(password);
    }

    @And("User input confirm password {string}")
    public void userInputConfirmPassword(String confPass) {
        registerPage.setConfirmPassword(confPass);
    }

    @And("User click submit button")
    public void userClickSubmitButton() {
        registerPage.clickSubmitBtn();
    }

    @Then("Message should be appear {string}")
    public void messageShouldBeAppear(String message) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(message, registerPage.verifyMessage());
    }


}
