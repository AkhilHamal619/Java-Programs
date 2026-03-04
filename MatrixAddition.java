// WAP to perform Matrix Addition
import java.util.Scanner;

public class MatrixAddition 
{
	    public static void main(String[] args)
	    {
	        int a[][] = new int[3][3];
	        int b[][] = new int[3][3];
	        int sum[][] = new int[3][3];
	        
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter your first matrix:");
	        for(int i = 0; i < 3; i++)
	        {
	            for(int j = 0; j < 3; j++)
	            {
	                a[i][j] = input.nextInt();
	            }
	        }

	        System.out.println("Enter your second matrix:");
	        for(int i = 0; i < 3; i++)
	        {
	            for(int j = 0; j < 3; j++)
	            {
	                b[i][j] = input.nextInt();
	            }
	        }

	        // Matrix Addition
	        for(int i = 0; i < 3; i++)
	        {
	            for(int j = 0; j < 3; j++)
	            {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        System.out.println("The sum of two matrices is:");
	        for(int i = 0; i < 3; i++)
	        {
	            for(int j = 0; j < 3; j++)
	            {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }

	        input.close();
	    }
	}	
