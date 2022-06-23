public class First_n {
    static int sum(int n){
        if(n==0){
            return 1;
        }
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
       int a= sum(10);
       System.out.println(a);
    }
    
}
