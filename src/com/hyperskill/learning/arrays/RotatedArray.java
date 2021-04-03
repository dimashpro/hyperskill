import java.util.Scanner;
class RotatedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int col = 0; col < m; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println("");
        }
    }
}