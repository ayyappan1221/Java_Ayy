import java.util.Scanner;
public class AbsoluteDiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0; 
        int sum2 = 0; 
        int h = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 += A[i][j];
                }
                if (j == h) {
                    sum2 += A[i][j];
                }
            }
            h--;
        }
        if (sum1 > sum2) {
            System.out.print(sum1 - sum2);
        } else {
            System.out.print(sum2 - sum1);
        }
    }
}
