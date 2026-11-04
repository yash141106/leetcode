class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result = new int[2];
        int i=0;int n=nums.length;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(j+1!=nums[j]){
                result[0]=nums[j];
                result[1]=j+1;
                break;
            }
        }
        return result;
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}