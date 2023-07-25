package net.azurewebsite.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    private By firstnameField = By.xpath("//input[@id='FirstName']");
    private By lastnameField = By.xpath("//input[@id='Surname']");
    private By e_postField = By.xpath("//input[@id='E_post']");
    private By mobileField = By.xpath("//input[@id='Mobile']");
    private By usernameField = By.xpath("//input[@id='Username']");
    private By passwordField = By.xpath("//input[@id='Password']");
    private By confirmPassField = By.xpath("//input[@id='ConfirmPassword']");
    private By submitBtn = By.xpath("//input[@id='submit']");
    private By message = By.xpath("//label[@class='label-success']");
    private By textAddNewUser = By.xpath("//h2[.='Add new user']");

    public void setFirstname(String text) {
        setText(firstnameField, text);
    }

    public void setLastname(String text) {
        setText(lastnameField, text);
    }

    public void setPost(String text) {
        setText(e_postField, text);
    }

    public void setMobilePhoneNumber(String text){
        setText(mobileField, text);
    }

    public void setUsername(String text) {
        setText(usernameField, text);
    }
    public void setPassword(String text) {
        setText(passwordField, text);
    }

    public void setConfirmPassword(String text) {
        setText(confirmPassField, text);
    }

    public void clickSubmitBtn(){
        clickBtn(submitBtn);
    }

    public String verifyMessage(){
        return getText(message);
    }

    public String getAddNewUserText(){
        return getText(textAddNewUser);
    }
}
