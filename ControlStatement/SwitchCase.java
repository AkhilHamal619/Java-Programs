package ControlStatement;
import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[]args)
    {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks between 0 to 100:");
        marks = input.nextInt();

        if(marks<0 || marks>100)
        {
            System.out.println("Enter a valid number:");
        }
        else 
        {
            switch(marks/10)
            {
                case 10:
                case 9:
                    System.out.println("Grade:A+");
                    break;
                case 8:
                    System.out.println("Grade:A");
                    break;
                case 7:
                    System.out.println("Grade:B+");
                    break;    
                case 6:
                    System.out.println("Grade:B");
                    break;
                case 5:
                    System.out.println("Grade:C+");
                    break;    
                case 4:
                    System.out.println("Grade:C");
                    break;
                default:
                    System.out.println("Grade:F");
                
            }
            input.close();
        }
    }    
}
