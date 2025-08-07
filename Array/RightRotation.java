import java.util.Scanner;
public class RightRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        r=r%n;
        sc.close();
        for(int i=0;i<r;i++){
            int l=a[n-1];
            for(int j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=l;
            for(int k=0;k<n;k++){System.out.print(a[k]+" ");}
            System.out.println();
        }
        
    }
}