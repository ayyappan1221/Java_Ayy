import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] A = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < r; j++) {
            int max = A[0][j]; 
            for (int i = 1; i < r; i++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
