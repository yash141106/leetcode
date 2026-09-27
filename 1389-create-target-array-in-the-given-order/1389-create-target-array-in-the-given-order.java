class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            target[j]=list.get(j);
        }
        return target;
    }
}