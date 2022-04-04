import java.util.Scanner;


public class If_Else_If_Example {
    public static void main(String[] args)
    {
        System.out.print("Enter your number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        if(num<100 && num>1)
        {
            System.out.println("Its a two Digit Number");
        }
        else if(num<1000 && num>=100)
        {
            System.out.println("Its a Three Digit Number");
        }
        else if(num>=1000 && num<10000)
        {
            System.out.println("Its a Four Digit Number");
        }
        else
        {
            System.out.println("Number is Not Between 1 & 99999");
        }
    }
    
}

