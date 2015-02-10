//Karen McGraw
//CSE 2
//Homework 3 - Root
//takes user input and estimates
//the cube root of the number
//and the cube of the guess

import java.util.Scanner; //must be imported to gather user input

public class Root {   //main class always necessary
        public static void main(String[] args) {    //main method
            
        Scanner myScanner; //declare instance of scanner constructor
        myScanner=new Scanner(System.in); //scanner constructor
        
        System.out.print(
            "Enter an double, and I print its cube root: ");
        double number=myScanner.nextDouble();
        
        double firstGuess, secondGuess, thirdGuess, fourthGuess, fifthGuess, finalCube;
        
        firstGuess=number/3;
        secondGuess=(2*firstGuess*firstGuess*firstGuess+number)/(3*firstGuess*firstGuess);
        thirdGuess=(2*secondGuess*secondGuess*secondGuess+number)/(3*secondGuess*secondGuess);
        fourthGuess=(2*thirdGuess*thirdGuess*thirdGuess+number)/(3*thirdGuess*thirdGuess);
        fifthGuess=(2*fourthGuess*fourthGuess*fourthGuess+number)/(3*fourthGuess*fourthGuess);
        finalCube=fifthGuess*fifthGuess*fifthGuess;
        System.out.println("The cube root is "+fifthGuess+":");
        System.out.print(
            fifthGuess+"*"+fifthGuess+"*"+fifthGuess+"="+finalCube);
        }         

} 
        