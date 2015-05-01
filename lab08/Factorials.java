//Karen McGraw
//CSE 2
//Lab 8
//Create a program that calculates super factorials
import java.util.Scanner;

public class Factorials{
public static void main (String [] args){
             
    Scanner myScanner = new Scanner(System.in);  
    System.out.print("Enter an positive interger: ");
    int input = 0;
    input = myScanner.nextInt();
    int sum = 0;
    int i = 0;
    for(i=1; i <= input; i++){
    sum += factorial(i);}
    print(sum);
    }       
    
    public static int factorial(int input){
    int fact = 1;
    int j;
    for(j = 1; j <= input ; j++){
        fact = fact * j;
    }
    return fact;
    }
            public static void print(int sum){
            System.out.println("The super factorial is "+sum);
        
        }
}