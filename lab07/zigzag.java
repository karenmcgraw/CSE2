//Karen McGraw

import java.util.Scanner;
public class zigzag {
    public static void main (String[] args){
     
      Scanner myScanner = new Scanner(System.in);  
        int a = 0; 
        int b = 0; 
        int c = 0; 
        int nStars=0;
        String t;
        boolean valid = false;
        boolean valid2 = true;
        String x = "";
        
        while(valid2){
                System.out.print("Enter a number between 3 and 33: ");
                    while(!valid){
                        if(myScanner.hasNextInt()){
                            c = myScanner.nextInt();
                                if(c < 33  && c > 3){
                                    valid = true;  
                                    nStars = c;    
                                }
                                else{
                                    b = c;
                                    System.out.println("Incorrect input, try again:");
                                }
                            }
                        else{
                            t = myScanner.next();
                            valid = false;
                            System.out.println("Incorrect input, try again:");
                        }
        }
    
     int y = 0;
     int z = 1;    
     String temp = "*";
     String temp2 = "*";
     
        for(y=1; y < nStars; y++){
            System.out.print(temp);
        }
        for(z=1;z < nStars;z++){
            System.out.println(temp2);
            temp2 = " " + temp2; 
            }
      for(y=0; y < nStars; y++){
            System.out.print(temp);
        }
        
        System.out.println("Enter y or Y to go again: ");
        x = myScanner.next();
        if(x.equals ("y") || x.equals ("Y")){
            valid2 = true;
            valid = false;
        }
        else{
            valid2 = false;
        }
        }
    }
}