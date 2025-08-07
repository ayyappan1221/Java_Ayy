import java.util.Scanner;

public class MaxMin_Alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input size
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Step 2: Read array + find min and max
        int min, max;
        a[0] = sc.nextInt();
        min = max = a[0];
        
        for(int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < min) {
                min = a[i];
            }
            else if(a[i] > max) {
                max = a[i];
            }
        }

        // Debug print (optional)
        System.out.println(min + "->" + max);

        // Step 3: Create frequency array
        int[] h = new int[max + 1];
        for(int i = 0; i < n; i++) {
            h[a[i]]++;
        }

        // Step 4: Alternate Max-Min print
        int c = 0; // total printed count
        int left = min, right = max;
        
        while(c < n) {
            // Print current max if available
            while(right >= min && h[right] == 0) {
                right--;
            }
            if(right >= min && h[right] > 0) {
                System.out.print(right + " ");
                h[right]--;
                c++;
            }

            // Print current min if available
            while(left <= max && h[left] == 0) {
                left++;
            }
            if(left <= max && h[left] > 0) {
                System.out.print(left + " ");
                h[left]--;
                c++;
            }
        }
        sc.close();
    }
}
