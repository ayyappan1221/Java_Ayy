import java.util.Scanner;

public class AnagramMethod_2 {
    public static String CapstoSmall(String str,int n) {
        String res="";
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            if(c>=65&&c<=90){
                int t=c+32;
                c=(char)t;
                res+=c;
                              
            }
            else{
                res+=c;
            }
        } 
        return res;
    }
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int n1=str1.length();
        int n2=str2.length();
        str1=CapstoSmall(str1, n1);
        str2=CapstoSmall(str2, n2);
        int h[]=new int[256];
        sc.close();
        boolean f=true;
        if(n1!=n2){f=false;}
        else{
            for(int i=0;i<n1;i++){
                h[str1.charAt(i)]++;
                h[str2.charAt(i)]--;            
            }
            for(int i=0;i<256;i++){
                if(h[i]!=0){
                    f=false;
                    break;
                }
            }
        }
        System.out.print(f?"Yes":"No");
    }
}
