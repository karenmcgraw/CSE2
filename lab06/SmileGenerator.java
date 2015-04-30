//Karen McGraw
//CSE002
//Lab 06
/*generate a specific # of :) characters*/
import java.lang.Math;

public class SmileGenerator {
    public static void main (String[] args){
        String smile = ":)";
        int a = 1;
        String space = "";


int x = (int) (Math.random()*99+1); 

for(a=0;a<x;a++){
    space = space + smile;
    System.out.println(space);
}
    }
}