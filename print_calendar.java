/* 
    Program that displays a particular month of 
    a particular year
*/

import java.util.*;
public class print_calendar 
{
    public static void main(String args[])
    {
        int cd=1;
        int vm=0;
        int vy=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int cy = sc.nextInt();
        cy+=5;
        System.out.print("Enter the month number : ");
        int cm = sc.nextInt();
        String months[] = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};       
        switch(cm)
        {
            case 1:vm=0;break;
            case 2:vm=3;break;
            case 3:vm=3;break;
            case 4:vm=6;break;
            case 5:vm=1;break;
            case 6:vm=4;break;
            case 7:vm=6;break;
            case 8:vm=2;break;
            case 9:vm=5;break;
            case 10:vm=0;break;
            case 11:vm=3;break;
            case 12:vm=5;break;
            default:System.out.println("Theres no such month !");System.exit(0);
        }
        int cy1=cy/100;
        int zz=1;
        while(zz!=0)
        {
            if(cy1<17)
                cy1+=4;
            else if(cy1>20)
                cy1-=4;
            else
                zz=0;
        }
        switch(cy1)
        {
            case 17:vy=5;break;
            case 18:vy=3;break;
            case 19:vy=1;break;
            case 20:vy=0;break;
            default:System.out.println("Not advanced to calculate "+cy1);System.exit(0);
        }
        int aaa=cd+vm;
        int bbb;
        if(aaa>6)
        {
            bbb=aaa/7;
            aaa=aaa-(7*bbb);
        }
        int ccc=cy%100;
        bbb=ccc/28;
        ccc=ccc-(bbb*28);
        ccc=ccc+(ccc/4);
        ccc=ccc+vy;
        if((cm==1)||(cm==2)||(cy%4==0)||(cy%400==0))
            ccc--;
        int ddd=aaa+ccc;
        if(ddd>6)
        {
            bbb=ddd/7;
            ddd=ddd-(7*bbb);
        }
        int max = D[cm];
        int A[][] = new int[6][7];
        int x = 1,z=ddd;
        for(int i=0;i<6;i++)
        {
            for(int j=ddd; j<7; j++)
            {
                if(x<=max)
                {
                    A[i][j] = x;
                    x++;
                }
            }
            ddd = 0;
        }
        for(int j=0; j<z; j++) //Adjustment to bring last (6th) row elements to first row
            A[0][j]=A[5][j]; 
        cy-=5;
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t   "+months[cm]+" "+cy); 
        System.out.println("\t----------------------------------------------------"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------"); 
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(A[i][j]!=0)
                    System.out.print("\t "+A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println(""); 
        }
        sc.close();
    }    
}