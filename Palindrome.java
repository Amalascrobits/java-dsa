public class Palindrome {
    static boolean isPalindrome(int n){
        int i=n;
        int rev=0;
        while (n>0) {
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        if(i==rev){
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {

        boolean a=isPalindrome(1221);
        System.out.println(a);
        
    }
}
