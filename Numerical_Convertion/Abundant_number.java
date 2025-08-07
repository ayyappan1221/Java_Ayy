import java.util.Scanner;
public class Abundant_number{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choice");
        System.out.println("1.Abundant Number Check");
        System.out.println("2.Abundant Number Series");
        System.out.print("Enter Choice :");
        int ch=sc.nextInt();
        if(ch==1){
                System.out.print("Enter num :");
            int num=sc.nextInt(),sum=0;
            for(int i=1;i<=num/2;i++){
                if(num%i==0){
                    sum+=i;
                }
            }    
            if(sum>num){System.out.print("Abundant Number");}
            else if(sum==num){System.out.print("Perfect Number");}
            else{System.out.print("Not Abundant Number");}
        }else if(ch==2){
            System.out.print("Enter n :");
            int n=sc.nextInt(),j=1;
            int num=0;
            while (j<=n) {
                int sum=0;
                for(int i=1;i<num;i+=1){
                    int d=num%i;
                    if(d==0){
                        sum+=i;
                    }
               }
               if(sum>num){System.out.print(num+" ");j++;}
                num++;
            }
        }else{
            System.out.print("Invalid Choice");
        }
        sc.close();
    }
}