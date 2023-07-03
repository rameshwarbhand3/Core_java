package com.ram.annotations.fieldLevel;
import com.ram.annotations.fieldLevel.Bank;
public class Employee {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;


    @Bank(
            name = "Axis Bank",
            phone = "7387326088"
    )
    private Account account;

    public Employee(int eno, String ename, float esal, String eaddr, Account account) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("--------------------------------");
        System.out.println("Employee number : "+eno);
        System.out.println("Employee name : "+ename);
        System.out.println("Employee salary : "+esal);
        System.out.println("Employee address : "+eaddr);
        account.getAccountDetails();
    }
}

