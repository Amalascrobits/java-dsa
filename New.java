public class New {

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
        for(int v=a;v<=b;a++){
             if(v<=1){
                a++;
        }
        for(int i=2;i<v;i++){
            if(v%i==0){
            a++;
            }
            else{
                System.out.println(v);
            }
        }}
        }
    
        
    


    public static void main(String[] args) {

        range(1,10);
        
    }
}

