package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By depositMoney = By.xpath("//button[normalize-space()='Deposit']");
    By amountAdd = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@type='submit']");
    By depositText = By.xpath("//span[@class='error ng-binding']");

    public void clickOnDepositMoney() {
        clickOnElement(depositMoney);
    }

    public void enterAmountAdd(String amountValue) {
        sendTextToElement(amountAdd, amountValue);
    }

    public void ClickOnDepositButton(){
        clickOnElement(depositButton);
    }

    public String getYourNameText(){

        return getTextFromElement(depositText);
    }


}
