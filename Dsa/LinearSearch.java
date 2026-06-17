package Dsa;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={4,3,2,1,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                System.out.println("found:"+arr[i]);
            }
        }
    }
}
