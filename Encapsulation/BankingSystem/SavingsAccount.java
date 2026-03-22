package com.gla.Encapsulation.BankingSystem;
    class SavingsAccount extends BankAccount implements Loanable {

        public SavingsAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }

        public double calculateInterest() {
            return balance * 0.04;
        }

        public void applyForLoan(double amount) {
            if (calculateLoanEligibility()) {
                System.out.println("Loan Approved: " + amount);
            } else {
                System.out.println("Loan Rejected");
            }
        }

        public boolean calculateLoanEligibility() {
            return balance > 5000;
        }
    }

