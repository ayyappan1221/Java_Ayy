import java.util.Scanner;

public class SumofChar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int s=0;
        sc.close();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);           
            s+=(int)ch;            
        }
        System.out.print(s);
   }
}
