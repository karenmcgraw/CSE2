//Karen McGraw
//Feb 2, 2015
//CSE 2
//Homework 2 "Arithmetic"
//calculating the total cost including tax of a trip to walmart

//main class
public class Arithmetic{
    //main method
    public static void main(String[] args) {
        //input variables 
        //number of pairs of socks
        int nsocks=3;
        //cost per pair of socks
        //('$' is part of the variable name)
        double sockcost$=2.58;
        //number of drinking glasses
        int nglasses=6;
        //cost per glass
        double glasscost$=2.29;
        //number of boxes of envelopes
        int nenvelopes=1;
        //cost per box of envelopes
        double envelopecost$=3.25;
        //tax
        double taxpercent=0.06;
        
        //output variables
        double totalsockcost$;
        double totalglasscost$;
        double totalenvelopecost$;
        double socksalestax$;
        double glasssalestax$;
        double envelopesalestax$;
        double totalcostbeforetax$;
        double totalsalestax$;
        double totalcost$;
        
        //total cost for items
        //total socks cost
        totalsockcost$=nsocks*sockcost$;
        //total glass cost
        totalglasscost$=nglasses*glasscost$;
        //total envelope cost
        totalenvelopecost$=nenvelopes*envelopecost$;
        
        //sales tax
        //sales tax for socks
        socksalestax$=totalsockcost$*taxpercent;
        //sales tax for glasses
        glasssalestax$=totalglasscost$*taxpercent;
        //sales tax for envelopes
        envelopesalestax$=totalenvelopecost$*taxpercent;
        
        //final costs
        //final cost before tax
        totalcostbeforetax$=totalsockcost$+totalglasscost$+totalenvelopecost$;
        //total sales tax
        totalsalestax$=socksalestax$+glasssalestax$+envelopesalestax$;
            //total cost
        totalcost$=totalcostbeforetax$+totalsalestax$;
        
        //print
        System.out.println("You purchased "+nsocks+" pairs of socks at a cost of $"+sockcost$+" per pair of socks.");
        System.out.println("You purchased "+nglasses+" glasses at a cost of $"+glasscost$+" per glass.");
        System.out.println("You purchased "+nenvelopes+" envelopes at a cost of $"+envelopecost$+" per box of envelopes.");
        System.out.println("The socks cost $"+totalsockcost$+" with a sales tax of $"+socksalestax$);
        System.out.println("The glasses cost $"+totalglasscost$+" with a sales tax of $"+glasssalestax$);
        System.out.println("The envelopes cost $"+totalenvelopecost$+" with a sales tax of $"+envelopesalestax$);
        System.out.println("The total cost of your trip is $"+totalcostbeforetax$+" before sales tax.");
        System.out.println("The sales tax is $"+totalsalestax$);
        System.out.println("The final cost of the trip is $"+totalcost$);

        
    }
}