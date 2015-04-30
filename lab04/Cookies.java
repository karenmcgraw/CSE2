//Karen McGraw
import java.util.Scanner;
    public class Cookies {
        public static void main (String [] args) {
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            System.out.print ("Enter the number of People: ");
                if (myScanner.hasNextInt()){
                    int numberOfPeople = myScanner.nextInt();
                    if (numberOfPeople>0){
                        System.out.print ("Enter the number of Cookies you are planning to buy: ");
                        if (myScanner.hasNextInt()){
                                int numberOfCookies = myScanner.nextInt();
                                    if(numberOfCookies>0) {
                                         System.out.print ("How many do you want each person to get? ");
                                                int cookiesPerPerson = myScanner.nextInt();
                                                    if(cookiesPerPerson>=0){
                                                        if(numberOfCookies % numberOfPeople == 0){
                                                            System.out.println("You have enough cookies for each person and they will divide evenly");
                                                        }
                                                        else{
                                                            System.out.println("You have enough cookies, but they will not divide evenly");
                                                            return; 
                                                        }
                                                    }
                                                    else{
                                                    System.out.println("enter a positive amount of cookies");
                                                    return;
                                                    }
                                    }
                                    else{
                                        System.out.println("enter a positive amount of cookies");
                                        return;
                                    }
                        }
                        else {
                            System.out.println("enter an int");
                             return; 
                            }
                    }                
                    else{ 
                    System.out.println("You entered a incorrect amount of people");
                    return; 
                    }
                  } 
                else{ 
                    System.out.println("enter an int");
                    return; 
                }
            }
        } 