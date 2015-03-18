//Karen McGraw
//CSE 2
//Waves

import java.util.Scanner;

public class waves{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int a = 0, b=0, c=0, d= 0, e =1;
        int throwaway = 0;
        String string = "";
        String throwawaystring;
        boolean valid =false;
        System.out.println("Enter a number between 1 and 30, inclusive: ");
        while(!valid){
         if(myScanner.hasNextInt()){
             throwaway = myScanner.nextInt();
             if(throwaway <= 30 && throwaway >=1){
                 valid = true;
                 a = throwaway;
             }
             else{
                 b = throwaway;
                 System.out.println("Invalid input");
             }
         }
         else{
              valid = false;
             throwawaystring = myScanner.next();
             System.out.println("Invalid input");
         }
        }
       System.out.println("For Loop");
            for(e = 1; e <= a; e++){
                if(e%2==0){
                    for(c=1; c <= e; c++){
                        for(d = 1; d<= c; d++)
                        System.out.print(e+" ");
                        System.out.println();
                    }
                }
            else{
                for(c=1; c <= e; c++){
                        for(d = 1; d<=(e+1)-c; d++)
                        System.out.print(e+" ");
                        System.out.println();
                    }
            }
                
            }
        System.out.println("While Loop");
            e = 1;
            while(e<=a){
                c=1;
                while(c<=e){
                    d=1;
                    if(e%2==0){
                        while(d<=c){
                            System.out.print(e+" ");
                            d++;
                        }
                    }
                    else{
                        while(d<=(e+1-c)){
                            System.out.print(e+" ");
                            d++;
                        }
                    }
                    c++;
                    System.out.println();
                }
                e++;
            }
        System.out.println("Do Loop");
        e = 1;
        do{
            c=1;
            do{
                d=1;
                if(e%2==0){
                    do{
                        System.out.print(e+" ");
                        d++;
                    }while(d<=c);
                }
                else{
                    do{
                        System.out.print(e+" ");
                        d++;
                    }while(d<=(e+1-c));
                }
                System.out.println();
                c++;
            }while(c<=e);
            e++;
        }while(e<=a);
    }
}