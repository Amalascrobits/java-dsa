import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        sc.close();
        System.out.print(a);
        System.out.print("\t"+b);
        for (int i = 0; i < n; i++) {
            int temp=b;
            b=b+a;
            a=temp;
            System.out.print("\t"+b);
        }
    }
}
