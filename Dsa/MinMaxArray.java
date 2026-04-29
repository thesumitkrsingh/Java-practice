package Dsa;
//ss
public class MinMaxArray {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int n= nums.length;
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
           if(nums[i]<nums[min]){
               min=i;
           }
           if(nums[i]>nums[max]){
               max=i;
           }

        }
        System.out.println(min);
        System.out.println(max);
    }
}
