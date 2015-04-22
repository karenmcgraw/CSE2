//Karen McGraw
//CSE 2 Lab 04
//Cookies
//This program is collecting user input on cookies:
//numbers made, numbers purchased, and number of people
//getting cookies

import java.util.Scanner;

public class Cookies2{
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        int people;
        int cookies;
        int cookiesperperson;
        int cookiesneeded;
        int howmanymore;
        int divideevenly;
        
        System.out.println("Enter the number of people: ");
            if(myScanner.hasNextInt()){
                people = myScanner.nextInt();
                if(people >= 1){
                    System.out.println("Enter the number of cookies you want to buy");
                    if(myScanner.hasNextInt()){
                        cookies = myScanner.nextInt();
                        if(cookies >= 1){
                            System.out.println("How many cookies do want each person to get?");
                            if(myScanner.hasNextInt()){
                                cookiesperperson = myScanner.nextInt();
                                cookiesneeded= cookiesperperson * people;
                                if(cookies>=cookiesneeded){
                                    divideevenly = cookies%people;
                                    if(divideevenly==0){
                                        System.out.println("You have enough and they will divide evenly.");
                                    }
                                        else{
                                        System.out.println("You have enough cookies for each person but they will not divide evenly.");
                                    }
                                    
                                    
                                else{
                                    howmanymore = cookiesneeded - cookies;
                                    System.out.println("You will not have enough cookies. You need to buy at least"+ howmanymore+ "cookies.");
                                }
                            }
                            else{
                                System.out.println("You did not enter an integer");
                                return;
                            }
                        }
                        else{
                            System.out.println("You did not enter an integer greater than or equal to 1");
                            return;
                        }
                    }
                    else{
                        System.out.println("You did not enter an integer");
                        return;
                    }
                }
                else{
                    System.out.println("You did not enter an integer greater than or equal to 1");
                    return;
                }
            }
            else{
                System.out.println("You did not enter an integer");
                return;
            }
            }   
}
}