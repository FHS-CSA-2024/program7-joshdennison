//import stuff here
import java.util.Scanner;

class scrutebuckthing
{
    public static void main(String[] args)
    {
        Scanner SB = new Scanner(System.in);
        System.out.println("enter schrute-bucks");
        double sb = SB.nextDouble();
        System.out.println("enter Klevins");
        Scanner klevin = new Scanner(System.in);
        Scanner SN = new Scanner(System.in);
        int Klevin = klevin.nextInt();
        System.out.println("enter Stanley nickels");
        int sn = SN.nextInt();
        double newsnval = (double) sn*((10.0/24)/100);
        double newklevinval = (double) Klevin *.05;
        double decimal = sb + newsnval + newklevinval;
        double dsb = (int)( 100 * ( decimal + .005));
        double dsb2 = (double) dsb/100;
        System.out.println("decimal schrute bucks "+ dsb2);        
    }
}
//Your code here

//Paste console output below:
/*

7
enter Klevins
17
enter Stanley nickels
9
decimal schrute bucks 7.89

*/
