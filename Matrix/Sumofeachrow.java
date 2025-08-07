import java.util.Scanner;
public class Sumofeachrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] A = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i= 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += A[i][j];
            }
            System.out.println(sum);
        }
    }
}
