import java.util.Scanner;
public class Nth_Max {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0],max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(min+"->"+max);
        int h[]=new int[max+1];
        for(int i=0;i<n;i++){
            h[a[i]]++;
        }
        int N=sc.nextInt(),c=0;
        for(int i=max;i>=0;i--){
            if(h[i]!=0){
                c++;
            }
            if(c==N){
                System.out.print(i);
                break;
            }
        }
        sc.close();
    }
}
