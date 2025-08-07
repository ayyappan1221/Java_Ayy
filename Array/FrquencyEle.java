import java.util.Scanner;
public class FrquencyEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        boolean[]b=new boolean[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            if(b[i]){continue;}
            int c=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                c+=1;
                b[j]=true;
                }
            }    
            System.out.print(a[i]+"-"+c+"  ");
        }


    }
}