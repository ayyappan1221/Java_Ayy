import java.util.Scanner;
public class Unique_ele {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
             boolean f=true;
            for(int j=0;j<n;j++){
                if(j!=i&&a[i]==a[j]){
                    f=false;
                    break;
                }
            }
            if(f){
                System.out.println(a[i]);
            }
        }    

    }
}
