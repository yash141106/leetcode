class Solution {
    public boolean search(int[] nums, int target) {
        int k=nums[0];
        int s=0;
        int e=nums.length-1;
        int r=0;
        while(s<e){
            int m = s+(e-s)/2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else if (nums[m] < nums[e]) {
                e = m;
            } else {
                if (nums[e - 1] > nums[e]) {
                    s = e;
                    break;
                }
                e--;
            }
        }
        r = s;
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
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}