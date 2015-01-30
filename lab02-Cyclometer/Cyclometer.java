//Karen McGraw
//Lab 2
// January 30, 2015
// The cyclometer on a bike records the time and the number of rotations of a bike wheel.
// This program will intake cyclometer data and output the distance and time of bike trips.

public class Cyclometer{
    //main method required for every Java program
    public static void main(String[] args) {
        //input data
        int secsTrip1=480; //number of seconds of the first trip
        int secsTrip2=3220; //number of seconds of second trip
        int countsTrip1=1561; //number of wheel rotations for first trip
        int countsTrip2=9037; //number of wheel rotations for second trip
        //intermediate variables and output data, all will be used in equations to get output
        double wheelDiameter=27.0; //diameter of front wheel
        double PI=3.14159; //the value of pi
        int feetpermile=5280; //feet per mile
        int inchesperfoot=12;//inches in a foot
        int secondsperminute=60;//seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //output variables
        
        //output
        System.out.println("Trip 1 took "+ (secsTrip1/secondsperminute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsperminute)+" minutes and had "+countsTrip2+" counts.");
        
        //calculate distance traveled by caluclating circumference of wheel (pi *d)
        //then multiply circumference * # of counts for trip
        //convert inches to miles
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesperfoot*feetpermile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesperfoot/feetpermile;
        
        totalDistance = distanceTrip1 + distanceTrip2;
    
        //print output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");

        
    }//end of main method
}//end of class
