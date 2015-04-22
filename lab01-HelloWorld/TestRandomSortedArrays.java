public class TestRandomSortedArrays{
  public static void main(String[] args){
    
    //this program contains a method that generates a sorted random array of integers where each element
    //is 0-9 larger than the preceding one.
    
    int[] firstArray = new int[100]; //the array is of length 100
    firstArray[0] = (int)(Math.random()*10);
    System.out.print(firstArray[0]+" ");
    
    for(int i=1; i<firstArray.length; i++){
      firstArray[i]=(int)(((Math.random()*10)+firstArray[i-1]));
    
    System.out.print(firstArray[i] + " "); //the contents of the array are printed using the for loop.
    }
  }
  
}