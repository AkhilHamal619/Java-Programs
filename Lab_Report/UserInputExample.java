package Lab_Report;
import java.util.Scanner;

public class UserInputExample
{
    public static void main(String[] kgf)
    {
        Scanner input =new Scanner(System.in);
        System.err.println("Enter your ID:");
        int id=input.nextInt();
        input.nextLine();
        System.err.println("Enter your Name:");
        String name=input.nextLine();
        System.out.println("\nUser Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        input.close();
    }
    

}