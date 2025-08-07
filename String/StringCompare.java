import java.util.Scanner;

public class StringCompare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int n1=str1.length();
        String str2=sc.nextLine();
        int n2=str2.length();
        boolean f=true;
        str1=str1.trim();        
        str2=str2.trim();
        n1=str1.length();
        n2=str2.length();        
        sc.close();
        if(n1!=n2){f=false;}
        else{
            for(int i=0;i<n1;i++){
                char ch1=str1.charAt(i);
                char ch2=str2.charAt(i);
                if(ch1!=ch2){
                    f=false;
                    break;
                }              
            }
        }
        System.out.print(f?"Yes":"No");
   }
}
