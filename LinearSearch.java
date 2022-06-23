import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int searchRange(int []arr,int target,int s,int e){
        if(arr.length==0){
            return -1;
        }
        for(int i=s;i<e;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={10,2,3,4,4,5,6,7,8,9};
        for (int i = 0; i < args.length; i++) {
            arr[i]=sc.nextInt();
        }
        int a= searchRange(arr, 10, 2, 7);
        System.out.println(a);
     
        sc.close();
    }
}
