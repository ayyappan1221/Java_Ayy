import java.util.Scanner;
public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String r = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (i == 0 && ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            } 
            else if (i == 0 && ch >= 'A' && ch <= 'Z') {
            } 
            else if (i > 0 && str.charAt(i - 1) == ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32);
                }
            } 
            else {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }
            }

            r = r + ch;
        }
        System.out.print(r);
    }
}
