package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By withdrawlMoney = By.xpath("//button[normalize-space()='Withdrawl']");
    By enterAmountWithdrawl = By.xpath("//input[@placeholder='amount']");
    By depositButtonONAccountPage = By.xpath("//button[normalize-space()='Deposit']");

    By withdrawlMessageText = By.xpath("//span[@class='error ng-binding']");


    public void clickOnWithDrawlMoney(){
        clickOnElement(withdrawlMoney);
    }

    public void enterAmountWithDrawl(String text){
        sendTextToElement(enterAmountWithdrawl,text);
    }

    public void clickOnDepositButtonAccount(){
        clickOnElement(depositButtonONAccountPage);
    }

    public String getWithdrawlMessageText()
    {
        return getTextFromElement(withdrawlMessageText);
    }
}
