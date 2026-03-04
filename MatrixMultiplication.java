//WAP to perform Matrix Multiplication
import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int mul[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Your first matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Enter your second matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("Your second matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                mul[i][j] = 0;  // Initialize before sum

                for(int k=0; k<3; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The multiplication of two matrices is:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(mul[i][j] + "  ");
            }
            System.out.println();
        }
    }
}