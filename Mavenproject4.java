/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author karlo
 */
public class Mavenproject4 {

    public static void main(String[] args) {
   

        Scanner input = new Scanner(System.in);


        final int correctPin = 1234;

        int pin;
        int attempts = 0;

        boolean loggedIn = false;



        while (attempts < 3 && !loggedIn) {

            System.out.println("Enter your PIN:");
            pin = input.nextInt();

            if (pin == correctPin) {
                System.out.println("Login successful!");
                loggedIn = true;
            }
            else {
                attempts++;
                System.out.println("Wrong PIN!");

                System.out.println("Attempts left: " + (3 - attempts));
            }
        }



        if (!loggedIn) {

            System.out.println("Account blocked!");

        }
        else {


            double balance = 1000.0;

            String[] transactions = new String[100];

            int transactionCount = 0;

            int choice = 0;



            while (choice != 5) {

                System.out.println("\n===== ATM MENU =====");

                System.out.println("1. Check Balance");

                System.out.println("2. Deposit Money");

                System.out.println("3. Withdraw Money");

                System.out.println("4. Transaction History");

                System.out.println("5. Exit");

                System.out.println("Enter your choice:");

                choice = input.nextInt();


                // Check balance

                if (choice == 1) {

                    System.out.println("Your balance: " + balance);

                }



                else if (choice == 2) {

                    System.out.println("Enter deposit amount:");

                    double amount = input.nextDouble();

                    if (amount > 0) {

                        balance = balance + amount;

                        System.out.println("Deposit successful!");

                        if (transactionCount < transactions.length) {

                            transactions[transactionCount] =
                                    "Deposit: " + amount;

                            transactionCount++;

                        }
                    }
                    else {

                        System.out.println("Invalid amount!");

                    }

                }



                else if (choice == 3) {

                    System.out.println("Enter withdrawal amount:");

                    double amount = input.nextDouble();

                    if (amount > 0 && amount <= balance) {

                        balance = balance - amount;

                        System.out.println("Withdrawal successful!");

                        if (transactionCount < transactions.length) {

                            transactions[transactionCount] =
                                    "Withdrawal: " + amount;

                            transactionCount++;

                        }
                    }
                    else {

                        System.out.println("Insufficient balance or invalid amount!");

                    }

                }



                else if (choice == 4) {

                    System.out.println("Transaction History:");

                    if (transactionCount == 0) {

                        System.out.println("No transactions yet.");

                    }
                    else {

                        for (int i = 0; i < transactionCount; i++) {

                            System.out.println(transactions[i]);

                        }

                    }

                }



                else if (choice == 5) {

                    System.out.println("Thank you for using our ATM!");

                }



                else {

                    System.out.println("Invalid choice!");

                }

            }

        }

        input.close();

    }

}
    

