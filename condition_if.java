import java.util.Scanner;

public class condition_if {
    public static void main(String[] args)
    {
        int pwd= 2374;
        System.out.print("Enter Your Password: ");
        Scanner obj=new Scanner (System.in);
        pwd=obj.nextInt();

    if(pwd==2374)
    {
        System.out.println("My Name is: Amit Rajbhar");
        System.out.println("My age: 20");
        System.out.println("My Address is: Durgapur, WB");
    }
    else
    {
        System.out.println("Wrong Password");
    }
    }
    
}
