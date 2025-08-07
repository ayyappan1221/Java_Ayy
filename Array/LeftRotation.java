import java.util.Scanner;
public class LeftRotation {
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
            int f=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=f;
            for(int k=0;k<n;k++){System.out.print(a[k]+" ");}
        System.out.println();
        }
        
    }
}
