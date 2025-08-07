import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int b[]=Bubble_Sort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("Enter key :");
        int k=sc.nextInt();
        int first=0,last=n-1,idx=0;
        boolean f=false;
        while(first<=last){
            int mid=(first+last)/2;
            if(a[mid]==k){
                f=true;
                idx=mid;
                break;
            }
            else if(k<a[mid]){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }

        System.out.print(f?idx:"Invalid");
    }

    public static int[] Bubble_Sort(int[] a,int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}