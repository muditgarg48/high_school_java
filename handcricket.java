import java.util.*;

public class handcricket {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("           _ \t                          \t     ___________  ");
        System.out.println("          // \t                          \t    /   | |     \\");
        System.out.println("        _//_ \t                          \t   /    \\ \\      \\");
        System.out.println("       /   / \t                          \t  /      \\ \\      \\");
        System.out.println("      /   /  \tWelcome to Cricket - Mania\t |        \\ \\      |");
        System.out.println("     /   /   \t                          \t  \\       / /     /");
        System.out.println("    /   /    \t                          \t   \\     / /     / ");
        System.out.println("   /___/     \t                          \t    \\___|_|_____/");
        System.out.println("=============================================================================");
        System.out.println("Rules to play Cricket-Mania successfully :-");
        System.out.println("1.There is No Limit to the number of balls in an inning...Innings get over "); 
        System.out.println("  when a player gets out.");
        System.out.println("2.The score of a player is the sum of all the numbers entered by him till "); 
        System.out.println("  he is out.");
        System.out.println("3.When a player gets out in the first innings,he interchanges his position ");
        System.out.println("  with other player.");
        System.out.println("4.The Match will be Human Player vs Computer.");
        int bowl=0;int run=1;int score1=0;int score2=0;int Toss;
        System.out.println("=============================================================================");
        System.out.print("Welcome player...Enter your name : ");
        String nm=sc.next();
        System.out.println("Hey "+nm+" ! I am Magnatron, your opponent CPU !");
        System.out.println("=============================================================================");
        System.out.println("Lets have a toss,Choose from the following and enter its code :");
        System.out.println("1.Heads\n2.Tails\nYour Choice : ");
        int ch1=sc.nextInt();
        Toss=(int)(Math.random()*1)+1;
        if(Toss==ch1)
        {
            System.out.println("You won the toss !....Choose : ");
            System.out.println("1.Bating\n2.Bowling\nYour Choice : ");
            int ch2=sc.nextInt();
            System.out.println("=============================================================================");
            System.out.println("==================================First-Innings==============================");
            switch(ch2)
            {
                case 1://Bating
                    System.out.println("Bating:-------------------------");
                    while(run!=bowl)
                    {
                        System.out.print("Enter your run (1-6) : ");
                        run=sc.nextInt();
                        bowl=(int)(Math.random()*6)+1;
                        System.out.println("Magnatron bowled "+bowl+" while u batted "+run);
                        if(bowl==run)
                        {
                            System.out.println("Your Out ! Your score = "+score1);
                            System.out.println("Your chance to bowl !");
                        }
                        else
                        {
                            if((run<7)&&(run>0))
                                score1+=run;
                            else
                                System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                        }
                    }
                    run=1;bowl=0;
                    System.out.println("==================================Second-Innings==============================");
                    System.out.println("Bowling:-------------------------");           
                    while(run!=bowl)
                    {
                        System.out.print("Enter your bowl (1-6) : ");
                        bowl=sc.nextInt();
                        run=(int)(Math.random()*6)+1;
                        System.out.println("Magnatron batted "+run+" while u bowled "+bowl);
                        if(bowl==run)
                            System.out.println("Magnatron is Out ! His score = "+score2);
                        else
                        {
                            if((bowl<7)&&(bowl>0))
                                score2+=run;
                            else 
                                System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                        }
                    }
                    //Now
                    if(score1>score2)
                        System.out.println(nm+" Wins ! Congratulation "+nm);
                    else if(score2>score1)
                        System.out.println("Magnatron Wins ! Better Luck next time "+nm);
                    else
                        System.out.println("Its a Tie ! Well Played "+nm);
                    break;
                case 2://bowling
                    System.out.println("Bowling:-------------------------");
                    while(run!=bowl)
                    {
                        System.out.print("Enter your bowl (1-6) : ");
                        bowl=sc.nextInt();
                        run=(int)(Math.random()*6)+1;
                        System.out.println("Magnatron batted "+run+" while u bowled "+bowl);
                        if(bowl==run)
                        {
                            System.out.println("Magnatron is Out ! His score = "+score2);
                            System.out.println("Your chance to bat !");
                        }
                        else
                        {
                            if((bowl<7)&&(bowl>0))
                                score2+=run;
                            else 
                                System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                        }
                    }
                    run=1;bowl=0;
                    System.out.println("==================================Second-Innings==============================");
                    System.out.println("Bating:-------------------------");
                    while(run!=bowl)
                    {
                        System.out.print("Enter your run (1-6) : ");
                        run=sc.nextInt();
                        bowl=(int)(Math.random()*6)+1;
                        System.out.println("Magnatron bowled "+bowl+" while u batted "+run);
                        if(bowl==run)
                            System.out.println("Your Out ! Your score = "+score1);
                        else
                        {
                            if((run<7)&&(run>0))
                                score1+=run;
                            else
                                System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                        }
                    }
                    //Now
                    if(score1>score2)
                        System.out.println(nm+" Wins ! Congratulation "+nm);
                    else if(score2>score1)
                        System.out.println("Magnatron Wins ! Better Luck next time "+nm);
                    else
                        System.out.println("Its a Tie ! Well Played "+nm);
                    break;
                default:System.out.println("Wrong Choice....There are only 2 sides of a coin !");
            }
        }
        else
        {
            System.out.println("Magnatron won the Toss !...He chose to Bat !");
            while(run!=bowl)
            {
                System.out.print("Enter your bowl (1-6) : ");
                bowl=sc.nextInt();
                run=(int)(Math.random()*6)+1;
                System.out.println("Magnatron batted "+run+" while u bowled "+bowl);
                if(bowl==run)
                {
                    System.out.println("Magnatron is Out ! His score = "+score2);
                    System.out.println("Your chance to bat !");
                }
                else
                {
                    if((bowl<7)&&(bowl>0))
                        score2+=run;
                    else 
                        System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                }
            }
            run=1;bowl=0;
            while(run!=bowl)
            {
                System.out.print("Enter your run (1-6) : ");
                run=sc.nextInt();
                bowl=(int)(Math.random()*6)+1;
                System.out.println("Magnatron bowled "+bowl+" while u batted "+run);
                if(bowl==run)
                    System.out.println("Your Out ! Your score = "+score1);
                else
                {
                    if((run<7)&&(run>0))
                        score1+=run;
                    else
                        System.out.println("Cant enter any number more than 6 and less than 1 !"); 
                }
            }
            //Now
            if(score1>score2)
                System.out.println(nm+" Wins ! Congratulation "+nm);
            else if(score2>score1)
                System.out.println("Magnatron Wins ! Better Luck next time "+nm);
            else
                System.out.println("Its a Tie ! Well Played "+nm);
        }
        sc.close();
    }
}
