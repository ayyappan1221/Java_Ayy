import java.util.Scanner;
public class Linear_Search{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }    
        int k=sc.nextInt(),idx=-1;
        for(int i=0;i<n;i++){
            if(k==a[i]){
                idx=i;
                break;
            }
        }
        sc.close();
        System.out.print(idx==-1?"Invaild":idx);
    }
}