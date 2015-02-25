//Karen McGraw
//CSE 2 HW04
//Which Number
//Feb. 18, 2015
//user inputs a number 1-10
//program asks a series of questions
//and tries to guess the number

import java.util.Scanner; //import scanner

public class WhichNumber{ //main class
    public static void main(String[] args){ //main method
        Scanner myScanner; //initialize scanner
        myScanner = new Scanner(System.in);
        System.out.println("Think of a number from 1-10 (including 1 & 10");
        //First Question
        System.out.println("Is your number even? (Enter Y/y or N/n) : ");
        String answer = myScanner.next();
        
        if(answer.equals ("y") || answer.equals("Y")){
            System.out.println("Is your number divisible by 3? : ");
            answer = myScanner.next();
            if(answer.equals("y") || answer.equals("Y")){
                System.out.println("Your number is 6!");
            }
            else if(answer.equals("n") || answer.equals("N")){
                System.out.println("Is your number divisible by 4? : ");
                answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){
                    System.out.println("If you divide the number by 4, is the answer greater than 1? :");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){
                        System.out.println("Your number is 8!");
                    }
                    else if(answer.equals("n")||answer.equals("N")){
                        System.out.println("Your number is 4!");
                    }
                    else{
                        System.out.println("Incorrect Input");
                        return;
                    }
                else if(answer.equals("n")||answer.equals("N")){
                    System.out.println("Is your number divisible by 5? :");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){
                        System.out.println("Your number is 10!");
                    }
                    else if(answer.equals("n")||answer.equals("N")){
                        System.out.println("Your number is 2!");
                    }
                    else{
                        System.out.println("Incorrect Input");
                        return;
                    }
                }
                else{
                     System.out.println("Incorrect Input");
                        return;
                }
                }
                else{
                     System.out.println("Incorrect Input");
                        return;
                }
            }
            else if(answer.equals("n")||answer.equals("N")){
                System.out.println("Is it divisible by 3? :");
                answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){
                    System.out.println("If you divide your number by 3 is the answer bigger than 1? : ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){
                        System.out.println("Your number is 9!");
                    }
                    else if(answer.equals("n")||answer.equals("N")){
                        System.out.println("Your number is 3!");
                    }
                    else{
                         System.out.println("Incorrect Input");
                        return;
                    }
                }
            else if(answer.equals("n")||answer.equals("N")){
                System.out.println("Is your number bigger than 6? : ");
                answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){
                    System.out.println("Your number is 7!");
                }
                else if(answer.equals("n")||answer.equals("N")){
                    System.out.println("Is your number less than 3? : ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){
                        System.out.println("Your number is 1!");
                    }
                    else if(answer.equals("n")||answer.equals("N")){
                        System.out.println("Your number is 5!");
                    }
                    else{
                         System.out.println("Incorrect Input");
                        return;
                    }
                }
                else{
                     System.out.println("Incorrect Input");
                        return;
                }
            }   
            else{
                 System.out.println("Incorrect Input");
                        return;
            }
            }
            else{
                 System.out.println("Incorrect Input");
                        return;
            }
            
        }
    }
}