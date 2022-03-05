package com.TEKsystem.Module;

import java.util.Scanner;

public class BankAccount {
      // declare the class variables

      int balance;
      int previousTransaction;
      String customerName;
      String customerId;

      public BankAccount(String customerName, String customerId) {
            this.customerName = customerName;
            this.customerId = customerId;
      }


      void deposit(int amount ){
            if (amount != 0 ){
                  balance = balance + amount ;
                  previousTransaction = amount;
            }
      }
      void withdraw(int amount){
            if (amount != 0){
                  balance = balance - amount;
                  previousTransaction = amount;
            }
      }
     void getPreviousTransaction() {
            if (previousTransaction > 0){
                  System.out.println("Deposited: " +previousTransaction);
            } else if (previousTransaction < 0) {

                  System.out.println("withdraw : " + Math.abs(previousTransaction));
            }else {
                  System.out.println("No transaction occured !!");
            }
     }
     void showMen(){
            char option = '\0';
           Scanner scanner = new Scanner(System.in);
           System.out.println("Welcome " + customerName);
           System.out.println("Your Id " + customerId);
           System.out.println("\n");
           System.out.println("A.  Check Balance");
           System.out.println("B.  Deposit");
           System.out.println("C.  Withdraw");
           System.out.println("D.  Previous Transaction ");
           System.out.println("E.  Exit ");

         do {
             System.out.println("--------------------------> ");
             System.out.println(" Enter an option : ");
             System.out.println("---------------->");
             option= scanner.next().charAt(0);
             System.out.println("\n");

             switch (option){

                 case 'A' :
                     System.out.println("----------------------");
                     System.out.println("Balance = " + balance);
                     System.out.println("------------------------");
                     System.out.println("\n");
                     break;
                 case 'B' :
                     System.out.println("----------------------");
                     System.out.println(" Enter the Amount to Deposit  " );
                     System.out.println("------------------------");
                     int amount = scanner.nextInt();
                     deposit(amount);
                     System.out.println("\n");
                     break;

                 case 'C' :
                     System.out.println("-------------------------");
                     System.out.println("Enter Amount to Deposit :");
                     System.out.println("----------------------");
                     int amount2 = scanner.nextInt();
                     System.out.println("\n");
                     break;

                 case 'D' :
                     System.out.println("----------------------");
                     getPreviousTransaction();
                     System.out.println("--------------------------");
                     System.out.println("\n");
                     break;

                 case 'E':
                     System.out.println("==========");
                     break;

                 default:
                     System.out.println("Invalid Option !! Please enter again ");
                     break;

             }
       }while (option != 'E');
         System.out.println("Thank you for our services ");
     }
}
