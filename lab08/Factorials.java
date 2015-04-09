//Karen McGraw
//CSE 2
//Lab 8
//Create a program that calculates super factorials
import java.util.Scanner;
public class Factorials{
    public static void main(String[] args){//first method takes input and does simple factorial
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int input;
        int a = 1;
        int factorial = 1;
        System.out.println("Enter an integer: ");
        if(myScanner.hasNextInt()){
            input = myScanner.nextInt();
            while(a<=input){
                factorial *= a;
                a++;
            }
        }
        else{
           System.out.println("Invalid input");
           return;
        }
    }//close first method
    public static int SuperFactorial(int key){//do super factorial in second method
        int mul = 1;
        for(int i =1; i<=key; i++){
            mul *= i;
        }
        System.out.println(mul);
        return mul;
    }
    public static void print(int num){
        System.out.println("The super factorial is equal to" + num);
    }
}