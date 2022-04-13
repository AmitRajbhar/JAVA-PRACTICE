import java.util.Scanner;

// print sunday to saturday on number 1 to 7 typed by the user?
public class Switch_statement_weeks {
    public static void main(String[] args)
    {
        System.out.print("Enter your number between 1 to 7 : ");
        Scanner scan=new Scanner(System.in);
         int num=scan.nextInt();
         switch(num)
         {
             case 1:
             System.out.println("Sunday");
             break;
             case 2:
             System.out.println("Monday");
             break;
             case 3:
             System.out.println("Tuesday");
             break;
             case 4:
             System.out.println("Wednesday");
             break;
             case 5:
             System.out.println("Thursday");
             break;
             case 6:
             System.out.println("Friday");
             break;
             case 7:
             System.out.println("Saturday");
             break;
             default:
             System.out.println("wrong entered!!  ..Plzz Enter correct number");
         }

    }
    
}
