import java.util.Scanner;
public class Rotate_it_90_degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
