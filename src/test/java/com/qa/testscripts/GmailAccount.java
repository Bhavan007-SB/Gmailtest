package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Gmailpages;

public class GmailAccount extends Testbase {
	@Test(priority = 0)
	public void testcase_001_openAmazon() {
		if(Driver.getTitle().contains("Amazon.in")) {
			System.out.println("Amazon Website Opened");
		}
		else {
			System.out.println("Amazon Website Not Opened");
		}
	}
	@Test(priority = 1)
	public void testcase_002_clickGmailIcon() throws InterruptedException {
		Driver.navigate().to("https://www.google.co.in/");
		Gmailpages.signinbtn.click();
		Gmailpages.createAccount.click();
		Gmailpages.personaluse.click();
		System.out.println("Enter details to create Google Account");
	}
	@Test(priority = 2)
	public void testcase_003_createAccount() throws InterruptedException {
		Gmailpages.firstName.sendKeys("El");
		Gmailpages.lastName.sendKeys("Hopper");
		Gmailpages.username.sendKeys("kbhavan463");
		Gmailpages.password.sendKeys("StrangerThings");
		Gmailpages.confirmPassword.sendKeys("StrangerThings");
		Gmailpages.nxtbutton1.click();
		Thread.sleep(4000);
		Gmailpages.phoneNumber.sendKeys("6302907683");
		//Gmailpages.nxtbutton2.click();
		if(Gmailpages.headingText.getText().equals("Verify your phone number")) {
			System.out.println("Account Successfully Created");
		}
		else {
			System.out.println("Account not created");
		}
	}
}
