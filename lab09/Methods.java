//Karen McGraw
import java.util.Random;

class Methods{
  public static void main(String[] args){
    int a = 0;
    Random b = new Random();
    int c = b.nextInt(10); 
    String x = "";  
      
    for(a=0;a<=c;a++){
System.out.print("The "+Adjective(x)+" "+Adjective(x)+ " "+Noun(x)+ " "+Verb(x)+ " "+"the"+ " "+Adjective(x)+ " "+object(x));
System.out.println();
  }  
 }
 
 public static String Verb(String v){

     Random x = new Random();
     int a = x.nextInt(10);
     switch (a){
         case 0:
             v = "walked";
             break;
         case 1:
             v = "ran";
             break;
         case 2:
             v = "jumped";
             break;    
         case 3:
             v = "played";
             break;
         case 4:
             v = "listened";
             break;     
         case 5:
             v = "loved";
            break;    
         case 6:
             v = "rowed";
             break;    
         case 7:
             v = "meant";
             break;    
         case 8:
             v = "slapped";
          break;
         case 9:
             v = "hugged";
            break;    
     }
    return v;         
  
 }//close method
 
  public static String Noun(String n){
       Random x = new Random();
     int a = x.nextInt(10);
      switch (a){
         case 0:
             n = "house";
             break;
         case 1:
             n = "Cleveland";
             return n;
         case 2:
             n = "Lehigh";
             break;     
         case 3:
             n = "Ohio";
             break;
         case 4:
             n = "America";
            break;    
         case 5:
             n = "boat";
            break;      
         case 6:
             n = "boathouse";
            break;     
         case 7:
             n = "rower";
            break;      
         case 8:
             n = "mother";
              break;  
         case 9:
             n = "friend";
            break;    
      }
             return n;
    }
  public static String Adjective(String d){
       Random x = new Random();
     int a = x.nextInt(10);
      switch (a){
           case 0:
             d = "blue";
            break;  
         case 1:
             d = "tall";
             break;  
         case 2:
             d = "smart";
             break;     
         case 3:
             d = "dope";
           break;  
         case 4:
             d = "swaggy";
           break;       
         case 5:
             d = "slow";
          break;     
         case 6:
             d = "mad";
             break;     
         case 7:
             d = "hot";
             break;      
         case 8:
             d = "quiet";
             break;  
         case 9:
             d = "obnoxious";
            break;   
             
      }  
    return d;      
     
     
 }//close method
 
  public static String object(String o){
       Random x = new Random();
     int a = x.nextInt(10);
     
      switch (a){
         case 0:
             o = "dad";
            break;  
         case 1:
             o = "pal";
             break;  
         case 2:
             o = "place";
             break;      
         case 3:
             o = "table";
             break;  
         case 4:
             o = "water bottle";
             break;     
         case 5:
             o = "Inigo";
             break;     
         case 6:
             o = "sandwich";
             break;      
         case 7:
             o = "phone";
             break;       
         case 8:
             o = "street";
              break;  
         case 9:
             o = "people";
            break;  
      }
    return o;         
     
     
 }
    }