//Karen McGraw
//HW05
/* convert 3 user inputs between
0-256 to hexadecimal*/
// 2/23/15

import java.util.Scanner;
public class ToHex{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int redInput, greenInput, blueInput;
        String redToHex, greenToHex, blueToHex;
        String finalHex;
        System.out.println("Please enter an integer between 0 and 255 representing a red value : ");
        if(myScanner.hasNextInt()){
            redInput = myScanner.nextInt();
            System.out.println("Please enter an integer between 0 and 255 representing a green value : ");
            
            if(myScanner.hasNextInt()){
                greenInput = myScanner.nextInt();
                System.out.println("Please enter an integer between 0 and 255 representing a blue value : ");
                
                if(myScanner.hasNextInt()){
                    blueInput = myScanner.nextInt();
                   //convert the red number first
                   int redHexRem, redHex1, greenHexRem, greenHex1, blueHexRem, blueHex1;
                   String remCharRed="";
                   String remCharGreen="";
                   String remCharBlue="";
                   String redChar1="";
                   String greenChar1="";
                   String blueChar1="";
                   String redHexFinal, greenHexFinal, blueHexFinal;
                   char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                   //red conversion
                   redHexRem = redInput%16;
                   redHex1= redInput/16;
                   remCharRed=hex[redHexRem]+remCharRed;
                   redChar1=hex[redHex1]+redChar1;
                   redHexFinal = redHex1+remCharRed;
                   //green conversion
                   greenHexRem = greenInput%16;
                   greenHex1= greenInput/16;
                   remCharGreen=hex[greenHexRem]+remCharGreen;        
                   greenChar1=hex[greenHex1]+greenChar1;
                   greenHexFinal = greenHex1+remCharGreen;
                   //blue conversion
                   blueHexRem = blueInput%16;
                   blueHex1= blueInput/16;
                   remCharBlue=hex[blueHexRem]+remCharBlue;
                   blueChar1=hex[blueHex1]+blueChar1;
                   blueHexFinal = blueHex1+remCharBlue;
                   finalHex = redHexFinal + greenHexFinal + blueHexFinal;
                 System.out.println("The decimal numbers R:"+redInput+" G:"+greenInput+" B:"+blueInput+" is represented in hexadecimal as: "+finalHex);   
                
                }
                 else{
            System.out.println("That is an invalid input");
            return;
                }
            }
            else{
            System.out.println("That is an invalid input");
            return;
            }
        }
        else{
            System.out.println("That is an invalid input");
            return;
        }
        
        
        
        

    }
}