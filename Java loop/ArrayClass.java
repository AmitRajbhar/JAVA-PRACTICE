
import java.util.Scanner;


public class ArrayClass {
    public static void main(String[] args)
    {
        int a [] =new int[5];
        System.out.println("Enter Array Number: ");
        Scanner scan=new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            a[i]=scan.nextInt();
        }
        
        System.out.print("Array Elements: ");
        for(int b : a)
        {
            System.out.print(b+" ");
        }
    }

    
}
