import java.util.Scanner;

/*   Take 3 inputs from user and check :
          all are equal
         any of two are equal
         ( use && || )          */


public class AllareEqual {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a=s.nextInt();

        System.out.println("Enter the Second Number: ");
        int b=s.nextInt();

        System.out.println("Enter the Third Number: ");
        int c=s.nextInt();

        System.out.println("All are Equal: "+(a==b&&b==c&&c==a));
        System.out.println("Any of Two are Equal: "+(a==b||b==c||c==a));
    }
    
}
