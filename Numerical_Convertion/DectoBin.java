import java.util.Scanner;
public class DectoBin {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number :");
        int num=sc.nextInt();
        int rem,bin=0,place=1;
        while(num>0){
            rem=num%2;
            bin=rem*place+bin;
            place*=10;
            num/=2;
        }
        System.out.print("Binary : "+bin);
        sc.close();
    }
}
