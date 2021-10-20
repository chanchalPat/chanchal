package com.brifgrlabz.facebook.page;

import com.brifgrlabz.facebook.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    // declaration
    @FindBy(id = "email")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;

    @FindBy(name = "login")
    WebElement loginButton;

    // initialization
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }


    public String verifyPageTitle() {
        return driver.getTitle();
    }

    public Homepage login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
        return new Homepage();
    }

}
