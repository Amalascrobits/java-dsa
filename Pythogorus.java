public class Pythogorus {
    static boolean pythogorus_triplet(int h,int b,int p){
        int max;
        if(h>b && h>p){
        max=h;
        if(max*max == ((b*b)+(p*p))){
            return true;
        }
        return false;
        }
        else if(b> h && b>p){
            max=p;
            if(max*max == ((b*b)+(h*h))){
                return true;
            }
            return false;
        }
        else{
            max=b;
            if(max*max == ((p*p)+(h*h))){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        boolean a=pythogorus_triplet(5, 4, 3);
        System.out.println(a);
    }
}
