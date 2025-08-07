import java.util.Scanner;
public class RevEachWord{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String r="";
        int n=str.length();
        int i,j=0;
        sc.close();
        for(i=0;i<=n;i++){
            if(i==n||str.charAt(i)==' '){
                for(int k=i-1;k>=j;k--){
                    r=r+str.charAt(k);
                }
                if(i!=n){
                    r=r+' ';
                }
                 j=i+1;
            }
           
        }
        System.out.print(r);
    }
}