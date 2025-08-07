import java.util.Scanner;
public class SearchMain {
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
        int k = sc.nextInt(); 
        int f = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (A[i][j] == k) {
                    f = 1;
                }
            }
        }
        if (f == 0)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
}
