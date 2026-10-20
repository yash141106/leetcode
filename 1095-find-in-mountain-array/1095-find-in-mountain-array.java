/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int s=0;
        int e=n-1;
        int p=0;
        while(s<e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1)){
                e=m;
            }
            else{
                s=m+1;
            }
        }
        p=s;
        s=0;
        e=p;
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==target){
                return m;
            }
            else if(mountainArr.get(m)>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        s=p+1;
        e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==target){
                return m;
            }
            else if(mountainArr.get(m)>target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}