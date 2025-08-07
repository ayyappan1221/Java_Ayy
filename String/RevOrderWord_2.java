import java.util.Scanner;
public class RevOrderWord_2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String r="";
        int n=str.length();
        int i,j=n-1;
        sc.close();
        for(i=n-1;i>=-1;i--){
            if(i==-1||str.charAt(i)==' '){
                for(int k=i+1;k<=j;k++){
                    r=r+str.charAt(k);
                }
                if(i!=-1){
                    r=r+' ';
                }
                 j=i-1;
            }
           
        }
        System.out.print(r);
    }
}