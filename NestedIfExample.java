import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args)
    {
        System.out.print("Enter Your Number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num<100)
        {
            System.out.println("Number is less than 100");
        }
        if(num>50)
        {
            System.out.println("Number is Greater than 50");
        }
    }    
}
