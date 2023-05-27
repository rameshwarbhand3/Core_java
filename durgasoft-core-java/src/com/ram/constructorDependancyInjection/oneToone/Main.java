package com.ram.constructorDependancyInjection.oneToone;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        account.setAccNo("abc123");
        account.setAccHolderName("Durga");
        account.setAccType("Savings");
        account.setBalance(50000);

        Employee employee = new Employee(111,"Durga",25000,"Hyd",account);
        employee.getEmployeeDetails();

    }
}