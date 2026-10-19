class Solution {
    public int search(int[] nums, int target) {
        int k=nums[0];
        int s=0;
        int e=nums.length-1;
        int r=0;
        while(s<=e){
            int m = s+(e-s)/2;
            if(m!=0&& nums[m-1]>nums[m]){
                r=m;
                break;
            }
           else if (nums[m] > nums[nums.length-1]) {
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
           if(target >= nums[r] && target <= nums[nums.length-1]) {
                s=r; e=nums.length-1;
            }
            else {
                 s=0; e=r-1; 
                 }
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>target ){
                e=m-1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else if(nums[m]==target){
                return m;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}