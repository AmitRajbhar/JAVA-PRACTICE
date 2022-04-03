import java.util.Scanner;

//  W.A.P to add two numbers?

public class addtonumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any two number: ");
        Scanner s=new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.println("Sum of two Number: "+c);
    }
}
