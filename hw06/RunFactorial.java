//Karen McGraw
//CSE 2
//Hw06
//Run Factorial
//Calculates factorials between 9 and 16
import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int input;
        int a = 1;
        int factorial = 1;
        System.out.println("Please enter an integer between 9 and 16: ");
        if(myScanner.hasNextInt()){
            input = myScanner.nextInt();
            if(input>=9 && input<=16){
                System.out.println("Input accepted: ");
                while(a<=input){
                    factorial *= a;
                    a ++;
                }
                System.out.println(input+"! ="+factorial);
            }
        else{
            System.out.println("Invalid input, try again!");
            return;
        }
        }
        else{
            System.out.println("Invalid input, try again!");
            return;
        }
        
    }
}