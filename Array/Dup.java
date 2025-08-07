import java.util.Scanner;
public class Dup {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
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
        int h[]=new int[max-min+1];
        for(int i=0;i<n;i++){
            h[a[i]-min]++;
            
        }
        for(int i=0;i<n;i++){
            if(h[a[i]-min]>1){
                System.out.print(a[i]+" ");
                h[a[i]-min]=0;
            }
        }
        
    }
}
