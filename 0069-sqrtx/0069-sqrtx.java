class Solution {
    public int mySqrt(int x) {
        int n=x/2;
        int s=1;
        int e=n;
        if(x<2){
            return x;
        }
        while(s<=e){
            int m = s + (e-s)/2;
            if(m>x/m){
                e=m-1;
            }
            else if(m<=x/m && (m+1)>x/(m+1)){
                return m;
            }
            else if(m<x/m){
                s=m+1;
            }
        }
        return -1;
    }
}