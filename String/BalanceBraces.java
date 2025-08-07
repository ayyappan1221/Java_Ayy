import java.util.Scanner;

public class BalanceBraces{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();

        char[] stack = new char[str.length()];
        int top = -1;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                stack[++top]=ch;
            }
            else if(ch=='}'||ch==')'||ch==']'){
                if(top==-1){
                    System.out.print("Not Balanced");
                    return;
                }
                char o=stack[top--];
                if((ch=='}'&&o!='{')||(ch==')'&&o!='(')||(ch==']'&&o!='[')){
                    System.out.print("Not Balanced");
                    return;
                }
            }
        }
        sc.close();
        if (top == -1) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}


