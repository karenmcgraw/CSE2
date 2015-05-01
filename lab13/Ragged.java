//Karen McGraw
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class Ragged{
  public static void main(String[] args){
   int [][] array = new int [5][];
  Random r = new Random();
    
   for(int i = 0; i< array.length; i++){
     array[i]= new int [i*3+5];
   }
    for (int j = 0; j <array.length; j++){
      for (int k = 0; k < array[j].length; k++){
        int a = r.nextInt(40);
        array[j][k] =a; 
      }
  }
  
  
  System.out.print("row 1:"); 
  for (int l = 0; l < array[0].length; l++){
  System.out.print(" "+array[0][l]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int m = 0; m < array[1].length; m++){
  System.out.print(" "+array[1][m]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int n = 0; n < array[2].length; n++){
  System.out.print(" "+array[2][n]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < array[3].length; p++){
  System.out.print(" "+array[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < array[4].length; q++){
  System.out.print(" "+array[4][q]);}
  System.out.println();
 
  sort(array);
  }



public static int[][] sort(int [][] array){
  
  for(int i = 0; i < array.length; i++){
    for(int j = 0; j < array[j].length -1 ; j++){
        int min = array[i][j];
        int minIndex = j;    
        
        for(int k = j + 1; k < array[i].length; k++){
            if (min > array[i][k]){
              min = array[i][k];
              minIndex = k;
            }
          }
        if(minIndex != j){
        array[i][minIndex] = array[i][j];
        array[i][j] = min;
      }
    }
  }
  System.out.println();
  System.out.println("The array after sorting ");
  
  System.out.print("row 1:"); 
  for (int l = 0; l < array[0].length; l++){
  System.out.print(" "+array[0][l]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int m = 0; m < array[1].length; m++){
  System.out.print(" "+array[1][m]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int n = 0; n < array[2].length; n++){
  System.out.print(" "+array[2][n]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < array[3].length; p++){
  System.out.print(" "+array[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < array[4].length; q++){
  System.out.print(" "+array[4][q]);}
  System.out.println();
  
  copy(array);
  return array;
}    
public static int [][] copy(int [][] array){

int [][] newArray = new int [5][];  
  for(int i = 0; i<array.length; i++){  
newArray[i]= Arrays.copyOf(array[i], array[4].length); 
} 
  System.out.println();
  System.out.println("The Array copied is: ");  
   System.out.print("row 1:"); 
  for (int l = 0; l < newArray[0].length; l++){
  System.out.print(" "+newArray[0][l]);}
  System.out.println();
  System.out.print("row 2:"); 
  for (int m = 0; m < newArray[1].length; m++){
  System.out.print(" "+newArray[1][m]);}
  System.out.println();
  System.out.print("row 3:"); 
  for (int n = 0; n < newArray[2].length; n++){
  System.out.print(" "+newArray[2][n]);}
  System.out.println();
  System.out.print("row 4:"); 
  for (int p = 0; p < newArray[3].length; p++){
  System.out.print(" "+newArray[3][p]);}
  System.out.println();
  System.out.print("row 5:"); 
  for (int q = 0; q < newArray[4].length; q++){
  System.out.print(" "+newArray[4][q]);}
  System.out.println();
  
  
  return newArray;
}    
    
    

}