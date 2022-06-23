import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuffer s=new StringBuffer(sc.nextLine());
        
       
        int rev=0;
        while (n>0) {
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(s.reverse());
        sc.close();
        System.out.println(rev);
    }
}
