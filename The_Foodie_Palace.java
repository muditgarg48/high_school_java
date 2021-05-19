//  This was my 10th Standard Project
//  Please dont judge 😅
//  There are a lot of things to criticise in this program
import java.util.*;
public class The_Foodie_Palace
{
 Scanner sc=new Scanner (System.in);
 //The Variable 'name' stores the name of the customer
 String name="";
 //The Variable 'festival' stores the name of the festival if the date matches and allows a discount of 10%
 String festival="";
 int mon=0;int dt=0;int yr=0;int t=0;
 public void Menu()
 {
  try
  {
   //Storing the Menu Card in Arrrays of respective categories// 
   String PP[]={"1.Mexican Burger       (Extra Cheeze with spicy mexican twist)    Rs.85 ",
                "2.Burger Pizza         (Burger  with pizza feeling)               Rs.135",
                "3.Duo Sandwich         (Double Sandwich  with extra vegies)       Rs.90 ",
                "4.Saucy Pasta          (with extra sauce and toppings)            Rs.150",
                "5.Choco Coffee         (an extra chocolate in coffee)             Rs.70 "};
   String Bu[]={"6.Mexican Burger       (Extra Cheeze with spicy mexican twist)    Rs.85 ",
                "7.Aloo Tikki Burger    (single aloo tikki burger)                 Rs.40 ",
                "8.Chicken Burger       (normal chicken burger)                    Rs.60 ",
                "9.Special Burger       (special paneer burger)                    Rs.55 ",
                "10.Yummy Burger        (extra cheesy veg burger)                  Rs.65 "};
   String Pi[]={"11.Burger Pizza        (Burger with pizza feeling)                Rs.135",
                "12.Normal Veg Pizza    (Layers of Vegetable)                      Rs.160",
                "13.Double Cheese Pizza (with double cheese layers)                Rs.200",
                "14.Chicken Pizza       (a spicy chicken pizza)                    Rs.180",
                "15.Italiano Pizza      (a cheesy italian pizza)                   Rs.195"};
   String Pa[]={"16.Saucy Pasta         (with extra sauce and toppings)            Rs.150",
                "17.Macro Pasta         (pasta with macroni)                       Rs.100",
                "18.Italiano Pasta      (pasta with italian twist)                 Rs.110",
                "19.Cheesy Pasta        (extra cheese pasta)                       Rs.105",
                "20.Maggi Pasta         (pasta with maggi)                         Rs.95 "};
   String Sa[]={"21.Duo   Sandwich      (double sandwich veg layers)               Rs.90 ",
                "22.Club Sandwich       (normal club sandwich)                     Rs.70 ",
                "23.Grilled Sandwich    (normal grilled sandwich)                  Rs.80 ",
                "24.Special Sandwich    (extra vegies sandwich)                    Rs.85 ",
                "25.Cheese Sandwich     (extra cheese sandwich)                    Rs.95 "};
   String Be[]={"26.Choco Coffee        (an extra chocolate in coffee)             Rs.70 ",
                "27.Normal Coffee       (normal beans coffee)                      Rs.40 ",
                "28.Normal Tea          (regular indian tea)                       Rs.20 ",
                "29.Spicy Tea           (spicy masala tea)                         Rs.45 ",
                "30.Black coffee        (coffe without milk)                       Rs.35 "};
   //displaying the Menu Card//
   System.out.println(" ________________________________________________________________________");
   System.out.println("|          __        __    ________   ___     __  __        __           |");
   System.out.println("|         || \\     /  ||  |          ||  \\    ||  ||        ||           |");
   System.out.println("|         ||  \\   /   ||  |          ||   \\   ||  ||        ||           |");
   System.out.println("|         ||   \\_/    ||  |======    ||    \\  ||  ||        ||           |");
   System.out.println("|         ||          ||  |          ||     \\ ||  ||        ||           |");
   System.out.println("|         ||          ||  |________  ||      \\||  ||________||           |");
   System.out.println("|------------------------------------------------------------------------|");
   System.out.println("|                        Popular Products                                |");
   for (int i=0;i<5;i++)
   {
    System.out.println("|"+PP[i]+"|");
   }
   System.out.println("|\t                        Burger                                   |");
   for (int i=0;i<5;i++)
   {
    System.out.println("|"+Bu[i]+"|");
   }
   System.out.println("|\t                        Pizza                                    |");
   for (int i=0;i<5;i++)
   {
    System.out.println("|"+Pi[i]+"|");
   }
   System.out.println("|\t                        Pasta                                    |");
   for (int i=0;i<5;i++)
   {
    System.out.println("|"+Pa[i]+"|");
   }
   System.out.println("|\t                        Sandwich                                 |");
   for (int i=0;i<5;i++)
   { 
    System.out.println("|"+Sa[i]+"|");
   }
   System.out.println("|\t                        Beverages                                |");
   for (int i=0;i<5;i++)
   {
    System.out.println("|"+Be[i]+"|");
   }
   System.out.println("|--------Please remember the serial number of the foods you want---------|");
  }
  catch (Exception a)
  {
   System.out.println("Error Encountered !" +a);
  } 
 }
 public void Bill()
 {
 try
 {
  t=0;
  //The Variable 'b' stores the total Bill including the Tax and Discounts
  //The Variable 'q' stores the quantity of the selected item
  int n=1;double b=0.0;int q;
  //declaring variables of all products with their rates//
  int one=85;int two=135;int three=90;int four=150;int five=70;int six=85;
  int seven=40;int eight=60;int nine=55;int ten=65;int eleven=135;int twelve=160;
  int thirteen=200;int fourteen=180;int fifteen=195;int sixteen=150;int seventeen=100;int eighteen=110;
  int nineteen=105;int twenty=95;int twentyone=90;int twentytwo=70;int twentythree=80;int twentyfour=85;
  int twentyfive=95;int twentysix=70;int twentyseven=40;int twentyeight=20;int twentynine=45;int thirty=35;
  //declaring all the variables that might store the quantity of that paricular product//
  int q1=0;int q2=0;int q3=0;int q4=0;int q5=0;int q6=0;int q7=0;int q8=0;int q9=0;int q10=0;
  int q11=0;int q12=0;int q13=0;int q14=0;int q15=0;int q16=0;int q17=0;int q18=0;int q19=0;int q20=0;
  int q21=0;int q22=0;int q23=0;int q24=0;int q25=0;int q26=0;int q27=0;int q28=0;int q29=0;int q30=0;
  while(n==1)
  {
   //this loop will continue till the User wants to Enter the serial number of the product
   //If the User wants to stop then it will enter the value of n as 0 and loop will end
   while(t==0)
   {
    //this loop will continue till the correct serial number of the product is entered.
    //if the correct serial number is entered ,control will go out of this loop
    System.out.print("Enter the serial number of your item you want to have : ");
    int s=sc.nextInt();
    if((s<1)&&(s>30))
    {
      //if the user enters a Serial number beyond limit,the if clause will not let entire bill program to work
      //Instead it will again take u to the Serial Entry Block present above
      System.out.println("Invalid Entry ! ");
      System.out.print("Re");
    }
    else
    {
     switch(s)
     {
      /*Switch case which checks that which item's Serial Number is entered and asks for its Quantity and 
         the bill is updated after that*/ 
      case 1:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*85);q1+=q;
           break;
      case 2:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*135);q2+=q;
           break;
      case 3:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*90);q3+=q;
           break;
      case 4:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*150);q4+=q;
           break;
      case 5:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt(); 
             b=b+(q*70);q5+=q;
           break;
      case 6:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*85);q6+=q;
           break;
      case 7:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*40);q7+=q;
            break;
      case 8:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*60);q8+=q;
            break;
      case 9:System.out.print("Enter the quantity of your item : ");
             q=sc.nextInt();
             b=b+(q*55);q9+=q;
            break;
      case 10:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*65);q10+=q;
            break;
      case 11:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*135);q11+=q;
            break;
      case 12:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*160);q12+=q;
            break;
      case 13:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*200);q13+=q;
            break;
      case 14:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*180);q14+=q;
            break;
      case 15:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*195);q15+=q;
            break; 
      case 16:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*150);q16+=q;
            break;
      case 17:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*100);q17+=q;
            break;
      case 18:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*110);q18+=q;
            break;
      case 19:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*105);q19+=q;
            break;
      case 20:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*95);q20+=q;
            break;
      case 21:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*90);q21+=q;
            break;
      case 22:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*70);q22+=q;
            break;
      case 23:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*80);q23+=q;
            break;
      case 24:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*85);q24+=q;
            break;
      case 25:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*95);q25+=q;
            break;
      case 26:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*70);q26+=q;
            break;
      case 27:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*40);q27+=q;
            break;
      case 28:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*20);q28+=q;
            break;
      case 29:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*45);q29+=q;
            break;
      case 30:System.out.print("Enter the quantity of your item : ");
              q=sc.nextInt();
              b=b+(q*35);q30+=q;
            break;
      default:System.out.println("Wrong choice entered !");
     }
     System.out.print("Do you want more items ? If Yes ,then Enter 1 else Enter 0 : ");
     int c=sc.nextInt();
     n=c;
     if(n==0)
      t=1;
     System.out.print("\f");
     System.out.println("Please Note ! If you choose the same product again ,its value will be updated !");
     Menu(); //the Menu function is called here to display the Menu Card
     System.out.println();
    }
   }
    System.out.print("\f");//It clears the output screen to display the Bill
    System.out.println("---------------------------------------------------------------------------------");   
    System.out.println("       ______    ======  |          | ");
    System.out.println("      |       )    ||    |          | ");
    System.out.println("      |_______)    ||    |          | ");
    System.out.println("      |       )    ||    |          | ");
    System.out.println("      |______ )  ======  |________  |_______ ");
    System.out.println("---------------------------------------------------------------------------------");
    //the whole below If clause checks for every item
    //If the Item's quantity is more than 0 ,this means that the Item is selected and its displayed in the bill
    //If the item's quantity is 0 then it is not mentioned in the bill
    System.out.println("|    ITEMS               \tRATE       \t\tQUANTITY\tTOTAL\t|");
    if(q1>0)
     System.out.println("|    Mexican Burger     \tRs."+one+"       \t\t"+q1+"\t\tRs."+(one*q1)+"\t|");
    if(q2>0)
     System.out.println("|    Burger Pizza       \tRs."+two+"       \t\t"+q2+"\t\tRs."+(two*q2)+"\t|");
    if(q3>0)
     System.out.println("|    Duo   Sandwich     \tRs."+three+"     \t\t"+q3+"\t\tRs."+(three*q3)+"\t|");
    if(q4>0)
     System.out.println("|    Saucy Pasta        \tRs."+four+"      \t\t"+q4+"\t\tRs."+(four*q4)+"\t|");
    if(q5>0)
     System.out.println("|    Choco Coffee       \tRs."+five+"      \t\t"+q5+"\t\tRs."+(five*q5)+"\t|");
    if(q6>0)
     System.out.println("|    Mexican Burger     \tRs."+six+"       \t\t"+q6+"\t\tRs."+(six*q6)+"\t|");
    if(q7>0)
     System.out.println("|    Aloo Tikki Burger  \tRs."+seven+"     \t\t"+q7+"\t\tRs."+(seven*q7)+"\t|");
    if(q8>0)
     System.out.println("|    Chicken Burger     \tRs."+eight+"     \t\t"+q8+"\t\tRs."+(eight*q8)+"\t|");
    if(q9>0)
     System.out.println("|    Special Burger     \tRs."+nine+"      \t\t"+q9+"\t\tRs."+(nine*q9)+"\t|");
    if(q10>0)
     System.out.println("|    Yummy Burger       \tRs."+ten+"       \t\t"+q10+"\t\tRs."+(ten*q10)+"\t|");
    if(q11>0)
     System.out.println("|    Burger Pizza       \tRs."+eleven+"    \t\t"+q11+"\t\tRs."+(eleven*q11)+"\t|");
    if(q12>0)
     System.out.println("|    Normal veg pizza   \tRs."+twelve+"    \t\t"+q12+"\t\tRs."+(twelve*q12)+"\t|");
    if(q13>0)
     System.out.println("|    Double Cheese Pizza\tRs."+thirteen+"  \t\t"+q13+"\t\tRs."+(thirteen*q13)+"\t|");
    if(q14>0)
     System.out.println("|    Chicken Pizza      \tRs."+fourteen+"  \t\t"+q14+"\t\tRs."+(fourteen*q14)+"\t|");
    if(q15>0)
     System.out.println("|    Italiano Pizza     \tRs."+fifteen+"   \t\t"+q15+"\t\tRs."+(fifteen*q15)+"\t|");
    if(q16>0) 
     System.out.println("|    Saucy Pasta        \tRs."+sixteen+"   \t\t"+q16+"\t\tRs."+(sixteen*q16)+"\t|");
    if(q17>0)
     System.out.println("|    Macro Pasta        \tRs."+seventeen+"\t\t\t"+q17+"\t\tRs."+(seventeen*q17)+"\t|");
    if(q18>0) 
     System.out.println("|    Italiano Pasta     \tRs."+eighteen+"  \t\t"+q18+"\t\tRs."+(eighteen*q18)+"\t|");
    if(q19>0)
     System.out.println("|    Cheesy Pasta       \tRs."+nineteen+"  \t\t"+q19+"\t\tRs."+(nineteen*q19)+"\t|");
    if(q20>0)
     System.out.println("|    Maggi Pasta        \tRs."+twenty+"    \t\t"+q20+"\t\tRs."+(twenty*q20)+"\t|");
    if(q21>0)
     System.out.println("|    Duo   Sandwich     \tRs."+twentyone+"\t\t\t"+q21+"\t\tRs."+(twentyone*q21)+"\t|");
    if(q22>0)
     System.out.println("|    Club Sandwich      \tRs."+twentytwo+"\t\t\t"+q22+"\t\tRs."+(twentytwo*q22)+"\t|");
    if(q23>0)
     System.out.println("|    Grilled Sandwich   \tRs."+twentythree+"\t\t\t"+q23+"\t\tRs."+(twentythree*q23)+"\t|");
    if(q24>0)
     System.out.println("|    Special Sandwich   \tRs."+twentyfour+"\t\t\t"+q24+"\t\tRs."+(twentyfour*q24)+"\t|");
    if(q25>0)
     System.out.println("|    Cheese Sandwich    \tRs."+twentyfive+"\t\t\t"+q25+"\t\tRs."+(twentyfive*q25)+"\t|");
    if(q26>0)
     System.out.println("|    Choco Coffee       \tRs."+twentysix+" \t\t\t"+q26+"\t\tRs."+(twentysix*q26)+"\t|");
    if(q27>0)
     System.out.println("|    Normal Coffee      \tRs."+twentyseven+"\t\t\t"+q27+"\t\tRs."+(twentyseven*q27)+"\t|");
    if(q28>0)
     System.out.println("|    Normal Tea         \tRs."+twentyeight+"\t\t\t"+q28+"\t\tRs."+(twentyeight*q28)+"\t|");
    if(q29>0)
     System.out.println("|    Spicy Tea          \tRs."+twentynine+"\t\t\t"+q29+"\t\tRs."+(twentynine*q29)+"\t|");
    if(q30>0)
     System.out.println("|    Black Coffee       \tRs."+thirty+"\t\t\t"+q30+"\t\tRs."+(thirty*q30)+"\t|");
    if(b==0.0)
     System.out.println("No product has been brought");
    System.out.println("---------------------------------------------------------------------------------");
    if(festival!="")
    {
     //this If block checks that is the date entered by the user a Festival
     //If yes then If block gets executed else the Else Block is executed
     System.out.println("  "+festival);
     System.out.println("--------------------------------------------------------------------------------");
     System.out.println("  Customer : "+name);
     System.out.println("  Date     :- "+dt+"."+mon+"."+yr);
     System.out.println("--------------------------------------------------------------------------------");
     System.out.println("  Festival discount@10%                            -Rs."+(0.1*b));
     System.out.println("  Service tax@15%                                   Rs."+(0.15*(b-(b*0.1))));
     System.out.println("--------------------------------------------------------------------------------");      
     System.out.println("  Total bill                                        Rs."+((b-(0.1*b)+(0.15*(b-(0.1*b))))));
     System.out.println("--------------------------------------------------------------------------------");
    }
    else
    {
     System.out.println("Festival discount@10%                            -Rs.0");
     System.out.println("Service tax@15%                                   Rs."+(b*0.15));
     System.out.println("--------------------------------------------------------------------------------");      
     System.out.println("Total bill                                        Rs."+(b+(b*0.15)));
     System.out.println("--------------------------------------------------------------------------------");
    }
    t=1;
   }
 }
 catch (Exception a)
 {
  System.out.println("Error Encountered ! "+a);
 } 
 } 
 void checkDate()
 {
  int n=0;t=0;
  while(t==0)
  {
   while(n==0)
   {
    //This loop runs till the correct date is entered.i.e.Not more than 32 and Not less than 1
    //If wrond date if entered the program continues else the Control goes out of the program
    //by dissatisfying the condition
    System.out.print("Date (dd):");
    dt=sc.nextInt();
    if((dt>31)||(dt<1))
    {
     System.out.println("Invalid Date.");
     n=0;
     System.out.print("ReEnter ");
    }
    else
     n=1;
   }
   n=0;
   //As the same variable 'n' is used to check for correct month also...So 'n's value is again updated to 0
   //to fulfill the condition of the next loop and start it
   while(n==0)
   {
    //This loop runs till the correct month is entered.i.e.Not more than 12 and Not less than 1
    //If wrond date if entered the program continues else the Control goes out of the program
    //by dissatisfying the condition
    System.out.print("Date (mm):");
    mon=sc.nextInt();
    String m="";
    festival="";
    switch(mon)
    {
     //In this Switch Block,it is checked that which month it is...If the correct month is verified , then the
     //control is brought out of the loop by updating the value of 'n' as 1
     case 1:m="January";n=1;break;
     case 2:m="February";n=1;break;
     case 3:m="March";n=1;break;
     case 4:m="April";n=1;break;
     case 5:m="May";n=1;break;
     case 6:m="June";n=1;break;
     case 7:m="July";n=1;break;
     case 8:m="August";n=1;break;
     case 9:m="September";n=1;break;
     case 10:m="October";n=1;break;
     case 11:m="November";n=1;break;
     case 12:m="December";n=1;break;
     default:System.out.println("Error ! Wrong month entered.\nReEnter ");
    }
   }
   System.out.print("Date (yyyy):");
   yr=sc.nextInt();
   int nd=0;
   if((mon>12)||(mon<0))
   {
    System.out.println("Invalid date,month and year combination !");
    t=0;
   }
   else
   {
    //This else block is used to check the correct no.of days in the month entered
    //This is done by assigning the total no.of days that each month has
    if ((mon==1)||(mon==3)||(mon==5)||(mon==7)||(mon==8)||(mon==10)||(mon==12))
     nd=31;  
    else if ((mon==4)||(mon==6)||(mon==9)||(mon==11))
     nd=30;
    else if (mon==2)
    {
     if ((yr%400==0)||(yr%4==0))
     //here its checks whether its a Leap Year or not to assign the total no.of Days in case of February
      nd=29;
     else
      nd=28;
    }
   }
   if (dt>nd)
   {
    //here it checks whether the total no.of days in the month entered is more than the date entered or not
    //If It is so then The Date is verified as correct in the else block or else the loop continues till the
    //user doesnt enter the valide date and month and year combination
    System.out.println("Invalid date,month and year");
    t=0;
   }
   else
    t=1;
  }
  //The below whole if-else Clause is to check whether the Date entered by the User is a festival or nor
  //so that a Discount can be given
  if((dt==26)&&(mon==1))
   festival="Happy Republic Day ! We have a special discount of 10% for you !";
  else if((dt==15)&&(mon==8))
   festival="Happy Independence Day ! We have a special discount of 10% for you !";
  else if((dt==2)&&(mon==10))
   festival="Happy Gandhi Jayanti ! We have a special discount of 10% for you !";
  else if((dt==25)&&(mon==12))
   festival="Merry Christmas ! We have a special discount of 10% for you !";
  else if((dt==1)&&(mon==1))
   festival="Happy New Year ! We have a special discount of 10% for you !";
 } 
 public void main(String args[])
 {
  Scanner br=new Scanner(System.in);
  System.out.println("        _________                          ||                   ");
  System.out.println("       ||                                  ||                   ");
  System.out.println("       ||          ______    ______        || ________   _____  ");
  System.out.println("       ||-----    |      |  |      |   ____||    ||     |       ");
  System.out.println("       ||         |      |  |      |  |     |    ||     |---    ");
  System.out.println("       ||         |______|  |______|  |_____| ___||___  |______ ");
  System.out.println("                    ______                                          ");
  System.out.println("                   ||     |          ||                             ");
  System.out.println("                   ||_____|   ____   ||     ____    _____    _____  ");
  System.out.println("                   ||             |  ||         |  |        |       ");
  System.out.println("                   ||        |----|  ||    |----|  |        |--     ");
  System.out.println("                   ||        |____|  ||__  |____|  |_____   |_____  ");
  System.out.println("------------------------------------------------------------------------------------------------");
  System.out.println("\t\tWELCOME TO THE FOODIE PALACE !\t\t");
  System.out.print("Enter your name ,sir : ");
  name=br.nextLine();
  if((dt==0)&&(mon==0)&&(yr==0))
  //This If Clause checks whether the User has already entered the Date or Not
  //If yes then the checkDate() function does not again ask for The Date
  //If no then checkDate() function is executed to ask for the Date
   checkDate();
  System.out.println();
  //The Menu() function is called to display the Menu Card
  Menu();
  System.out.println();
  System.out.println("\t\tEnter your order !");
  //The Bill() function is called to ask for the order and display the Bill
  Bill();
  System.out.println();
  System.out.println("\tThankx for stopping by The Foodie Palace ,"+name+" !"); 
  System.out.println("\t\tHope to see you again enjoying our products !");
  System.out.println("    ________  __     __      __     ____    __  __                                    ");
  System.out.println("       ||     ||     ||     //\\\\    || \\\\   ||  || //                                  ");
  System.out.println("       ||     ||=====||    //==\\\\   ||  \\\\  ||  ||//                                   ");
  System.out.println("       ||     ||     ||   //    \\\\  ||   \\\\ ||  ||\\\\                                 ");
  System.out.println("       ||     ||     ||  //      \\\\ ||    \\\\||  || \\\\                                ");
  System.out.println();
  System.out.println("                                     \\\\    // ________  __       __");
  System.out.println("                                      \\\\  // |        | ||       ||");
  System.out.println("                                       \\\\//  |        | ||       ||");
  System.out.println("                                        //   |        | ||       ||");
  System.out.println("                                       //    |________| ||_______|| ");
  br.close();
 }
}