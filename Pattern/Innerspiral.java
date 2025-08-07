import java.util.Scanner;
public class InnerSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
    int top = 0, b = n - 1;
    int f = 0, r = n - 1;
        while (top <= b && f <= r) {
            for (int i = f; i <= r; i++)
                System.out.print(a[top][i] + " ");
            top++;
            for (int i = top; i <= b; i++)
                System.out.print(a[i][r] + " ");
            r--;
            if (top <= b) {
                for (int i = r; i >= f; i--)
                    System.out.print(a[b][i] + " ");
                b--;
            }
            if (f <= r) {
                for (int i = b; i >= top; i--)
                    System.out.print(a[i][f] + " ");
                f++;
            }
        }
    }
}