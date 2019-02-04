package com.gmail.granovskiy.s;

public class BankDemo {
    public static void main(String[] args) {
        //  Builder Pattern at work:
        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Mike")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        BankAccount anotherAccount = new BankAccount.Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.toString());
        System.out.println(anotherAccount.toString());
    }
}

/*
When you keep on adding new parameters to a constructor,
resulting in code that becomes error-prone and hard to read,
perhaps it's a good time to take a step back and consider
refactoring your code to use a Builder.
 */