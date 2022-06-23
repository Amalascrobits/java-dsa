public class Linear_Search_String {
    static boolean Linear_search_char(String s,char c){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String s="Amala";
        char c='p';
        boolean b=Linear_search_char(s,c);
        System.out.println(b);
    }
}
