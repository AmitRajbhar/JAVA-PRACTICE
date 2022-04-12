import java.util.Scanner;

public class while_loop {
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter any Number: ");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();

        while(num>=0)
        {
            if(num%2==0)
            {
                System.out.println("Even Number");
                break;
            }
            else
            {
                System.out.println("Odd Number");
                break;
            }
        }
    }
    
}
