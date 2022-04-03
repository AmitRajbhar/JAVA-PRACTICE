import java.util.Scanner;

public class eligible_to_vote {
    public static void main(String[] args)
    {
        int age;
        System.out.print("Enter Your age: ");
        Scanner s=new Scanner(System.in);
        age=s.nextInt();
        if(age>18)
        {
            System.out.println("Congratulation ! You are Eligible to Give Vote.");
        }
        else
        {
            System.out.println("Sorry! You are Not Eligible to Give Vote");
        }
    }
    
}
