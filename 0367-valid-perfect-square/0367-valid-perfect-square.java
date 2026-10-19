class Solution {
    public boolean isPerfectSquare(int num) {
        int n=num/2;
        int s=1;
        int e=n;
        if(num<2){
            return true;
        }
        while(s<=e){
            int m = s+(e-s)/2;
            long sq = (long) m*m;
            if(sq<num){
                s=m+1;
            }
            else if(sq>num){
                e=m-1;
            }
            else if(sq==num){
                return true;
            }
        }
        return false;
    }
}