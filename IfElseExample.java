import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args)
    {
        System.out.print("Enter Your Number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num<100)
        {
            System.out.println("Number is Greater than 100");
        }
        else
        {
            System.out.println("Number is less Than 100");
        }
    }    
}
