import java.util.Scanner;

public class intrestfromUser {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=s.next();

        System.out.println("Enter Roll Number: ");
        int rollnumber=s.nextInt();

        System.out.println("Enter Field of Intrest: ");
        String intrest= s.next();
        //String intrest=s.nextLine();
        
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollnumber+". My field of interest are "+intrest+".");
    }    
}
