import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int d=a[i],c=0;
            while(d>0){
                d/=10;
                c++;
            }
            d=a[i];
            int sum=0;
            while(d>0){
                int dg=d%10,p=1;
                for(int j=1;j<=c;j++){
                    p*=dg;
                }
                sum+=p;
                d/=10;
            }
            if(sum==a[i]){System.out.print(a[i]+" ");}
        }
    }
}