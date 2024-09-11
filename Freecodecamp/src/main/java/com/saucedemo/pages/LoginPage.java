package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By errorMesagge = By.cssSelector("#login_button_container h3");
    private By loginBtn = By.id("login-button");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    //    Transition method
    public ProductsPage clickLoginBtn() {
        click(loginBtn);
        return new ProductsPage();
    }

    //Convenience method
    public ProductsPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginBtn();
    }

    public String getErrorMessage() {
        return find(errorMesagge).getText();
    }
}
