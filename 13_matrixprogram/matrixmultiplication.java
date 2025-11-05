import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter the elements of the First Matrix (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }

        System.out.println("Enter the elements of the Second Matrix (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = r.nextInt();
            }
        }

        // Matrix Multiplication Logic
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("First Matrix:");
        printMatrix(a);

        System.out.println("Second Matrix:");
        printMatrix(b);

        System.out.println("Product of the two Matrices:");
        printMatrix(c);
    }

    // Helper method to print 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}