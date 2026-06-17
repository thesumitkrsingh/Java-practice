
package Dsa;

public class ArrayIsSorted {
    public static void main(String[] args){
       int[] arr={1,2,3,4,5};
       for(int i=0;i<arr.length;i++){
           if(arr[i]<arr[i+1]){
               int sort=arr[i];
           }
       }
        System.out.println("arr is sorted ");
    }
}
