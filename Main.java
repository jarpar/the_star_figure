import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mid = n / 2;
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {
            matrix[mid][i] = '*';
            matrix[i][mid] = '*';
        }
        for (int i = 0; i < n; i++) {
            matrix[i][i] = '*';
        }
        int count = n;
        for (int i = 0; i < n; i++) {
            count--;
            matrix[i][count] = '*';
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}