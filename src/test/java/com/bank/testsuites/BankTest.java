package com.bank.testsuites;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    OpenAccountPage openAccountPage= new OpenAccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomer();
        bankManagerLoginPage.enterFirstNameField("Khushi");
        bankManagerLoginPage.enterLastNameField("Chaudhari");
        bankManagerLoginPage.enterPostcode("WD17");
        bankManagerLoginPage.clickOnAddCustomerButton();

      Assert.assertEquals(bankManagerLoginPage.getPopUpText().substring(0,27),"Customer added successfully");
        // bankManagerLoginPage.getPopUpText();
        bankManagerLoginPage.clickOnPopup();
    }

    @Test
    public void  bankManagerShouldOpenAccountSuccessfully()throws InterruptedException{

        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccount();
        Thread.sleep(2000);
        bankManagerLoginPage.selectCustomersNameFromDropDown("Harry Potter");
        bankManagerLoginPage.selectCurrencyNameFromDropDown("Pound");
        bankManagerLoginPage.clickONProcessButton();
       Assert.assertEquals(bankManagerLoginPage.getPopUpText().substring(0,28),"Account created successfully");
        bankManagerLoginPage.clickOnPopup();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully()throws InterruptedException{
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(3000);
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginCustomerButton();
        // Assert.assertEquals(customerLoginPage.getLogoutText(),"Logout");
        customerLoginPage.clickOnLogoutButton();
       Assert.assertEquals(customerLoginPage.getYourNameText().substring(0,9),"Your Name");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully()throws InterruptedException{
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(2000);
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginCustomerButton();
        openAccountPage.clickOnDepositMoney();
        openAccountPage.enterAmountAdd("100");
        openAccountPage.ClickOnDepositButton();
        Assert.assertEquals(openAccountPage.getYourNameText(),"Deposit Successful");

    }

    @Test
    public void  customerShouldWithdrawMoneySuccessfully()throws InterruptedException{
        homePage.clickOnCustomerLoginButton();
        // Thread.sleep(2000);
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginCustomerButton();
        accountPage.clickOnWithDrawlMoney();
        accountPage.enterAmountWithDrawl("50");
        accountPage.clickOnDepositButtonAccount();
        //Assert.assertEquals(accountPage.getWithdrawlMessageText(),"Transaction successful");


    }


}
