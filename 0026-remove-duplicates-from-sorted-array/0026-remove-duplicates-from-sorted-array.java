class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> fu =new ArrayList<>();
        int n = nums.length;
        int k=-1000;
        for(int i=0;i<n;i++){
            if(nums[i]>k){
                fu.add(nums[i]);
            }
            k=Math.max(k,nums[i]);
        }
        for(int i=0;i<fu.size();i++){
            nums[i]= fu.get(i);
        }
        return fu.size();
    }
}
