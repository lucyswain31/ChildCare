package com.smartdata.childcare.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.smartdata.childcare.driver.Driver;
import com.smartdata.childcare.util.Wait;

public class LoginPage{
	
	private WebElement userIdTextBox;
	private WebElement passwordTextBox;
	private WebElement loginButton;
	public LoginPage(WebDriver driver){
		
		
	}
	
	public void login(String userid,String password){
		userIdTextBox.sendKeys(userid);
		passwordTextBox.sendKeys(password);
		loginButton.click();
	}
	

}
