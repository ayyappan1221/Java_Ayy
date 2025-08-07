import java.util.Scanner;
public class LongestWord{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String l="";
        String w="";
        for(int i=0;i<=n;i++){
            if(i==n||str.charAt(i)==32){
                if(w.length()>l.length()){
                    l=w;
                }
                w="";
            }
            else{      
                w+=str.charAt(i);        
            }
        }
         
        
        sc.close();
        System.out.print(l);
    }
}