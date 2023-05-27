package com.ram.constructorDependancyInjection.oneToone;
public class Employee {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;
    private Account account;

    public Employee(int eno, String ename, float esal, String eaddr, Account account) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }
    public void getEmployeeDetails(){
        System.out.println("employee Details : ");
        System.out.println("------------------------");
        System.out.println("eno : "+eno);
        System.out.println("ename : "+ename);
        System.out.println("esal : "+esal);
        System.out.println("eaddr : "+eaddr);


        System.out.println("account Details : ");
        System.out.println("---------------------------");
        System.out.println("account no is : "+account.getAccNo());
        System.out.println("accountHoldername is : "+account.getAccHolderName());
        System.out.println("accountType is : "+account.getAccType());
        System.out.println("account balance is : "+account.getBalance());
    }

}


