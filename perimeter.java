import java.util.Scanner;

//  Take side of a square from user and print area and perimeter of it.

public class perimeter {
    public static void main(String[] args)
    {
        //float side,area;
        int side,area;
        System.out.println("Enter Side of a Square: ");
        Scanner s=new Scanner(System.in);
        //side=s.nextFloat();
        side=s.nextInt();

        area=4*side;
        System.out.println("Area Of Perimeter: "+area);
    }
     
}
