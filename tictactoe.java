import java.util.*;
public class tictactoe 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("             \t                                    \t   _______");
        System.out.println("  \\\\   //  \t                                    \t  /       \\");
        System.out.println("   \\\\ //   \t                                    \t /         \\");
        System.out.println("    |||      \tWelcome to the game of Tic-Tac-Toe !\t|           |");
        System.out.println("   // \\\\   \t                                    \t \\         /");
        System.out.println("  //   \\\\  \t                                    \t  \\_______/");
        System.out.println("=============================================================================");
        System.out.print("Enter your first name,Player 1 : ");
        String nm1=sc.next();
        System.out.println("You have been assigned 'X',"+nm1+".");
        System.out.print("Enter your first name,Player 2 : ");
        String nm2=sc.next();
        System.out.println("You have been assigned 'O',"+nm2);
        char board[][]=new char [3][3];
        System.out.println("=============================================================================");
        
        //assigning black spaces to all board
        for(int i1=0;i1<3;i1++)
            for(int i2=0;i2<3;i2++)
                board[i1][i2]='_';
        
        //==========================================================================================================================
        //printing the blank board
        System.out.println("Your board will be printed after each input .");
        for(int j1=0;j1<3;j1++)
        {
            for(int j2=0;j2<3;j2++)
                System.out.print(board[j1][j2]+"\t");
            System.out.println();
        }
        
        int moves=0;
        int r1,r2,c1,c2;
        System.out.println();
        System.out.print("Enter the row number,"+nm1+" : ");
        r1=sc.nextInt();
        System.out.print("Enter the column number,"+nm1+" : ");
        c1=sc.nextInt();
        board[r1][c1]='X';
        moves++;
        System.out.println("\n");
        for(int j1=0;j1<3;j1++)
        {
            for(int j2=0;j2<3;j2++)
                System.out.print(board[j1][j2]+"\t");
            System.out.println();
        }
        
        while(moves<9)
        {
            if(moves%2==0)
            {
                System.out.print("Enter the row number,"+nm1+" : ");
                r1=sc.nextInt();
                System.out.print("Enter the column number,"+nm1+" : ");
                c1=sc.nextInt();
                if(board[r1][c1]=='_')
                {
                    board[r1][c1]='X';
                    moves++;
                    System.out.println("\n");
                }
                else
                    System.out.println("Sorry ! The space is filled !");    
            }
            else
            {
                System.out.print("Enter the row number,"+nm2+" : ");
                r2=sc.nextInt();
                System.out.print("Enter the column number,"+nm2+" : ");
                c2=sc.nextInt();
                if(board[r2][c2]=='_')
                {
                    board[r2][c2]='O';
                    moves++;
                    System.out.println("\f");
                }
                else
                    System.out.println("Sorry ! The space is filled !");    
            }
            
            for(int j1=0;j1<3;j1++)
            {
                for(int j2=0;j2<3;j2++)
                    System.out.print(board[j1][j2]+"\t");
                System.out.println();
            }
            for(int i=0;i<3;i++)
            {
                if(((board[i][0]==board[i][1])&&(board[i][1]==board[i][2]))&&((board[i][0]=='X')||(board[i][0]=='O')))
                {
                    if(board[i][0]=='X')
                        System.out.println(nm1+" Wins ! Congratulation "+nm1);
                    else if(board[i][0]=='O')
                        System.out.println(nm2+" Wins ! Congratulation "+nm2);
                    System.exit(0);
                }
                for(int j=0;j<3;j++)
                {
                    if(((board[0][j]==board[1][j])&&(board[1][j]==board[2][j]))&&((board[0][j]=='X')||(board[0][j]=='O')))
                    { 
                        if(board[0][j]=='X')
                            System.out.println(nm1+" Wins ! Congratulation "+nm1);
                        else if(board[0][j]=='O')
                            System.out.println(nm2+" Wins ! Congratulation "+nm2);
                        System.exit(0);
                    }
                    else if((((board[0][0]==board[1][1])&&(board[1][1]==board[2][2]))||(board[0][2]==board[1][1])&&(board[1][1]==board[2][0]))&&((board[1 ][1]=='X')||(board[1][1]=='O')))
                    {
                        if(board[1][1]=='X')
                            System.out.println(nm1+" Wins ! Congratulation "+nm1);
                        else if(board[1][1]=='O')
                            System.out.println(nm2+" Wins ! Congratulation "+nm2);
                        System.exit(0);
                    }
                }
            }
        }
        if(moves==9)
        {
            System.out.println("Tie Game ! Well Played "+nm1+" and "+nm2);
            System.exit(0);
        }
        sc.close();
    }
}