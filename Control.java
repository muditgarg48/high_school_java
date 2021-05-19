//The app that can call all other programs

import java.util.*;

public class Control {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Hello, World!");
        System.out.println("This is the collection of programs that I found in my old archives.");
        System.out.println("I programmed them in my high school.");
        System.out.println("Hope you like them !!");
        System.out.println("================================================================================");
        System.out.println("To test one of them, press the specific number for the program to run.");
        System.out.println("Press any other number to exit");
        System.out.println("1. Calender - Program that prints specified month of a specified year.");
        System.out.println("2. HandCricket - A silly game from school life. Try it!");
        System.out.println("3. Loading - A simple program that loads for the specified amount of seconds. Remember to change the value of the processor_speed variable according to your computer's processor speed");
        System.out.println("4. Stone-Paper-Scissor - You remember this game right ?");
        System.out.println("5. Tic Tac Toe - The most famous project for beginners, am I right ?"); 

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1: 
                print_calendar.main(null);
                break;
            case 2: 
                handcricket.main(null);
                break;
            case 3: 
                loading.main(null);
                break;
            case 4:
                stone_paper_scissor.main(null);
                break;
            case 5:
                tictactoe.main(null);
                break;
            default:
                System.exit(0);
        }

        sc.close();
    }
}
