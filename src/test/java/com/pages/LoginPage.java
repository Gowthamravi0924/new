package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
public LoginPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private List<WebElement> userName;
@FindBy(id="pass")
private List<WebElement> password;

@FindBy(xpath="//input[@value='Log In']")
private List<WebElement> login;

public List<WebElement> getUserName() {
	return userName;
}

public List<WebElement> getPassword() {
	return password;
}

public List<WebElement> getLogin() {
	return login;
}



}