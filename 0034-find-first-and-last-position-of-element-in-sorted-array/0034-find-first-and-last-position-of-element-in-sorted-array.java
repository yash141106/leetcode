class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int index1=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]<target){
                s=m+1;
            }
            else if(nums[m]>target){
                e=m-1;
            }
            else if(nums[m]==target) {
                index1=m;
                e=m-1;
            }
            else{
                index1=-1;
            }
        }
        if(index1==-1){
            return new int[]{-1,-1};
        }
        int st = index1+1;
        int en = nums.length-1;
        int index2=index1;
        while(st<=en){
            int m = st+(en-st)/2;
            if(nums[m]<target){
                st=m+1;
            }
            else if(nums[m]>target){
                en=m-1;
            }
            else if(nums[m]==target){
                index2=m;
                st=m+1;
            }
            else{
                index2=-1;
            }
        }
        return new int[] {index1,index2};
    }
}