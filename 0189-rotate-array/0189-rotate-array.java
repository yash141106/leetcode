class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k%n;
        int [] rot=new int[k];
        int s=0;
        for(int i=n-1;i>=n-k;i--){
            rot[s]=nums[i];
            s++;
        }
        for(int i =n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=rot[k-i-1];
        }
    }
}