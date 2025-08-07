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
        for (int i = 0; i < r; i++) {
            int max = A[i][0]; 
            for (int j = 1; j < r; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }
}
