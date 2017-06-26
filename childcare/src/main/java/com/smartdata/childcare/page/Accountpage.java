package com.smartdata.childcare.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.smartdata.childcare.actions.Link;
import com.smartdata.childcare.driver.Driver;
import com.smartdata.childcare.util.Wait;

public class Accountpage{
	
	private Link loginLink;
	public Accountpage(WebDriver driver){
		loginLink=new Link(driver, By.xpath("//a[@title='Login']"));
	}
	public void getLoginPage(){
		loginLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*private WebElement accountIconImage;
	private WebElement LOANlink;
	public Accountpage(WebDriver driver){
		this.driver=driver;
		accountIconImage=driver.findElement(By.id("my-account-link"));
		LOANlink=driver.findElement(By.xpath("//li[@class]//a[@title='Apply Loan Online']"));
	}
	
	public boolean isLoggedIn(){
		Wait.customSleep(3);
		return accountIconImage.isDisplayed();
	}
	public void hoverOnloan(){
		Actions act = new Actions(driver);
		act.moveToElement(LOANlink).build().perform();
	}*/

}
