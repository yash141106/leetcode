class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for(int j =0;j<nums.length;j++){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[j] && i<j){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}