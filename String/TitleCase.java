import java.util.Scanner;
public class TitleCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int nstr = str.length();
        char r = ' '; 
        for(int i = 0; i < nstr; i++) {
            char ch = str.charAt(i);
            if(i == 0 && (ch >= 97 && ch <= 122)) {
                int tch = (int)ch - 32;
                ch = (char)tch;
                r = ch;
            }
            else if(ch == 32) {
                r = ch;
            }
            else if((str.charAt(i - 1) == 32) && (ch >= 97 && ch <= 122)) {
                int tch = (int)ch - 32; 
                ch = (char)tch;
                r = ch;
            }
            else {
                r = ch;
            }
        }
        System.out.print(r);
    }
}
