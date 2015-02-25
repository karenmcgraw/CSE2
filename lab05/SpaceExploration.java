//Karen McGraw
//Lab 05
//Space Exploration
/*uses math randon and switches 
to output a timeline of major
space exploration from 2000-2010*/

import java.lang.Math;

public class SpaceExploration{
    public static void main(String[] args){
        int year = 2000 + (int)(Math.random()*11);
        if(year>2000){
        System.out.println("Here is a timeline of space exploration events from "+year+" to 2000.");
        switch(year){
            case 2010:
            System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collides with comet");
            case 2004:
                System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                System.out.println("2002: N/A");
            case 2001:
                System.out.println("2001: First spacecraft lands on an asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
            }
        }
        else{
            System.out.println("Here is a timeline of space exploration for the year 2000: ");
            System.out.println("2000: First spacecraft orbits an asteroid");
        } 
    }
}
