import java.util.Scanner;

public class squareOrRectangle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length: ");
        int x=s.nextInt();

        System.out.print("Enter Breadth: ");
        int y=s.nextInt();

        if(x==y)
        {
            System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }
    }
    
}
