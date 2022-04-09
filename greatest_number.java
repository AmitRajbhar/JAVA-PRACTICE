import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your First Number: ");

        int x=s.nextInt();

        System.out.print("Enter Your Second Number: ");
        int y=s.nextInt();

        if(x>y)
        {
            System.out.println("x is the Greatest Number");
        }
        else
        {
            System.out.println("Y is the Greatest number");
        }
    }    
}
