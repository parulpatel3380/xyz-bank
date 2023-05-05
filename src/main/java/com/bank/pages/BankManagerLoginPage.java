package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");

    By addCustomerButton= By.xpath("//button[@type='submit']");
    //  By popUpMessageTextAddCustomer = By.xpath("");
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    By searchCustomerCurrentUser = By.id("userSelect");
    By currencyListBankManager = By.id("currency");

    By processButton = By.xpath("//button[normalize-space()='Process']");

    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }

    public void enterFirstNameField(String first){
        sendTextToElement(firstNameField,first);
    }
    public void enterLastNameField(String last){
        sendTextToElement(lastNameField,last);
    }
    public void enterPostcode(String post){
        sendTextToElement(postCode,post);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    public void clickOnPopup(){
        switchToAlert();
        acceptAlert();
    }


    public String getPopUpText(){
        return getTextFromAlert();
    }

    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
    }
    public void selectCustomersNameFromDropDown(String text){
        selectByVisibleTextFromDropDown(searchCustomerCurrentUser,text);
    }

    public void selectCurrencyNameFromDropDown(String text){

        selectByVisibleTextFromDropDown(currencyListBankManager,text);
    }

    public void clickONProcessButton(){
        clickOnElement(processButton);
    }
}
