
import java.util.Arrays;
import java.util.Scanner;

public class arrayClass1 {
    public static void main(String[] args)
    {
        int a[] = new int [5];
        System.out.print("Enter Array Elements: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Array Elements: ");
        for(int b :a)
        {
            System.out.print(b+ " ");
        }
    }
    
}
