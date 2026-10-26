class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int p=0;
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[m]>nums[m+1]){
                return nums[m+1];
            }
            else if(nums[m]<nums[m+1] && nums[m]>nums[e]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return nums[s];   
    }
}