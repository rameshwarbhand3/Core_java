package com.ram.annotations.fieldLevel;

public class Account {
    private String accNo;
    private String accHolderName;
    private String accType;
    private int balance;

    public Account(String accNo, String accHolderName, String accType, int balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.balance = balance;
    }
    public void getAccountDetails(){
        System.out.println("------------------------------");
        System.out.println("Account Details");
        System.out.println("Account number : "+accNo);
        System.out.println("Account Holder name : "+accHolderName);
        System.out.println("Account Type : "+accType);
        System.out.println("Account balance : "+balance);
    }
}
