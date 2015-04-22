import java.util.Scanner;
import java.util.Random;

class Multiply {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    boolean valid = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean o = false;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    while(!o){
        while(!valid){
            System.out.println("Enter the width of the first matrix: ");
            if(myScanner.hasNextInt()){
                e = myScanner.nextInt();
                if(e >0){
                    a = e;
                    valid = true;
                }
                else{
                    System.out.println("Answer was not a positive integer");
                }
            }
            else{
                String string = myScanner.next();
                System.out.println("Enter integers");
            }
        }
    while(!m){
            System.out.println("Enter the height of the first matrix: ");
            if(myScanner.hasNextInt()){
                e = myScanner.nextInt();
                if(e >0){
                    b = e;
                    m = true;
                }
                else{
                    System.out.println("Answer was not a positive integer");
                }
            }
            else{
                String string = myScanner.next();
                System.out.println("Enter integers");
            }
        }   
    while(!n){
            System.out.println("Enter the width of the second matrix: ");
            if(myScanner.hasNextInt()){
                e = myScanner.nextInt();
                if(e >0){
                    c = e;
                    n = true;
                }
                else{
                    System.out.println("Answer was not a positive integer");
                }
            }
            else{
                String string = myScanner.next();
                System.out.println("Enter integers");
            }
    }
    while(!l){
       
            System.out.println("Enter the height of the second matrix: ");
            if(myScanner.hasNextInt()){
                e = myScanner.nextInt();
                if(e >0){
                    d = e;
                    l = true;
                }
                else{
                    System.out.println("Answer was not a positive integer");
                }
            }
            else{
                String string = myScanner.next();
                System.out.println("Enter integers");
            }
        }
    if(b == c){
        o = true;
    }
    else{
        System.out.println("Uncompatible MAtricies");
        m = false;
        l = false;
    }
    } 
    randomMatrix(a,b,c,d);
  }
  public static int[][] randomMatrix(int width, int height, int width1, int height1){
      Random x = new Random();
      int [][] array = new int [width][];
      int y = 0;
      for (int i = 0; i <width; i++){
          array[i] = new int [height];
          for(y=0; y<height; y++){
              int z = x.nextInt(2);
              if(z==1){
                  int w = x.nextInt(11);
                  array[i][y] = w;
              }
              else{
                  int v = -(x.nextInt(11));
                  array[i][y] = v;
              }
          }
      }
      int[][] matrix = new int [width1][];
      for(int p = 0; p<width1; p++){
          matrix[p] = new int [height1];
          for(y =0; y<height1; y++){
              int z = x.nextInt(2);
              if(z==1){
                  int w = x.nextInt(11);
                  matrix[p][y] = w;
              }
              else{
                  int v = -(x.nextInt(11));
                  matrix[p][y] = v;
              }
          }
      }
      printMatrix(array);
      printMatrix(matrix);
      matrixMultiply(array,matrix);
      return array;
  }
  public static void printMatrix( int [][] array){
      System.out.println("Array is");
      for(int i = 0; i < array.length; i++){
          for(int j =0; j<array[0].length; j++){
              System.out.print(" "+array[i][j]);
          }
          System.out.println();
      }
  }
  public static int [][] matrixMultiply(int[][] array, int [][] matrix){
      int [][] multiply = new int [array.length][matrix[0].length];
      if (array[0].length == matrix.length){
          for(int i = 0; i <array.length; i++){
              for(int j = 0; j < multiply[0].length; j++){
                  for(int k = 0; k < multiply.length; k++){
                      multiply[i][j] += array[i][k] * matrix[k][j];
                  }
              }
          }
          printMatrix(multiply);
          return multiply;
      }
      else{
          return null;
      }
  }
}

        
    
    
    
