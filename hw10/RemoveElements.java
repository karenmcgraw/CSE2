import java.util.Scanner;
import java.lang.Math;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  public static int[] delete(int [] list, int pos){
      int []z = new int [list.length-1];
      int y,x;
      y = pos;
      int w;
      for(w=x=0; w< list.length; w++){
          if(!(w==y)){
              z[x]=list[w];
              x++;
          }
      }
      return(z);
  }
  public static int[] randomInput(){
      int a = (int)(Math.random()*10);
      int []b = new int[10];
      int c = 0;
      for (int d = 0; d<10;d++){
          c = a;
          b[d]=c;
      }
      return(b);
  }
  public static int[] remove(int [] list, int target){
   int m, n;
   int p = 0;
   int q = target;
   for(m = 0; m <10; m++){
       if(list[m]==q){
           p++;
       }
   }
   int h[] = new int[list.length - p];
   for(m=n=0; m< list.length; m++){
       if(!(list[m]==q)){
           h[n]=list[m];
           n++;
       }
   }
   return(h);
  }
  
}
