import java.util.Scanner;
public class WordCount {
   public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int c=1;
        sc.close();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch==32&&i!=n-1&&i!=0){
                c++;
            }
        }
        System.out.print(c);
   } 
}