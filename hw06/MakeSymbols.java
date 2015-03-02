//Karen McGraw
//CSE 2
//Homework 6
//Make Symbols
import java.lang.Math;

public class MakeSymbols{
    public static void main(String[] args){
        int random = (int)(Math.random()*100);
        int a = 1;
        if(random%2 == 0){
            do{
                System.out.println("Random number generated: "+random);
                for(a=1;a<=random;a++){
                    System.out.print("*");
                }
                
            }while(a <= random);
        }
    
        else{
            do{
                System.out.println("Random number generated: "+random);
                for(a=1;a<=random;a++){
                    System.out.print("&");
                }
                
            }while(a<=random);
        }
    }
}