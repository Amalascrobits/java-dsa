import java.util.Arrays;
public class Search2d {
    static int[] search2d(int [][]arr,int t){
        if(arr.length==0){
            return new int[]{Integer.MIN_VALUE};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==t){
                    // System.out.println(i+" "+j);
                    return new int[]{i,j};
                    
                }
                
            }
        }
        return new int[]{Integer.MIN_VALUE};
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{6,7,8}};
        int target=7;
       int []s= search2d(arr, target);
       System.out.println(Arrays.toString(s));
    }
    
}
