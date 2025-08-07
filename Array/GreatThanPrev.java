import java.util.Scanner;
public class GreatThanPrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        
        int max=a[0];
        System.out.print(max+" ");
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
                System.out.print(max+" ");
            }
            
        }


    }
}