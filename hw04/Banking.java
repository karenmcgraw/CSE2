//Karen McGraw
//CSE 2 HW04
//Banking
//Feb. 17, 2015
//allows users to process banking transactions

import java.util.Scanner;
import java.lang.Math;

//main class
public class Banking {
    //main method
    public static void main(String[] args) {
        //initialize Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //assign random starting amount to bank account
        //between $1000-5000
        int initialAmount = (int)(Math.random()*(5000-1000))+ 1000;
        //Ask initial user question
        //what does user want to do
        System.out.print(
            "Do you want to deposit money, withdraw money, or view your account balance? (Please enter 1, 2, or 3)");
        //read user input
        if(myScanner.hasNextInt()){
            
            int userInput = myScanner.nextInt();
            
            if(userInput=1 || userInput=2 || userInput = 3){
            switch(userInput){
                case 1:
                    System.out.println("How much do you want to deposit? : ");
                    
                    userInput=myScanner.nextInt();
                    if(userInput>=0){
                        int accountBalance = userInput + initialAmount;
                        System.out.println("Your new balance is $" +accountBalance);
                    }
                    else{
                        System.out.println("You can't deposit a negative amount of money.");
                    }
                    break;
                case 2:
                    System.out.println("How much money do you want to withdraw? : ");
                    userInput=myScanner.nextInt();
                    if (userInput > initialAmount || userInput <= 0){
                        System.out.println("That is an invalid amount.");
                    }
                    else if(userInput <= initialAmount && userInput > 0){
                        int newAccountBalance= initialAmount - userInput;
                        System.out.println("Your new balance is $" +newAccountBalance);
                    }
                    break;
                
                case 3:
                    System.out.println("Your current balance is $" +initialAmount);
                break;
                
            }
            
            else{ System.out.println("The value you entered is invalid.");
            }
            
        
        else{System.out.println("Enter an integer.") ; }
            }
        }
    }
}