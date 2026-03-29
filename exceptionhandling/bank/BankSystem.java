package com.exceptionhandling.bank;

import java.util.Scanner;
import exception.InsufficientBalanceException;

    public class BankSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            BankAccount account = new BankAccount(1000);

            try {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                account.withdraw(amount);
            }
            catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid amount!");
            }
            finally {
                sc.close();
            }
        }
    }

