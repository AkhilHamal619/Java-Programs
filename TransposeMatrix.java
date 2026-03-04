//Transpose Matrix
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int t[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println(a[i][j] + "  ");
            }
            System.out.println();
        }

        // Transpose logic
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                t[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println(t[i][j] + "  ");
            }
            System.out.println();
        }
    }
}