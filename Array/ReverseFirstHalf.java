import java.util.Scanner;
public class ReverseFirstHalf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int mid=n/2;
        if(n%2==0){
            for(int i=0;i<mid/2;i++){
                int t= a[i];
                a[i]=a[mid-i-1];
                a[mid-i-1]=t;
            }
        }
        else{
            for(int i=0;i<=mid/2;i++){
                int t=a[i];
                a[i]=a[mid-i];
                a[mid-i]=t;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}