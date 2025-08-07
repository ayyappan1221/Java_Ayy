import java.util.Scanner;
public class AnagramMethod_1{
    public static char[] SortCh(char[] ca,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(ca[j]>ca[j+1]){
                    char c=ca[j];
                    ca[j]=ca[j+1];
                    ca[j+1]=c;
                }
            }
        }
        return ca;
    }
    public static char[] CapstoSmall(char[]ca,int n) {
        for(int i=0;i<n;i++){
            char ch=ca[i];
            if(ch>=65&&ch<=90){
                int t=ch+32;
                ch=(char)t;
                ca[i]=ch;                
            }
        } 
        return ca;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char ca1[]=str1.toCharArray();
        int n1=str1.length();
        String str2=sc.nextLine();
        char ca2[]=str2.toCharArray();
        int n2=str2.length();  
        boolean f=true;  
        sc.close();
        if(n1!=n2){f=false;}         
        else{  
            ca1=CapstoSmall(ca1, n1);    
            ca2=CapstoSmall(ca2, n2);      
            ca1=SortCh(ca1, n1);
            str1=new String(ca1);
            ca2=SortCh(ca2, n2);
            str2=new String(ca2);
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