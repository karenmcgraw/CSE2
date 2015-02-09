//Karen McGraw
//CSE 2
//Lab 3
//Feb. 6, 2015
//Big Mac takes user input to calculate the cost of an order of Big Macs as well as sales tax.

import java.util.Scanner; //must be imported to gather user input


public class BigMac { //main class
    //main method required for every java program
    public static void main(String[] args) {
        
        Scanner myScanner; //declare instance of scanner constructor
        myScanner=new Scanner(System.in); //scanner constructor
        
        System.out.print(
            "Enter the number of Big Macs (an integer >0) :"); //prompt user for input of number of burgers
        int nBigMacs=myScanner.nextInt(); //takes user input
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");//prompt user input of cost
        double bigMac$ = myScanner.nextDouble(); //takes user input
        System.out.print(
            "Enter the percent tax as a whole number (xx): "); //prompts user input of tax rate
        double taxRate = myScanner.nextDouble();
        taxRate/= 100; //user enters percent and i convert to proportion
        
        double cost$; 
        int dollars, //whole dollar amount of cost
              dimes, pennies; //for storing digits to the right of the decimal point
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of" +nBigMacs +" Big Macs, at $"+bigMac$ +" per Big Mac, with a " + 
        "sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies);
    } //end of main method
} //end of class
