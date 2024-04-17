package ATMMachine;

import java.util.Scanner;

public class ATM {
   
    
    
        float Balance;
        int PIN = 6875;
        public void checkpin(){
            System.out.println("Enter your pin: ");
            Scanner scn = new Scanner(System.in);
            int enteredpin = scn.nextInt();
            if(enteredpin == PIN){
                menu();
            }
            else{
                System.out.println("invalid pin");
                System.out.println("Try Again");
                System.out.println("Enter valid pin");
                int validpin= scn.nextInt();
                if(validpin == PIN)
                menu();
                else{
                    System.out.println("invalid invalid...");
                }
            }
        }
            public void menu(){
    
                System.out.println(" Enter your  Choice: ");
                System.out.println("1. Check A/C Balance");
                System.out.println("2. withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
    
                Scanner scn = new Scanner(System.in);
                int opt = scn.nextInt();
    
                        if(opt == 1){
                            CheckBalance();
                        }
                        else if(opt == 2){
                            withdrawMoney();
                        }
                        else if(opt == 3){
                            depositMoney();
                        }
                        else if(opt == 4){
                            return;
                        }
                        else{
                            System.out.println("Enter a valid choice");
                        }
            }
            public void CheckBalance(){
                System.out.println("Balance: "+Balance);
                menu();
    
            }
            public void withdrawMoney(){
                System.out.println("Enter Amount to Withdraw");
                Scanner scn = new Scanner(System.in);
                float amount = scn.nextFloat();
                if(amount > Balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    Balance = Balance - amount;
                    System.out.println("Money Withdrawl Successful");
                }
                menu();
            }
           public void depositMoney(){
                System.out.println("Enter the Amount: ");
                Scanner scn = new Scanner(System.in);
                float amount = scn.nextFloat();
                Balance = Balance + amount;
                System.out.println("Money Deposited Successfully");
                menu();
    
    
            }
        }
