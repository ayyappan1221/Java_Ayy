import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] A = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
}
