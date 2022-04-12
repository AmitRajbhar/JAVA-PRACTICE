import java.util.Scanner;

/* Write a program that prompts the user to input 
a positive integer. It should then print the 
multiplication table of that number. 
*/

public class Table {
    public static void main(String[] args)
    {
        int num,i;
        System.out.print("Enter any Positive Number: ");
        Scanner scan=new Scanner(System.in);
        
        num=scan.nextInt();
        System.out.println("Multiplication: "+num);

        for(i=1; i<=10; i++)
        {
            System.out.println(num+ "x" + i + "=" +(num*i));
        }
    }  
}
