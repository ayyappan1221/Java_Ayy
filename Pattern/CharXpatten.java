import java.util.Scanner;
public class CharXpatten{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i)
                    System.out.print(str.charAt(j)+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}