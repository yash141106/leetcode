class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        int n =nums.length;
        for(int i=0;i<n;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    int digits(int number){
        int count=0;
        if (number<0){
            number=number*-1;
        }
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }
    boolean even(int number){
        int nu=digits(number);
        if(nu%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}