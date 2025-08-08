import java.util.Scanner;
public class TitleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean cap = true;
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char newChar;
            if (ch == ' ') {
                result += ch;
                cap = true;
                continue;
            }
            if (cap) {
                if (ch >= 'a' && ch <= 'z') {
                    newChar = (char)(ch - 32);
                } else {
                    newChar = ch;
                }
                cap = false;
            } else {
                if (ch >= 'A' && ch <= 'Z') {
                    newChar = (char)(ch + 32);
                } else {
                    newChar = ch;
                }
            }
            result += newChar;
        }
        System.out.println(result);
    }
}
