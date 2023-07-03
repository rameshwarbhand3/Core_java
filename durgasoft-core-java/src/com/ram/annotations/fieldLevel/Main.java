package com.ram.annotations.fieldLevel;

import java.lang.reflect.Field;

public class Main {
    public static void main(String args[]) throws NoSuchFieldException {
        Account account = new Account("s-111", "Sham", "savings", 10000);
        Employee employee = new Employee(1, "sham", 5000, "pune", account);
        employee.getEmployeeDetails();

        Class cls = employee.getClass();
        Field field = cls.getDeclaredField("account");
        field.setAccessible(true);
        Bank bank = field.getAnnotation(Bank.class);

        System.out.println("------------------------------------");
        System.out.println("Bank Details ");
        System.out.println("Bank name : " + bank.name());
        System.out.println("Bank branch : " + bank.branch());
        System.out.println("Bank website : " + bank.website());
        System.out.println("Bank pnone : " + bank.phone());
    }
}
