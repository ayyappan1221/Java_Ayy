import java.util.Scanner;
public class Dup_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            boolean isVisited = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    isVisited = true;
                    break;
                }
            }
            if (isVisited) continue;

            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


