package com.gla.Encapsulation.BankingSystem;
    public class Main {
        public static void main(String[] args) {

            BankAccount acc1 = new SavingsAccount("S101", "Rahul", 8000);
            BankAccount acc2 = new CurrentAccount("C101", "Amit", 15000);

            acc1.deposit(2000);
            acc1.withdraw(1000);

            acc2.deposit(5000);
            acc2.withdraw(2000);

            System.out.println("Savings Interest: " + acc1.calculateInterest());
            System.out.println("Current Interest: " + acc2.calculateInterest());

            Loanable loan1 = (Loanable) acc1;
            Loanable loan2 = (Loanable) acc2;

            loan1.applyForLoan(50000);
            loan2.applyForLoan(100000);
        }
    }

