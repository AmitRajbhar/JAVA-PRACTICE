import java.util.Scanner;

public class for_loop_table {
    public static void main (String[] args)
    {
        int num,i;
        System.out.print("Enter any Number: ");
        Scanner scan=new Scanner (System.in);
        num=scan.nextInt();

        for(i=1; i<=10; i++)
        {
            System.out.println(num*i);
        }
    }
    
}
