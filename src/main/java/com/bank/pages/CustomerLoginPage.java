package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");
    By loginCustomerButton = By.xpath("//button[normalize-space()='Login']");
    By logoutText = By.xpath("//button[normalize-space()='Logout']");
    By logoutButton = By.xpath("//button[normalize-space()='Logout']");
    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");


    /* public void selectSearchYourNamedropDown(String text){
     selectByVisibleTextFromDropDown(searchYourName,text);
     }*/
    public void selectCustomerNameFromDropdown(String cName)
    {
        selectByVisibleTextFromDropDown(customerName,cName);
    }

    public void clickOnLoginCustomerButton(){
        clickOnElement(loginCustomerButton);
    }

    public String getLogoutText()
    {
        return getTextFromElement(logoutText);
    }

    public void clickOnLogoutButton()
    {
        clickOnElement(logoutButton);
    }

    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }

}
