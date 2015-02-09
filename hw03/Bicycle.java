//Karen McGraw
//CSE 2
//Homework 3 - Bicycle
//taking user input on time and number of wheel
//rotations to calculate time or ride, distance
//travelled and miles/hour

import java.util.Scanner; //must be imported to gather user input

public class Bicycle{     //main class always necessary
    public static void main(String[] args) {         //main method
        
    Scanner myScanner; //declare instance of scanner constructor
    myScanner=new Scanner(System.in); //scanner constructor
    
    System.out.print(
        "Enter the number of counts on the cyclometer (an integer): ");
    int Counts=myScanner.nextInt(); //takes user input
    System.out.print(
        "Enter the time of the trip (in seconds): ");
    int Seconds=myScanner.nextInt(); //takes user input
    
    //intermediate data    
    double wheelDiameter=27.0; //diameter of front wheel
    double PI=3.14159; //the value of pi
    int feetpermile=5280; //feet per mile
    int inchesperfoot=12;//inches in a foot
    int secondsperminute=60;//seconds in a minute
    double tripDistance, tripTimeMinutes, hours, milesPerHour;
    tripDistance=Counts*wheelDiameter*PI; //inches covered per wheel rotation * #wheel rotations
    tripDistance/=inchesperfoot*feetpermile; //converted to miles
    tripTimeMinutes=Seconds/60; //trip time converted to minutes
    hours=tripTimeMinutes/60; //converted to hours for mph calculation
    milesPerHour=tripDistance/hours; //miles per hour
    
    //Output
    System.out.println("The distance was "+tripDistance+" miles and the trip took "+tripTimeMinutes+" minutes.");
    System.out.println("The average mph was "+milesPerHour+".");
    
        }
    } 
    
