import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Alphabet_Check{
    public static void main(String[] args)
    {
        char ch;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter any character: ");
        ch=s.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            System.out.println("Uppercase");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercase");
        }
        else 
        {
            System.out.println("It is Not a Alphabets" );
        }

    }

}