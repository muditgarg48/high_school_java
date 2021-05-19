/*
    This program executes the concept of a Timer using
    the logic that if a computer's processing speed is 
    2.4GHz, this means that it would take 1s for the 
    computer to complete a for loop from 
    1 to 2.4 * (10 raised to the power 9). So this program
    will execute x number of such for loops to complete x sec
*/
import java.util.*;
public class loading
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);

        /*this variable is used to store the processing speed of the computer
            which is executing this program in hertz.*/
        long processor_speed = 240000000;
        processor_speed *= 10; 
        
        System.out.print("\nEnter seconds of loading : ");
        int sec=sc.nextInt();
        System.out.println();
        for(int i=0;i<sec;i++)
        {
            System.out.print("[*] ");
            for(long a=processor_speed;a>=0;a--);
        }
        System.out.println("\n\nLoading Complete !");
        sc.close();
    }
}