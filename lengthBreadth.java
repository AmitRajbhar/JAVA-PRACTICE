import java.util.Scanner;

//   Ask user to give two double input for length and breadth of a rectangle and print area type casted to int

public class lengthBreadth {
    public static void main(String[] args){
        double l,b,area;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Length: ");
        l=s.nextDouble();
        System.out.println("Enter The Breadth: ");
        b=s.nextDouble();
        area=l*b;
        System.out.println("The Area Is: "+(int)area);

    
    } 
    
}
