import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 int a = (i < j) ? i : j;           
                int b = (n - 1 - i < n - 1 - j) ? (n - 1 - i) : (n - 1 - j);
                int layer = (a < b) ? a : b;        

                System.out.print((layer % 2 == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}