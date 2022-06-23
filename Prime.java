import java.util.*;
public class Prime {

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
       boolean a= isPrime(b);
       System.out.println(a);
       sc.close();
    }
}
