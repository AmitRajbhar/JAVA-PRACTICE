import java.util.Scanner;

/*    Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.   */



public class intrestfromUser {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=s.next();

        System.out.println("Enter Roll Number: ");
        int rollnumber=s.nextInt();

        System.out.println("Enter Field of Intrest: ");
        String field=s.nextLine();
        
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollnumber+". My field of interest are "+field+".");
    }    
}
