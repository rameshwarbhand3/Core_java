package com.ram.exceptionHandling;

import javax.naming.InsufficientResourcesException;

public class Transaction {
    private String transactionId;
    public Transaction(String transactionId){
        this.transactionId = transactionId;
    }
    public void withdraw(Account account,int withdrawAmount){
        try{
            System.out.println("System details : ");
            System.out.println("-----------------------------");
            System.out.println("TransactionId is : "+transactionId);
            System.out.println("Account number : "+account.getAccNo());
            System.out.println("AccountHolder name : "+account.getAccHolderName());
            System.out.println("Account type : "+account.getAccType());
            System.out.println("Transaction type : Withdraw");
            int accountBalance = account.getAccBalance();
            if(accountBalance < withdrawAmount){
                System.out.println("Account Balance : "+account.getAccBalance());
                System.out.println("Transaction status : Fail");
                throw new InsufficientResourcesException("Funds are not sufficient");
            }else{
                int newBalance = account.getAccBalance()-withdrawAmount;
                account.setAccBalance(newBalance);
                System.out.println("Account Balance : "+account.getAccBalance());
                System.out.println("Transaction status : Success");
            }
        }catch (InsufficientResourcesException e){
            e.printStackTrace();
        }finally {
            System.out.println("Thank you,visit again");
        }
    }
}
