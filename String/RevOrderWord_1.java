import java.util.Scanner;
public class RevOrderWord_1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String r="";
        int n=str.length();
        int c=1;
        sc.close();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==32){
                c++;
            }
        }
        String s[]=new String[c];
        int k=0;String w="";
        for(int i=0;i<=n;i++){
            if(i==n||str.charAt(i)==32){
                s[k++]=w;
                w="";
            }
            else{
                w+=str.charAt(i);
            }
        }
        int i=0,j=c-1;
        while(i<j){
            String t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;j--;
        }
        for(i=0;i<c;i++){
            r+=s[i];
            if(i!=c-1){
                r+=' ';
            }
        }
        System.out.print(r);
    }
}