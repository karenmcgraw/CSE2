//Karen McGraw
//CSE 2
import java.util.Random;
import java.util.Scanner;

public class CSE2Linear{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int[] scores = new int[15];
            System.out.println("Please enter "+scores.length+"integers in order from least to greatest between 0 and 100");
            for(int i = 0; i < scores.length; i++){
                if(myScanner.hasNextInt()){
                    if(myScanner.nextInt >=0 && myScanner.nextInt =< 100){
                         scores[i]= input.nextInt;

                    }
                    else{
                        System.out.println("Please enter only integers between 0 and 100");
                        return;
                    }

                }
                else{
                    System.out.println("Input not an integer.");
                    return;
                }
             
            
            }
            System.out.print(scores[i]);
        }

    }
