/**
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.
*/
import java.util.Scanner;

public class ColumnsSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        int[][] swap = matrix.clone();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int c0 = scanner.nextInt();
        int c1 = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            int temp = matrix[i][c0];
            matrix[i][c0] = matrix[i][c1];
            matrix[i][c1] = temp;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(swap[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
