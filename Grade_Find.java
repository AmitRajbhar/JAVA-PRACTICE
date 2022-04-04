import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/* A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/


public class Grade_Find {
    public static void main(String[] args)
    {
        System.out.print("Enter your grade: ");
        Scanner s=new Scanner(System.in);
        
        int x=s.nextInt();

        if(x<25)
        {
            System.out.println("Your Grade is F ");
        }
        else if((x>=25) && (x<45))
        {
            System.out.println("Your Grade is E");
        }
        else if((x>=45) && (x<50))
        {
            System.out.println("Your Grade is D");
        }
        else if((x>=50) && (x<60))
        {
            System.out.println("Your Grade is C");
        }
        else if ((x>=60) && (x<80))
        {
            System.out.println("Your Grade is B");
        }
        else if((x>=80) && (x<100)) 
        {
            System.out.println("Your Grade is A");
        }
        else 
        {
            System.out.println("Not Correct Marks");
        }

    }
    
}
