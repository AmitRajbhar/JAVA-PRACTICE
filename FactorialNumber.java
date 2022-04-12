// Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args)
    {
        int num,i,fact=1;
        System.out.print("Enetr any Positive Number: ");

        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();

        for(i=1; i<=num; i++)
        {
            fact= fact * i;
        }
        System.out.println("The Factorial Number of " +num + " is: " +fact);
    }
    
}
