class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        StringBuilder ar = new StringBuilder();
        for(int i=0;i<n;i++){
            ar.append('_');
        }
        for(int i=0;i<n;i++){
            ar.setCharAt(indices[i], s.charAt(i));
        }
        return ar.toString();
    }
}