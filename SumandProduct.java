import java.util.Scanner;

// Write a program to take two integer inputs from user and print sum and product of them.


public class SumandProduct {
    public static void main (String[] args)
    {
        int a,b,c,d;
        System.out.println("Enter any Two Number: ");
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.println("The Sum of Two Number is: "+c);

        d=a*b;
        System.out.println("The Product of Two number is: "+(a*b));

        
    }

    
}
