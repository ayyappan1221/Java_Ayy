import java.util.Scanner;
public class LongestShortestPalindrome {
    public static boolean IsPalindrome(String w){
        int n=w.length();
        int i=0,j=n-1;
        while(i<j){
            if(w.charAt(i)!=w.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static String Long_Palindrome(String str){
        int n=str.length();
        String w="",l="";
        for(int i=0;i<=n;i++){           
            if(i==n||str.charAt(i)==32){
                if(IsPalindrome(w)&&w.length()>l.length()){
                    l=w;
                }
                w="";
            }
             else{
                w+=str.charAt(i);
            }            
        }
        return l;
    }
    public static String Short_Palindrome(String str){
        int n=str.length();
        String w="",s=str;        
        for(int i=0;i<=n;i++){            
            if(i==n||str.charAt(i)==32){
                if(IsPalindrome(w)&&w.length()<s.length()){
                    s=w;
                }
                w="";
            }
            else{
                w+=str.charAt(i);
            }            
        }
        return s;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String long1=Long_Palindrome(str);
        String short1=Short_Palindrome(str);
        System.out.println(long1);
        System.out.println(short1);

        sc.close();

    }
}
