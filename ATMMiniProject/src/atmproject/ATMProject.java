/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;

import java.util.Scanner;

public class ATMProject { 
    public static void main(String args[] )  
    {  
        int balance = 100000, withdraw, deposit;  
        Scanner scanner = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("====================ATM=======================");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.println("=============================================="); 
            System.out.print("Choose the operation you want to perform:");
            int choice = scanner.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.print("Enter Amount withdraw:"); 
                    withdraw = scanner.nextInt();
                    if(balance >= withdraw)  
                    {
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    } 
                    else  
                    { 
                        System.out.println("Insufficient Balance");
                    } 
                    break;  
   
                case 2:  
                    System.out.print("Enter Amount to deposit:");
                    deposit = scanner.nextInt(); balance = balance + deposit; 
                    System.out.println("Your Money has been successfully deposited");
                    break;  
   
                case 3:
                    System.out.println("Balance : "+balance);  
                    break;  
   
                case 4:  
                    System.exit(0);  
            }  
        }  
    }  
} 