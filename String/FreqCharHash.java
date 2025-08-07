import java.util.Scanner;
public class FreqCharHash{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char ch[]=str.toCharArray();
        int h[]=new int[256];
        sc.close();
        for(int i=0;i<n;i++){
            h[ch[i]]++;
            
        }
        for(int i=0;i<n;i++){
            if(h[ch[i]]!=0&&ch[i]!=32){
                System.out.println(ch[i]+"->"+h[ch[i]]);
            }
            h[ch[i]]=0;
        }

    }
}