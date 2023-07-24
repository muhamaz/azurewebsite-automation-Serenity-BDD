package net.azurewebsite.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setText(By locator, String text){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        tab(locator);
    }

    public String getText(By locator){
        String getText = driver.findElement(locator).getText();
        if (getText.isEmpty()){
            return driver.findElement(locator).getAttribute("value");
        }else{
            return getText;
        }
    }

    public void tab(By locator){
        driver.findElement(locator).sendKeys(Keys.TAB);
    }
    public void clickBtn(By locator){
        driver.findElement(locator).click();
    }

    public boolean verifyEnabled(By locator) {
        return driver.findElement(locator).isEnabled();
    }
    public boolean verifyDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}
