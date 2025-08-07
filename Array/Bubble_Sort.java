import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        a=BubbleSort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static int[] BubbleSort(int[]a,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return a;
    }
}
