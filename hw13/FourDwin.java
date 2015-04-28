//Karen McGraw
//hw13
//4/28/15

import java.util.Scanner;
import java.util.Random;


public class FourDwin{
  
  public static void main (String [] args){
    boolean valid = false;
    boolean valid2 = false;
    boolean valid3 = false;
    Scanner myScanner = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;
    
  while(!valid3){  
      while(!valid){
        System.out.println("enter an integer ");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        b = a;
                    valid = true;
                    }
                    else{ System.out.println("Enter a positive integer");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("enter an integer");
                
            }
    }
    
    while(!valid2){
        System.out.println("enter an integer greater than the first one");
            if(myScanner.hasNextInt()){
                a = myScanner.nextInt();
                    if (a > 0){
                        c = a;
                    valid2 = true;
                    }
                    else{ System.out.println("enter a positive integer");
                        
                    }     
                    
            }
            else { String l = myScanner.next();
                System.out.println("enter an integer");
                            }
    }
    
    if(b < c){
      valid3 = true;
    }
    
    else {
        System.out.println("the second integer must be bigger than the first");
        
        valid = false;
        valid2 = false;
    }
}
  
   double [][][][] Array;
   Array = new double [3][c][c][(int)random(b,c)];
   
  for(int i = 0; i < Array.length; i++){
        for(int j = 0; j < Array[i].length; j++){
            for(int k = 0; k < Array[i][j].length; k++){
                  for(int l = 0; l < Array[i][j][k].length; l++){
                      Array[i][j][k][l] = (Math.random()*30);                      
                     
                      }  
              } 
        }
      }
    
  int q = 0;
  printArray(Array,q);
  sort4DArray(Array);
  stat(Array);

  }
  
  public static void stat(double [][][][] Array){
      int z = 0;     
      
      for(int i = 0; i < Array.length; i++){
        for(int j = 0; j < Array[i].length; j++){
            for(int k = 0; k < Array[i][j].length; k++){
                  for(int l = 0; l < Array[i][j][k].length; l++){
                      z++;
                  }
            }
            
        }
        
     }
     
     System.out.println("The number of elements is: "+z);
    
     double temporary = 0;
     double sum = 0;
     
     for(int i = 0; i < Array.length; i++){
        for(int j = 0; j < Array[i].length; j++){
            for(int k = 0; k < Array[i][j].length; k++){
                  for(int l = 0; l < Array[i][j][k].length; l++){
                      temporary = Array[i][j][k][l];
                      sum = temporary + sum;
                      
                  }
            }
            
        }
        
     }
     System.out.printf("Sum: %2.1f\n", sum);
     
     System.out.printf("Mean: %2.3f\n", (sum/z));
     }
  
  public static double [][][][] sort4DArray(double [][][][] Array){
    
    for(int i = 0; i < Array.length; i++){
        for(int j = 0; j < Array[i].length; j++){
            for(int k = 1; k < Array[i][j].length; k++){
                  double Element[] = Array[i][j][k];
                  int y;
                  for(y = k-1; y >= 0 && Array[i][j][y].length > Element.length; y-- ){
                    Array[i][j][y+1] = Array[i][j][y];
                  }
                  Array[i][j][y+1] = Element;
                 
            }  
        }
    }

    sort3DArray(Array);
    return Array;
  }
  
  public static double[][][][] sort3DArray(double[][][][] Array){
        for (int i=0; i<Array.length; i++){
            for (int j=0; j<Array[i].length; j++){
                for (int k=0; k<Array[i][j].length; k++){
                    for (int l=0; l<Array[i][j][k].length-1; l++){
                        int min=l;
                            for (int m=l+1; m<Array[i][j][k].length; m++){
                                
                                if (Array[i][j][k][min]>Array[i][j][k][m]){
                                    min=m;
                                }
                            }
                            if (min != l){
                                double temporary=Array[i][j][k][l];
                                Array[i][j][k][l]=Array[i][j][k][min];
                                Array[i][j][k][min]=temporary;
                            
                            }
                    }
                }
            }
        }
        return Array;
    }
  
  public static void printArray(double [][][][] Array, int x){
  if(x == 1){
    System.out.println("Sorted array : ");
  }
  
  for (int i = 0; i < Array.length; i++){
    System.out.print("{");
      for(int j = 0; j < Array[i].length; j++ ){
        System.out.print("{");
          for(int k = 0; k < Array[i][j].length; k++){
            System.out.print("{");
              for(int l = 0;l< Array[i][j][k].length; l++){
                System.out.printf(" %2.1f"+",",Array[i][j][k][l]);
              }
              System.out.print("}");
          }
          System.out.print("}");
      }
    
    System.out.print("}");
  }
 
  System.out.println();
  }

  public static double random(int b, int c){
  double z = 0;
   z = Math.random()*(c-b) + b;
  
  return  z;

}
}