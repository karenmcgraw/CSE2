//Karen McGraw
//CSE 2
//3/3/15
//Get Integers

import java.util.Scanner;

public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 non-negative integers");
        int int1 =0, int2=0, int3=0, int4=0, int5=0;
        String a;
        boolean validInput = false;
        while(!validInput){
            if(myScanner.hasNextInt()){
                validInput= true;
            }
            else{
              a = myScanner.next();
              validInput= false;
              System.out.println("Incorrect input, enter again");
            }
        }
        while(validInput==true){
            int1 = myScanner.nextInt();
            if(int1>0){
                break;
            }
            else{
                System.out.println("Incorrect input, enter again");
                continue;
            }
        }
        validInput = false;
        while(!validInput){
            if(myScanner.hasNextInt()){
                validInput = true;
            }
            else{
                a = myScanner.next();
                validInput = false;
                System.out.println("Incorrect input, enter again");
            }
        }
        while(validInput==true){
            int2 = myScanner.nextInt();
            if(int2>0){
                break;
            }
            else{
                System.out.println("Invalid input, enter again");
                continue;
            }
        }
        validInput = false;
        while(!validInput){
            if(myScanner.hasNextInt()){
                validInput = true;
            }
            else{
                a = myScanner.next();
                validInput = false;
                System.out.println("Incorrect input, enter again");
            }
        }
        while(validInput==true){
            int3 = myScanner.nextInt();
            if(int3>0){
                break;
            }
            else{
                System.out.println("Invalid input, enter again");
                continue;
            }
        }
        validInput = false;
        while(!validInput){
            if(myScanner.hasNextInt()){
                validInput = true;
            }
            else{
                a = myScanner.next();
                validInput = false;
                System.out.println("Incorrect input, enter again");
            }
        }
        while(validInput==true){
            int4 = myScanner.nextInt();
            if(int4>0){
                break;
            }
            else{
                System.out.println("Invalid input, enter again");
                continue;
            }
        }
        validInput = false;
        while(!validInput){
            if(myScanner.hasNextInt()){
                validInput = true;
            }
            else{
                a = myScanner.next();
                validInput = false;
                System.out.println("Incorrect input, enter again");
            }
        }
        while(validInput==true){
            int5 = myScanner.nextInt();
            if(int5>0){
                break;
            }
            else{
                System.out.println("Invalid input, enter again");
                continue;
            }
        }
        
        System.out.println("Sum is "+(int1+int2+int3+int4+int5));
        
    }
}