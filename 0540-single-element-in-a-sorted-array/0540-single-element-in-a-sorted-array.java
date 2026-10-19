class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            x=nums[m];
            if(m!=nums.length-1 && nums[m+1]==x){
                if((e-m)%2==0){
                    s=m+2;
                }
                else{
                    e=m-1;
                }
            }
            else if(m!=0 && nums[m-1]==x){
                if((m-s)%2==0){
                    e=m-2;
                }
                else{
                    s=m+1;
                }
            }
            else{
                return x;
            }
        }
        return -1;
    }
}