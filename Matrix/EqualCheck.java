import java.util.Scanner;
public class EqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];     
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();
        System.out.println(areEqual(a, b, n) ? "TRUE" : "FALSE");
    }
    public static boolean areEqual(int[][] a, int[][] b, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] != b[i][j])
                    return false;
        return true;
    }
}