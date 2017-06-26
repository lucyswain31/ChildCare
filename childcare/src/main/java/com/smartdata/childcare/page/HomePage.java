package com.smartdata.childcare.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.smartdata.childcare.driver.Driver;


public class HomePage extends Driver{
	
	private WebElement loginLink;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		loginLink=driver.findElement(By.xpath("//a[@title='Login']"));
	}
	
	public void getLoginPage(){
		loginLink.click();
	}
	

}
