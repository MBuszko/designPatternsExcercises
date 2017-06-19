package com.sda.facade;


public class TestBankAccount {

    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(150.00);
        accessingBank.withdrawCash(700.00);
        accessingBank.withdrawCash(300.00);
    }

}
