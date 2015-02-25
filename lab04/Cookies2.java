//Karen McGraw
//CSE 2 Lab 04
//Cookies
//This program is collecting user input on cookies:
//numbers made, numbers purchased, and number of people
//getting cookies

import java.util.Scanner;

public class Cookies2{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        int divideEvenly;

    System.out.print(
        "Enter the number of people: ");
                if (myScanner.hasNextInt()){

    int People=myScanner.nextInt();
    if(People<1){
        System.out.println("You did not enter an integer > 1 ");
        return;
    }
        
    else{
        System.out.print(
            "Enter how many cookies you are planning to buy: ");
        int numberCookies=myScanner.nextInt();
        if(numberCookies<1)
            System.out.println("You did not enter an integer > 1");
            return;
        else{
            if(myScanner.hasNextInt())
            System.out.print(
                "How many do you want each person to get? ");
            int cookiesPerPerson=myScanner.nextInt();
            if(myScanner.hasNextInt()){
                 divideEvenly= numberCookies%People;
                if(divideEvenly=0){
                    System.out.print(
                    "You have enough cookies for each person and the amount will divide evenly.");
                }
            }
               
                else{
                    if(divideEvenly!=0){
                        System.out.print("It will not divide evenly.");
                    }
                    
                 }
            else{
                System.out.println("You did not enter an integer");
                return;
            }
        else{
            System.out.println("You did not enter an integer");
            return;
        }    
    else{
        System.out.pr("You did not enter an integer");
        return;
    }    
        }
        
    }
    
    }
}