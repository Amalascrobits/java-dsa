public class All_prime {

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void range(int a,int b){
        for(int i=a;a<=b;a++){
            if(isPrime(i)==true){
                System.out.println(i+"\n");
            }
        }
    }


    public static void main(String[] args) {

        range(1,10);
        
    }
}
