package com.ram.exceptionHandling;

public class AccountMain {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.setAccNo("A-111");
        account1.setAccHolderName("Durga");
        account1.setAccType("Savings");
        account1.setAccBalance(20000);
        Transaction transaction = new Transaction("T-111");
        transaction.withdraw(account1,5000);
    }
}
