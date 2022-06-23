import java.util.*;
public class Arraylist {
    static void change(int []arr){
        arr[0]=99;
    }

    static void rev(int []arr){
        int m=arr.length;
        int k=arr.length-1;
        for(int i=0;i<k-(m/2)+1;i++){
            int temp=arr[k-i];
            arr[k-i]=arr[i];
            arr[i]=temp;
        }
       



    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        System.out.println(Arrays.toString(arr));
        // change(arr);
        // for( int i:arr){
        //     System.out.print(i+" ");
        // }
        rev(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    
}
