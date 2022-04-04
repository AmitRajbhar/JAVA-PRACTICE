import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Max_Number_Find {
    public static void main(String[] args)
    {
        System.out.print("Enter Your First Number: ");
        Scanner s=new Scanner(System.in);

        int num1=s.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2=s.nextInt();
        System.out.print("Enter Your Third Number: ");
        int num3=s.nextInt();

        if (num1>num2)
        {
            if(num1>num3)
            {
                System.out.print("Maxmium Number: "+num1);
            }
            else 
            {
                System.out.println("Maxmium Number: "+num3);
            }
        }

        else
        {
            if(num2>num3)
            {
                System.out.print("Maxium Number: "+num2);
            }
            else 
            {
                System.out.print("Maxium Number: "+num3);
            }
        }
        
    }
    
}
