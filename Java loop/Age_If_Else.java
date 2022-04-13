import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Age_If_Else {
    public static void main(String[] args)
    {
        System.out.print("Enter Your Age: ");
        Scanner scan=new Scanner(System.in);

        int age=scan.nextInt();

        if(age>=20)
        {
            System.out.println("You are an adult");
        }
        else if(age>=10)
        {
            System.out.println("You are not a kid");
        }
        else 
        {
            System.out.println("You are a kid");
        }
    }
    
}
