import java.util.*;

public class stone_paper_scissor {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("   _______             ___________                             ");
        System.out.println("  /       \\           |           |             \\\\  //      ");
        System.out.println(" /         \\          |           |              \\\\//       ");
        System.out.println("| S T O N E |---------| P A P E R |---------  S C I SS O R     ");
        System.out.println(" \\         /          |           |              //\\\\       ");
        System.out.println("  \\_______/           |___________|             //  \\\\      ");
        System.out.println("=============================================================================");
        System.out.println("Welcome to the game of Stone-Paper-Scissor !");
        System.out.println("=============================================================================");
        System.out.print("Enter your name,Player : ");
        String nm=sc.next();
        System.out.println("Hey "+nm+" ! I am Asterix, your opponent CPU !");
        System.out.println("=============================================================================");
        System.out.println("Enter the number of matches that decides the winner : ");
        int numOfMatches = sc.nextInt();
        System.out.println("=============================================================================");
        System.out.println("Let me make you familiar with the rules-------");
        System.out.println("1.Players choose their option from Stone,Paper and Scissor. ");
        System.out.println("2.The Winning Strategy is that Stone breaks Scissor but gets wrapped in Paper ");
        System.out.println("  and Scissor cuts Paper.");
        System.out.println("3.The Player who has more victories in "+numOfMatches+" turns wins the Match.");
        System.out.println("4.You have to choose from the following and enter the Code Number :-");
        System.out.println("      1.STONE");
        System.out.println("      2.PAPER");
        System.out.println("      3.SCISSOR");
        System.out.println("SO LET THE MATCH BEGIN=======================================================");
        int score1=0;int score2=0;int input1;int input2;
        int round=0;
        System.out.println("\t\t\t\tAsterix\t\t"+nm);
        while(round!=numOfMatches)
        {
            System.out.print(nm+" : ");
            input1=sc.nextInt();
            input2=(int)(Math.random()*2)+1;
            System.out.println("Asterix : "+input2);
            if(((input1==1)&&(input2==3))||(input1==2)&&(input2==1)||(input1==3)&&(input2==2))
                score1++;
            else if(((input2==1)&&(input1==3))||(input2==2)&&(input1==1)||(input2==3)&&(input1==2))
                score2++;
            else if((input1<1)&&(input1>3))
                System.out.println("Wrong Choice Entered");
            System.out.println("\t\t\t\t"+score2+"\t\t"+score1);
            round++;
        }
        System.out.println();
        if(score1 > score2)
            System.out.println(nm+" Wins ! Congratulations "+nm+" !");
        else if(score1 < score2)
            System.out.println("Asterix Wins ! Better Luck Next Time "+nm+" !");
        else
            System.out.println("Congratulations ! You tied with the CPU Asterix.");
        sc.close();
    }
}
