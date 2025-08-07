
import java.util.Scanner;
public class TitleCase {
   public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String r="";
        sc.close();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(i==0 &&(ch>=97&&ch<=122)){
                int t=ch-32;
                ch=(char)t;
                r=r+ch;
            }
            else if(ch==32){r=r+ch;}
            else if((str.charAt(i-1)==32)&&(ch>=97&&ch<=122)){
                int t=ch-32;
                ch=(char)t;
                r=r+ch;
            } 
            else{
                r=r+ch;
            }   
            
        }
        System.out.print(r);
   } 
}