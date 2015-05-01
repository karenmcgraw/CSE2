import java.util.Arrays;
import java.util.Scanner;

class ArrayInputs{ 
  public static void main(String[] args){ 

  Scanner myScan = new Scanner(System.in);
  int a = 0;
  System.out.println("Enter an integer for the size of the array: ");
      a= myScan.nextInt();
      int[] one = new int[a];

        int x = 0;
        boolean valid = true;
        boolean valid2 = false;
        int z = 0;
        String f = "";
  
            
            while(!valid2){
                if(valid){
            System.out.print("Enter a positive integer: ");
          while(z < a){
                    if(myScan.hasNextInt()){ 
                      x = myScan.nextInt();
                    if(x>=0){  
                        one[z]= x;
                         z++;
                         valid = false;
                        }
                        else{
                        System.out.println("Incorrect Input");
                        valid = true;                                    
                                    }
                    }
                    else{
                         f=myScan.next();
                        System.out.println("Incorrect input");
                        valid = true;
                    }
            }
                }
            
                    System.out.println("The array is");
                    int i=0;
                     while(i<a) { 
                    System.out.println(one[i]);
                    i++;
                                }
                                valid2 = true;
            }
  }
}