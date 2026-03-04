//sum of diagonal of two Matrix.
import java.util.Scanner;

public class SumofDiagonal 
{
	    public static void main(String[] args)
	    {
	        int a[][] = new int[3][3];
	        int b[][] = new int[3][3];

	        Scanner input = new Scanner(System.in);

	        // Input first matrix
	        System.out.println("Enter your first matrix:");
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                a[i][j] = input.nextInt();
	            }
	        }

	        // Print first matrix
	        System.out.println("Your first matrix:");
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                System.out.print(a[i][j] + "  ");
	            }
	            System.out.println();
	        }

	        // Input second matrix
	        System.out.println("Enter your Second matrix:");
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                b[i][j] = input.nextInt();
	            }
	        }

	        // Print second matrix
	        System.out.println("Your Second matrix:");
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                System.out.print(b[i][j] + "  ");
	            }
	            System.out.println();
	        }

	        // Sum of diagonals
	        int diagonalA = 0;
	        int diagonalB = 0;

	        for(int i=0; i<3; i++) {
	            diagonalA += a[i][i];
	            diagonalB += b[i][i];
	        }

	        System.out.println("Diagonal sum of Matrix A = " + diagonalA);
	        System.out.println("Diagonal sum of Matrix B = " + diagonalB);
	        System.out.println("Total diagonal sum of both matrices = " + (diagonalA + diagonalB));
	    }
	}

