class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1]&& arr[m]>arr[m-1]){
                return m;
            }
            else if(arr[m]<arr[m+1]){
                s=m;
            }
            else{
                e=m;
            }
        }
        return -1;
    }
}