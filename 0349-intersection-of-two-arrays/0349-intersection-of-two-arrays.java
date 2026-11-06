class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k = Math.min(nums1.length,nums2.length);
        int [] result = new int[k];
        int i=0;int j =0;int l=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(l==0 || result[l-1]!=nums1[i]){
                    result[l]=nums1[i];
                    l++;}
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                if(j<nums2.length-1){
                    j++;
                }
                else{
                    i++;
                }
            }
            else if(nums1[i]<nums2[j]){
                if(i<nums1.length-1){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        return Arrays.copyOf(result,l);
    }
}