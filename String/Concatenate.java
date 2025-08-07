import java.util.Scanner;
public class Concatenate{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=str1+str2;
        System.out.print(str3);
        sc.close();

    }
}