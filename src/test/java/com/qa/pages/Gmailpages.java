package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailpages {

	WebDriver Driver;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div/div[2]/a")
	public static WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")
	public static WebElement createAccount;
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[2]")
	public static WebElement personaluse;
	
	@FindBy(id="firstName")
	public static WebElement firstName;
	
	@FindBy(id="lastName")
	public static WebElement lastName;
	
	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input")
	public static WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input")
	public static WebElement confirmPassword;
	
	@FindBy(id="accountDetailsNext")
	public static WebElement nxtbutton1;
	
	@FindBy(id="phoneNumberId")
	public static WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
	public static WebElement nxtbutton2;
	
	@FindBy(id="headingText")
	public static WebElement headingText;
	
	public Gmailpages(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }
}
