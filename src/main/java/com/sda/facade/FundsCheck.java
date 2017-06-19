package com.sda.facade;


public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashToWithdraw) {
        cashInAccount -= cashToWithdraw;
    }

    public void increaseCashInAccount(double cashToIncrease) {
        cashInAccount += cashToIncrease;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > cashInAccount) {
            System.out.println("You do not have enough money");
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }

}
